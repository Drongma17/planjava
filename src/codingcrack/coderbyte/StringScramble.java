package codingcrack.coderbyte;

public class StringScramble {

    public static String StringScramble(String str1, String str2) {
        // Since the problem states only letters (no punctuation/symbols),
        // we can use an array for better performance
        int[] charCount = new int[26]; // for lowercase letters only
        
        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Subtract counts for characters in str2
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
            // If any count becomes negative, str1 doesn't have enough of that character
            if (charCount[c - 'a'] < 0) {
                return "false";
            }
        }
        
        return "true";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(StringScramble("rkqodlw", "world"));  // Output: true
        System.out.println(StringScramble("cdpre", "coder"));    // Output: true
        System.out.println(StringScramble("h3llko", "hello"));   // Output: false
        System.out.println(StringScramble("abc", "abcd"));       // Output: false
        System.out.println(StringScramble("a", "a"));            // Output: true
    }
}