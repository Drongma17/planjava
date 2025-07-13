package codingcrack.springmanipulation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) result.append(ch);
        }

        System.out.println("Without duplicates: " + result);
    }
}