package com.ididlo;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {

    /**
     * Finds the length of the longest substring in 's' without repeating characters.
     * Uses the Sliding Window technique with a HashMap.
     * * @param s The input string.
     * @return The length of the longest non-repeating substring.
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // 'map' stores the most recent index of each character encountered.
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        int maxLength = 0;
        int windowStart = 0; // The left boundary of the sliding window (inclusive)

        // 'windowEnd' is the right boundary of the sliding window (inclusive)
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char currentChar = s.charAt(windowEnd);

            // 1. Check if the current character is already in the map (and within the current window)
            if (charIndexMap.containsKey(currentChar)) {
                
                // If the character is a duplicate, we must move the start of the window
                // past the *last* occurrence of this duplicate character.
                // We use Math.max to ensure 'windowStart' only moves forward
                // and doesn't backtrack if the duplicate was outside the current window.
                windowStart = Math.max(windowStart, charIndexMap.get(currentChar) + 1);
            }

            // 2. Update the map with the current character's index
            // This is crucial for correctly calculating the new 'windowStart' next time.
            charIndexMap.put(currentChar, windowEnd);

            // 3. Calculate the length of the current window and update the maximum length
            // Current window length = windowEnd - windowStart + 1
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("String: \"" + s1 + "\", Longest Substring Length: " + lengthOfLongestSubstring(s1)); // Output: 3 ("abc")

        String s2 = "bbbbb";
        System.out.println("String: \"" + s2 + "\", Longest Substring Length: " + lengthOfLongestSubstring(s2)); // Output: 1 ("b")

        String s3 = "pwwkew";
        System.out.println("String: \"" + s3 + "\", Longest Substring Length: " + lengthOfLongestSubstring(s3)); // Output: 3 ("wke" or "kew")
        
        String s4 = "abcadmbcbb";
        System.out.println("String: \"" + s4 + "\", Longest Substring Length: " + lengthOfLongestSubstring(s4)); // Output: 3 ("vdf")
    }
}