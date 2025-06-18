package com.designpattern.topcoding.top2;

public class TestThreadPool {
    public static void main(String[] args) {
        CustomThreadPoolExecutor.RejectionHandler handler = task ->
            System.out.println("Task rejected: " + task.toString());

        CustomThreadPoolExecutor executor = new CustomThreadPoolExecutor(3, 5, handler);

        for (int i = 0; i < 10; i++) {
            int taskNum = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskNum + " on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}
