package codingcrack.springmanipulation;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(map);
    }
}