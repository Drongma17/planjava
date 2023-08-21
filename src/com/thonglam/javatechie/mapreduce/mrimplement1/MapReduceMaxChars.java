package com.thonglam.javatechie.mapreduce.mrimplement1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceMaxChars {



    public static void main(String[] args) {


        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);




        List<String> strongness = Arrays.asList("ngawang", "yeshi", "sonam", "kunsang","pema");
        Optional<String> s = strongness.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(s);
    }


}
