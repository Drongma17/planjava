package codingcrack.coderbyte;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {
    // Task: Sum an array using ForkJoin
    static class SumTask extends RecursiveTask<Long> {
        private static final int THRESHOLD = 5;
        private int[] numbers;
        private int start, end;

        SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            // If task is small enough → compute directly
            if (end - start <= THRESHOLD) {
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += numbers[i];
                }
                return sum;
            } else {
                // Split task into two subtasks
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(numbers, start, mid);
                SumTask rightTask = new SumTask(numbers, mid, end);

                // Fork subtasks
                leftTask.fork();
                long rightResult = rightTask.compute(); // compute right directly
                long leftResult = leftTask.join();      // wait for left result

                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // fill with 1..20
        }

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(numbers, 0, numbers.length);

        long result = pool.invoke(task);
        System.out.println("Sum: " + result); // 210 (1+2+...+20)
    }
}
