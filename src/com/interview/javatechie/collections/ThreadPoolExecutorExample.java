package com.interview.javatechie.collections;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskId + " by " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
