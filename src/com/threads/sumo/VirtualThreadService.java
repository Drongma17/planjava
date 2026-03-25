package com.threads.sumo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadService {

    private static final HttpClient httpClient = HttpClient.newHttpClient();

    public static void main(String[] args) {

        // Production-style executor: one virtual thread per request
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        try (executor) {

            for (int i = 0; i < 500_000; i++) {
                int requestId = i;

                executor.submit(() -> handleRequest(requestId));
            }

            System.out.println("All tasks submitted at " + LocalDateTime.now());
        }
    }

    // -----------------------------
    // Request Handler (like a REST endpoint)
    // -----------------------------
    private static void handleRequest(int requestId) {
        try {
            log("Handling request " + requestId);

            String apiResponse = callExternalApi(requestId);
            String processed = process(apiResponse);
            saveToDatabase(processed);

            log("Completed request " + requestId);

        } catch (Exception e) {
            log("Error in request " + requestId + ": " + e.getMessage());
        }
    }

    // -----------------------------
    // Simulate external API call
    // -----------------------------
    private static String callExternalApi(int id) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/delay/1"))
                .build();

        HttpResponse<String> response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return "API Response for " + id + ": " + response.body();
    }

    // -----------------------------
    // Simulate processing
    // -----------------------------
    private static String process(String data) {
        return data.toUpperCase();
    }

    // -----------------------------
    // Simulate DB write
    // -----------------------------
    private static void saveToDatabase(String processed) {
        log("Saved to DB: " + processed.substring(0, 30) + "...");
    }

    private static void log(String msg) {
        System.out.println(Thread.currentThread() + " | " + msg);
    }
}
