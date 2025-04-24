package com.chatgpt.problemsolving;
/*
Write a function to find the maximum subarray sum in java
 */
public class MaxSubarraySum {

    static int maxValue(int a, int b){
        return (a >= b) ? a : b;
    }
    // Function to find the maximum subarray sum
    public static int maxSubArray(int[] nums) {
        // Handle edge case where the array is empty
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Initialize variables to track the maximum sum and the current subarray sum
        int maxSum = nums[0];  // Maximum sum found so far
        int currentSum = nums[0];  // Current subarray sum
        
        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update current sum to either current number alone or the current sum plus the number

            currentSum = maxValue(nums[i], currentSum + nums[i]);
            
            // Update the maximum sum if the current sum is greater
            maxSum = maxValue(maxSum, currentSum);
        }
        
        return maxSum;  // Return the maximum subarray sum found
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);  // Output should be 6
    }
}
