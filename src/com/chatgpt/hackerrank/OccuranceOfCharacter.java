package com.chatgpt.hackerrank;


  // Lilah has a string, s, of lowercase English letters that she repeats infinitely many times.
// Given an integer n, the task is to determine the number of occurrences of the letter 'a' within
// the first n characters of this infinitely repeated string.

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {


    public static void main(String[] args) {

        String s = "abcacabcacabcacabcac";

        Map<Character, Integer> map = new HashMap<>();

     String b=   s.substring(0, 10);
        char[] charArray = b.toCharArray();
       for(char c: charArray){
           if(c == 'a'){
               map.put(c, map.getOrDefault(c, 0)+1);
           }
       }

     for(Map.Entry<Character, Integer> maps: map.entrySet()){
         System.out.println(maps.getKey() + " = " +maps.getValue());
     }
    }

}
