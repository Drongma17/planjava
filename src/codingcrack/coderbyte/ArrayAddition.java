package codingcrack.coderbyte;

import java.util.ArrayList;
import java.util.List;

public class ArrayAddition {

    public static String ArrayAddition(int[] arr) {
        if (arr.length == 0) return "false";

        // Find the largest number
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create list without the largest number
        List<Integer> numbers = new ArrayList<>();
        boolean maxRemoved = false;
        for (int num : arr) {
            if (num == max && !maxRemoved) {
                maxRemoved = true;
            } else {
                numbers.add(num);
            }
        }

        // Use recursive approach to handle negative numbers
        return canSumToTarget(numbers, max, 0) ? "true" : "false";
    }

    private static boolean canSumToTarget(List<Integer> numbers, int target, int index) {
        // Base cases
        if (target == 0) return true;
        if (index >= numbers.size()) return false;

        // Include current number in the sum
        if (canSumToTarget(numbers, target - numbers.get(index), index + 1)) {
            return true;
        }

        // Exclude current number from the sum
        if (canSumToTarget(numbers, target, index + 1)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(ArrayAddition(new int[]{5, 7, 16, 1, 2}));    // Output: false
        System.out.println(ArrayAddition(new int[]{3, 5, -1, 8, 12}));   // Output: true
        System.out.println(ArrayAddition(new int[]{4, 6, 23, 10, 8}));   // Output: true
        System.out.println(ArrayAddition(new int[]{1, 2, 3, 4}));        // Output: false
        System.out.println(ArrayAddition(new int[]{10, -5, 15, 20}));    // Output: true (10 + -5 + 15 = 20)
    }
}