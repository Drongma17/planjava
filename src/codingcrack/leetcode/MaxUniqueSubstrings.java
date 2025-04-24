package codingcrack.leetcode;

import java.util.*;

public class MaxUniqueSubstrings {

    public int partitionString(String s) {
        int partitions = 1;
        Set<Character> charSet = new HashSet<>();

        for (char ch : s.toCharArray()) {
            // Check if character is already in the current substring
            if (charSet.contains(ch)) {
                partitions++;      // Create a new partition
                charSet.clear();   // Reset for the new substring
            }
            charSet.add(ch);       // Add character to the set
        }

        return partitions;
    }

    public static void main(String[] args) {
        MaxUniqueSubstrings solution = new MaxUniqueSubstrings();
        
        // Example 1
        String s1 = "abac";
        System.out.println("Input 1: " + s1 + " => Output: " + solution.partitionString(s1)); // Output: 2

        // Example 2
        String s2 = "abacaba";
        System.out.println("Input 2 : " + s2 + " => Output: " + solution.partitionString(s2)); // Output: 4

        // Example 3
        String s3 = "ssssss";
        System.out.println("Input 3 : " + s3 + " => Output: " + solution.partitionString(s3)); // Output: 6
    }
}