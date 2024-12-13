package com.threads.executor;

import java.util.concurrent.*;

public class ExecutorFrameworkExample {

    public static void main(String[] args) throws InterruptedException {

        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Create a list of tasks to be executed
        // Here, we create a list of 10 tasks (Runnable objects)
        // Each task will print a message and sleep for a short time
        // This is a simplified example, real-world tasks would be more complex
        // and potentially involve I/O or CPU-intensive operations.
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

        // Shutdown the executor service
        executor.shutdown();

        // Wait for all tasks to complete
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("All tasks finished.");
    }
}