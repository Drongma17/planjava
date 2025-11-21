package com.ididlo;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k > n

        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated Array by " + k + " steps: " + Arrays.toString(arr));
    }
}
