package com.chatgpt.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class MaxTwoRepetitions {
    public static void main(String[] args) {
        // Test arrays
        int[] arr1 = {1, 2, 3, 2, 4, 1, 5};
        int[] arr2 = {1, 1, 2, 2, 3, 3, 3}; // Invalid array: 3 repeats 3 times
        
        System.out.println("Array 1 is valid: " + isValidArray(arr1));
        System.out.println("Array 2 is valid: " + isValidArray(arr2));
    }

    // Method to check if the array is valid (max 2 repetitions of each number)
    public static boolean isValidArray(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // If any number appears more than 2 times, return false
            if (countMap.get(num) > 2) {
                return false;
            }
        }
        return true; // All numbers appear no more than twice
    }
}
