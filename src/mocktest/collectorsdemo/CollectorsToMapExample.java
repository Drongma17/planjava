package mocktest.collectorsdemo;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMapExample {
    public static void main(String[] args) {
        Map<Integer, String> nameLengthMap = Stream.of("Alice", "Bob", "Charlie", "Charlie")
                .collect(Collectors.toMap(
                        String::length,      // Key mapper: length of the name
                        name -> name,        // Value mapper: name itself
                        (existing, replacement) -> existing // Handle duplicates
                ));

        System.out.println(nameLengthMap); // Output: {3=Bob, 5=Alice, 7=Charlie}
    }
}