package codingcrack.coderbyte;

import java.util.HashMap;
import java.util.Map;

public class StringScramble1 {

    public static String StringScramble1(String str1, String str2) {
        // Create frequency maps for both strings
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        
        // Count character frequencies in str1
        for (char c : str1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }
        
        // Count character frequencies in str2
        for (char c : str2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }
        
        // Check if str1 has at least the required characters for str2
        for (char c : freq2.keySet()) {
            // If str1 doesn't contain a character from str2, return false
            if (!freq1.containsKey(c)) {
                return "false";
            }
            // If str1 doesn't have enough occurrences of a character, return false
            if (freq1.get(c) < freq2.get(c)) {
                return "false";
            }
        }
        
        return "true";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(StringScramble1("rkqodlw", "world"));  // Output: true
        System.out.println(StringScramble1("cdpre", "coder"));    // Output: true
        System.out.println(StringScramble1("h3llko", "hello"));   // Output: false
        System.out.println(StringScramble1("abc", "abcd"));       // Output: false
        System.out.println(StringScramble1("a", "a"));            // Output: true
    }
}