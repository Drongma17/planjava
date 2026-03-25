package com.threads.sumo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureAdvanced {

    private static final ExecutorService executor =
            Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws Exception {

        CompletableFuture<Void> pipeline =
                retryAsync(CompletableFutureAdvanced::fetchData, 3)
                .orTimeout(2, TimeUnit.SECONDS)
                .thenApply(data -> {
                    System.out.println("Processing: " + data);
                    return processData(data);
                })
                .thenCompose(processed -> saveToDB(processed))
                .exceptionally(ex -> {
                    System.err.println("Pipeline failed: " + ex.getMessage());
                    return null;
                })
                .thenRun(() -> System.out.println("Pipeline finished"));

        pipeline.get(); // Keep main alive
        executor.shutdown();
    }

    // -----------------------------
    // Step 1: Fetch Data (Async)
    // -----------------------------
    private static CompletableFuture<String> fetchData() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(500);
            System.out.println("Fetched data");
            return "raw-data";
        }, executor);
    }

    // -----------------------------
    // Step 2: Process Data (Sync)
    // -----------------------------
    private static String processData(String data) {
        sleep(300);
        return data.toUpperCase();
    }

    // -----------------------------
    // Step 3: Save to DB (Async)
    // -----------------------------
    private static CompletableFuture<Boolean> saveToDB(String processed) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(400);
            System.out.println("Saved to DB: " + processed);
            return true;
        }, executor);
    }

    // -----------------------------
    // Retry Helper
    // -----------------------------
    public static <T> CompletableFuture<T> retryAsync(
            Supplier<CompletableFuture<T>> task, int retries) {

        return task.get().handle((result, ex) -> {
            if (ex == null) {
                return CompletableFuture.completedFuture(result);
            }
            if (retries > 0) {
                System.out.println("Retrying... attempts left: " + retries);
                return retryAsync(task, retries - 1);
            }
            CompletableFuture<T> failed = new CompletableFuture<>();
            failed.completeExceptionally(ex);
            return failed;
        }).thenCompose(f -> f);
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (Exception ignored) {}
    }
}
