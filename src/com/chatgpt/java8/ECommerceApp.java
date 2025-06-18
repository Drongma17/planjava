package com.chatgpt.java8;

import java.util.concurrent.*;
import java.util.*;

public class ECommerceApp {

    private static final ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws Exception {
        System.out.println("Starting order processing...");

        CompletableFuture<String> orderFuture = CompletableFuture.supplyAsync(() -> {
            simulateDelay("Fetching Order");
            return "Order#1234";
        }, executor);

        CompletableFuture<String> customerFuture = CompletableFuture.supplyAsync(() -> {
            simulateDelay("Fetching Customer Info");
            return "Customer: John Doe";
        }, executor);

        CompletableFuture<String> paymentFuture = CompletableFuture.supplyAsync(() -> {
            simulateDelay("Processing Payment");
            return "Payment: $199.99 SUCCESS";
        }, executor);

        // Combine all futures
        CompletableFuture<Void> allDone = CompletableFuture.allOf(orderFuture, customerFuture, paymentFuture);

        // Once all are done, continue processing
        allDone.thenRun(() -> {
            try {
                System.out.println("✅ All tasks completed:");
                System.out.println(orderFuture.get());
                System.out.println(customerFuture.get());
                System.out.println(paymentFuture.get());
            } catch (Exception e) {
                System.err.println("Error processing futures: " + e.getMessage());
            }
        }).join();

        executor.shutdown();
    }

    private static void simulateDelay(String taskName) {
        try {
            System.out.println("Started: " + taskName);
            Thread.sleep(new Random().nextInt(1000) + 500);
            System.out.println("Completed: " + taskName);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
