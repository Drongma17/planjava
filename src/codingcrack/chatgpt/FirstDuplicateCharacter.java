package codingcrack.chatgpt;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateCharacter {

    public static Character findFirstDuplicateChar(String input) {
        Set<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }

        return null; // No duplicate character found
    }

    public static void main(String[] args) {
        String input = "abcaefbd";

        Character result = findFirstDuplicateChar(input);
        if (result != null) {
            System.out.println("First duplicate character: " + result);
        } else {
            System.out.println("No duplicate characters found.");
        }
    }
}