package qualityassurance;

import java.util.concurrent.*;

class SumTask extends RecursiveTask<Integer> {
    int[] arr;
    int start, end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr; this.start = start; this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i < end; i++) sum += arr[i];
            return sum;
        }

        int mid = (start + end) / 2;
        SumTask left = new SumTask(arr, start, mid);
        SumTask right = new SumTask(arr, mid, end);
        left.fork();
        return right.compute() + left.join();
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new SumTask(nums, 0, nums.length));
        System.out.println("Total Sum: " + result);
    }
}