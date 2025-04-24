package com.chatgpt.problemsolving;

import java.util.*;
import java.util.stream.Collectors;

/*
write a java 8 code to count the maximum appearing string in given sentence?
 */

public class MaxAppearingString {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange apple banana orange banana";

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Use Java 8 Streams to count the occurrences of each word
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Find the word with the maximum occurrences
        Optional<Map.Entry<String, Long>> maxEntry = wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // Print the result
        if (maxEntry.isPresent()) {
            System.out.println("Word with the maximum occurrences: " + maxEntry.get().getKey());
            System.out.println("Occurrences: " + maxEntry.get().getValue());
        } else {
            System.out.println("No words found in the sentence.");
        }
    }
}