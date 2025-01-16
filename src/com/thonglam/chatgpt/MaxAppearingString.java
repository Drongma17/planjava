package com.thonglam.chatgpt;

import java.util.*;
import java.util.stream.Collectors;

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