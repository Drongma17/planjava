package com.interview.javatechie.collections;

import java.util.concurrent.*;

public class ForkJoinPoolExample {
    static class SimpleTask extends RecursiveAction {
        private int taskId;

        SimpleTask(int taskId) { this.taskId = taskId; }

        @Override
        protected void compute() {
            System.out.println("Running task " + taskId + " by " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(3);
        for (int i = 1; i <= 5; i++) {
            pool.submit(new SimpleTask(i));
        }
        pool.shutdown();
    }
}
