package com.chatgpt.problemsolving;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ArraySum extends RecursiveTask<Integer> {
    private final int[] array;
    private final int start;
    private final int end;

    public ArraySum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) { // Threshold for sequential execution
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }

        int mid = (start + end) / 2;
        ArraySum leftSum = new ArraySum(array, start, mid);
        leftSum.fork(); // Fork the left subtask
        ArraySum rightSum = new ArraySum(array, mid, end);
        int rightResult = rightSum.compute(); // Compute the right subtask directly
        return leftSum.join() + rightResult; // Join the left subtask and combine results
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool pool = new ForkJoinPool();
        ArraySum task = new ArraySum(numbers, 0, numbers.length);
        int sum = pool.invoke(task);
        System.out.println("Sum: " + sum);
    }
}