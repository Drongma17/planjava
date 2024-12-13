package com.threads.executor;

import java.util.concurrent.*;

public class SingleThreadExecutorExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a thread pool with only one thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            Runnable worker = () -> {
                System.out.println("Task " + taskId + " started.");
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " finished.");
            };
            executor.execute(worker);
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("All tasks finished.");
    }
}