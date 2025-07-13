package codingcrack.springmanipulation;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";

        String s2 = "silent";

        char[] a1 = s1.toCharArray();

        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        System.out.println(a1);
        Arrays.sort(a2);
        System.out.println(a2);

        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram");
    }
}