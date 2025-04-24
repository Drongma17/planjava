package com.chatgpt.problemsolving;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            // Simulating a long-running task
            Thread.sleep(2000);
            return 42;
        });

        try {
            System.out.println("Task is done? " + future.isDone());
            Integer result = future.get(); // Blocks until the task completes
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }





        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            // Simulating a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        future1.thenApply(result -> result * 2)       // Transform result
                .thenAccept(result -> System.out.println("Result: " + result)) // Consume result
                .exceptionally(e -> {
                    System.out.println("Error: " + e.getMessage());
                    return null;
                });





        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 50);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> 20);

        future2.thenCombine(future2, (f2, f3) -> f2 + f3)
                .thenAccept(sum -> System.out.println("Sum: " + sum));




    }
}
