package com.chatgpt.problemsolving;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class FlightClient {

    // Making a simple asynchronous GET request to a flight API
    public static CompletableFuture<Void> fetchFlightDataAsync() {
        // Create HTTP Client
        var client = HttpClient.newHttpClient();

        // Create HTTP Request
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/flights"))
                .header("Accept", "application/json")
                .build();

        // Send the request asynchronously
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println("Response Code: " + response.statusCode());
                    System.out.println("Response Body: " + response.body());
                    return response.body();
                })
                .thenAccept(body -> {
                    // Process the response body (JSON, XML, etc.)
                    System.out.println("Flight Data: " + body);
                });
    }

    public static void main(String[] args) {
        fetchFlightDataAsync().join();  // Trigger async call and wait for completion
    }
}
