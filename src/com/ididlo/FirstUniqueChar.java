package com.ididlo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstUniqueChar {

    public static Character findFirstNonRepeating(String str){

        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> orderQueue = new LinkedList<>();


        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
            orderQueue.add(ch);
        }

        while (!orderQueue.isEmpty()){
            char ch = orderQueue.poll();
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String s ="swiss";
        Character result = findFirstNonRepeating(s);
        if(result == null){
            System.out.println("there is no first non-repeating character ");
        }else {
            System.out.println("first non-repeating character is = " + result);
        }
    }

}
