package com.threads.executor;

import java.util.concurrent.*;

public class UnconfigurableExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Create an unmodifiable view of the executor
        ExecutorService unconfigurableExecutor = Executors.unconfigurableExecutorService(executor); 

        // Attempt to modify the unconfigurable executor (will not compile)
        // unconfigurableExecutor.shutdown(); 

        // Use the unconfigurable executor to submit tasks
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
            unconfigurableExecutor.execute(worker);
        }

        executor.shutdown(); // Shutdown the original executor
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); 
    }
}