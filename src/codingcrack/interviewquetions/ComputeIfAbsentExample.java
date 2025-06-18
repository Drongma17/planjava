package codingcrack.interviewquetions;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();

        // Using computeIfAbsent to count word occurrences
        wordCounts.computeIfAbsent("apple", k -> 0); // "apple" is not in the map, so put 0
        wordCounts.computeIfAbsent("apple", k -> wordCounts.get(k) + 1); // "apple" is now in the map, increment it
        wordCounts.computeIfAbsent("banana", k -> 1); // "banana" is not in the map, so put 1

        System.out.println(wordCounts); // Output: {banana=1, apple=1}




    }
}