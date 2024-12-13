package com.threads.executor;

import java.util.concurrent.*;

public class ScheduledThreadPoolExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a thread pool for scheduling tasks
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Schedule a task to run after 2 seconds
        Runnable task = () -> System.out.println("Scheduled task executed.");
        ScheduledFuture<?> future = executor.schedule(task, 2, TimeUnit.SECONDS);

        // Wait for the scheduled task to complete
        try {
            future.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}