package com.chatgpt.problemsolving;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesJava8 {
    public static void main(String[] args) {
        // Sample sorted integer list with duplicates
        List<Integer> sortedList = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5);

        // Call the method to remove duplicates using Java 8 Stream
        List<Integer> uniqueList = removeDuplicates(sortedList);

        // Print the result
        System.out.println("List after removing duplicates: " + uniqueList);
    }

    public static List<Integer> removeDuplicates(List<Integer> sortedList) {
        // Use a Stream to remove duplicates
        return sortedList.stream()
                         .distinct()  // Removes duplicates
                         .collect(Collectors.toList());  // Collect the result into a List
    }
}
