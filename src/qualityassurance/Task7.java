package qualityassurance;

import java.util.Arrays;

public class Task7 {

    // Return true if two strings are anagrams of each other.
    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent")); // Output: true
    }
}