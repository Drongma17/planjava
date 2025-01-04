package com.leetcode;

 /*
 Write a function maxSubArray that takes an integer array nums
 as input and returns the sum of the largest contiguous subarray.
 Implement the function using a linear time complexity algorithm.
  */

public class MaxSumArray {


    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        return maxSoFar;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = MaxSumArray.maxSubArray(nums);
        System.out.println("max sum is : "+  maxSum);
    }
}
