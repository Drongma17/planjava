package com.chatgpt.problemsolving;

public class TwoSumEqualTarget {


//        public static int[] twoSum(int[] numbers, int target) {
//            int left = 0, right = numbers.length - 1;
//
//            while (left < right) {
//                int currentSum = numbers[left] + numbers[right];
//
//                if (currentSum == target) {
//                    return new int[] {left + 1, right + 1};  // Return 1-based indices
//                } else if (currentSum < target) {
//                    left++;
//                } else {
//                    right--;
//                }
//            }
//
//            return new int[] {};  // Return empty array if no solution is found
//        }
//
//        public static void main(String[] args) {
//            int[] numbers = {2, 7, 11, 15};
//            int target = 9;
//
//            int[] result = twoSum(numbers, target);
//
//            if (result.length > 0) {
//                System.out.println("Indices: " + result[0] + ", " + result[1]);
//            } else {
//                System.out.println("No solution found");
//            }
//        }
//    }


    public static int[] twoSum1(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum <= target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{};
    }

        public static void main(String[] args) {
            int[] numbers = {2, 7, 11, 15};
            int target = 9;

            int[] result = twoSum1(numbers, target);

            if (result.length > 0) {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No solution found");
            }
        }
}







