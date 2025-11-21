package com.ididlo;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckFrequency {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> frequency = new HashMap<>();

        // Count frequency of each char in first string
        for (char c : str1.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Decrease frequency based on second string
        for (char c : str2.toCharArray()) {
            if (!frequency.containsKey(c)) return false;
            frequency.put(c, frequency.get(c) - 1);
            if (frequency.get(c) == 0) {
                frequency.remove(c);
            }
        }

        return frequency.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "Debit Card";
        String s2 = "Bad Credit";

        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are Anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
        }
    }
}
