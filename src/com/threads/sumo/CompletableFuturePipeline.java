package com.threads.sumo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturePipeline {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> pipeline =
                fetchData()                      // Step 1: Fetch
                .thenApply(data -> processData(data))   // Step 2: Process
                .thenCompose(processed -> saveToDB(processed)) // Step 3: Save
                .thenAccept(result -> System.out.println("Pipeline completed successfully"));

        // Keep main thread alive until async tasks finish
        pipeline.get();
    }

    // Simulate fetching data from API
    private static CompletableFuture<String> fetchData() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            System.out.println("Fetched data");
            return "raw-data";
        });
    }

    // Simulate processing
    private static String processData(String data) {
        sleep(800);
        System.out.println("Processed data");
        return data.toUpperCase();
    }

    // Simulate saving to DB
    private static CompletableFuture<Boolean> saveToDB(String processed) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(500);
            System.out.println("Saved to DB: " + processed);
            return true;
        });
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
