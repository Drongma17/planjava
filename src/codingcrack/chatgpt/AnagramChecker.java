package codingcrack.chatgpt;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String a, String b) {
        // Remove spaces and convert to lowercase
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, not an anagram
        if (a.length() != b.length()) return false;

        // Convert strings to char arrays and sort them
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // Compare sorted arrays
        return Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }
    }
}