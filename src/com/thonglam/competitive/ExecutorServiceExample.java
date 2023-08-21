package com.thonglam.competitive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {


    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(10);

        executorService.execute(newRunnable("Task 1"));
        executorService.execute(newRunnable("Task 2"));
        executorService.execute(newRunnable("Task 3"));

        executorService.shutdown();
    }

    private static Runnable newRunnable(String s) {
        return new Runnable() {
            @Override
            public void run() {
            String completeMsg = Thread.currentThread().getName() + ":" + s;
                System.out.println(completeMsg);
            }
        };
    }
}
