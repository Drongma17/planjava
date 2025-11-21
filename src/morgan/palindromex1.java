package morgan;

import codingcrack.java.eazybyte.Solution;

public class palindromex1 {

    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) return "";

        char[] arr = palindrome.toCharArray();

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
        }

        // If all first half characters are 'a'
        arr[n - 1] = 'b';
        return new String(arr);
    }

    // Test cases
    public static void main(String[] args) {
        palindromex1 solution = new palindromex1();

        System.out.println(solution.breakPalindrome("abccba")); // "aaccba"
        System.out.println(solution.breakPalindrome("a"));      // ""
        System.out.println(solution.breakPalindrome("aaa"));    // "aab"
        System.out.println(solution.breakPalindrome("aba"));    // "abb"
        System.out.println(solution.breakPalindrome("procobal")); // "accola" (from example)
    }
}
