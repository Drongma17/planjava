package com.threads.sumo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        // Only one worker thread; tasks run sequentially
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("Task A - " + Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Task B - " + Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Task C - " + Thread.currentThread().getName()));

        executor.shutdown();
    }
}
