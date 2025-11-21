package com.chatgpt.hackerrank;

import java.util.stream.IntStream;

public class RepeatedString {

    public static long countAInRepeatedString(String s, long n) {
        // Count the number of 'a' in the original string
        long countInS = s.chars().filter(ch -> ch == 'a').count();

        // Calculate how many times the string fully repeats in n characters
        long fullRepeats = n / s.length();

        // Calculate the remainder characters
        long remainder = n % s.length();

        // Count 'a' in the substring of the remainder
        long countInRemainder = s.substring(0, (int)remainder)
                                   .chars()
                                   .filter(ch -> ch == 'a')
                                   .count();

        // Total count = full repeats * count in s + count in remainder
        return fullRepeats * countInS + countInRemainder;
    }

    // Main method to test the code
    public static void main(String[] args) {
        String s = "abcac";
        long n = 10;

        long result = countAInRepeatedString(s, n);
        System.out.println("Number of 'a' in first " + n + " characters: " + result);
    }
}
