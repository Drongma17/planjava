package com.chatgpt.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

 /*
 write a java 8 program to group a list of strings base on their length and count the number of strings in each group.
  */

public class GroupStringsByLength {
    public static void main(String[] args) {
        // List of strings
        List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "peach", "grape", "fig");

        // Group strings by their length and count the number of strings in each group
        Map<Integer, Long> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        // Print the result
        groupedByLength.forEach((length, count) -> 
                System.out.println("Length: " + length + ", Count: " + count));
    }
}