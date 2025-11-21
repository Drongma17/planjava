package eazybyte.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEx {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Example 1: Collect elements into a List
        List<String> collectedList = words.stream()
                .collect(Collectors.toList());

        System.out.println("Collected List: " + collectedList); // Output: Collected List: [apple, banana, cherry]

        // Example 2: Concatenate elements into a single String
        String concatenatedString = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Concatenated String: " + concatenatedString); // Output: Concatenated String: apple, banana, cherry
    }
}
