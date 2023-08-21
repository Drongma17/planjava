package com.thonglam.amazon;

import java.util.HashMap;

public class NonRepeatingCharByHashMap {


    char firstNonRepeatingChara(String s)
    {
        HashMap<Character, Integer> char_counts= new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(char_counts.containsKey(c)){
                char_counts.put(c, char_counts.get(c)+1);
                System.out.println(char_counts.get(c));
            }else {
                char_counts.put(c, 1);
            }
        }
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(char_counts.get(c) ==1)
                return c;
        }
        return '_';
    }


    public static void main(String[] args) {
        NonRepeatingCharByHashMap nonRepeat=new NonRepeatingCharByHashMap();
        nonRepeat.firstNonRepeatingChara("aabbbfcccccd");
//        System.out.println(nonRepeat.firstNonRepeatingChara("aabbbfcccccd"));
    }
}
