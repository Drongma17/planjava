package com.ididlo;

import java.util.Arrays;

public class AnagramCheck {


    public static boolean checkAnagram(String a, String b){

        String str1 = a.replaceAll("\\s", "").toLowerCase();
        String str2 = b.replaceAll("\\s", "").toLowerCase();


        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(s1.length != s2.length){
            return false;
        }

        return Arrays.equals(s1, s2);

    }


    public static void main(String[] args) {
        System.out.println(checkAnagram("listen", "silent"));
    }
}
