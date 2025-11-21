package codingcrack.coderbyte;



 /*
 Example 1:
Input: nums = [1,2,0]
Output: 3 Explanation: The numbers in the range [1,2] are all in the array.
Example 2:
Input: nums = [3,4,-1,1]
Output: 2Explanation: 1 is in the array but 2 is missing.


Find out firsst mising positive

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.


 */

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        
        return n + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive solver = new FirstMissingPositive();
        System.out.println(solver.firstMissingPositive(new int[]{1, 2, 0})); // 3
        System.out.println(solver.firstMissingPositive(new int[]{3, 4, -1, 1})); // 2
        System.out.println(solver.firstMissingPositive(new int[]{7, 8, 9, 11, 12})); // 1
    }
}
