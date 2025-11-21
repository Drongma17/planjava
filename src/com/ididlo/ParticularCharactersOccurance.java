package com.ididlo;

import java.util.HashMap;
import java.util.Map;

public class ParticularCharactersOccurance {


    public static Map<Character, Integer> countCharOccurance(String s, int n) {
     //  String s = "helloworldmyfriendofuspeopleiamhappy";

        Map<Character, Integer> map = new HashMap<>();

        String b = s.substring(0, n);

        char[] chars = b.toCharArray();
        for (char c : chars) {
            if (c == 'l') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "helloworldmyfriendofuspeopleiamhappy";
        Map<Character, Integer> characterIntegerMap = countCharOccurance(s, 10);
        System.out.println(characterIntegerMap);
    }
}
