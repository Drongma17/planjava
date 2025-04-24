package com.leetcode;

 /*
 write a java code to find longest common prefix string among an array of strings
  */


public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Sort the array
        java.util.Arrays.sort(strs);

        // Compare the first and last strings in sorted array
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        // Find the common prefix between first and last string
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix(words)); // Output: "fl"
    }
}