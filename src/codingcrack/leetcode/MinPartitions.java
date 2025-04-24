package codingcrack.leetcode;

import java.util.HashSet;

public class MinPartitions {
    public int minPartitions(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        HashSet<Character> charSet = new HashSet<>();
        int partitionCount = 1; // Start with one partition

        for (char c : s.toCharArray()) {   // abac
            // If character already exists in the current set, create a new partition
            if (charSet.contains(c)) {
                partitionCount++;
                charSet.clear(); // Clear for the next partition
            }
            charSet.add(c);
        }

        return partitionCount;
    }

    // Main function to test the code
    public static void main(String[] args) {
        MinPartitions solution = new MinPartitions();
        
        System.out.println(solution.minPartitions("abac")); // Output: 2
        System.out.println(solution.minPartitions("aabbcc")); // Output: 3
        System.out.println(solution.minPartitions("abcd")); // Output: 1
    }
}