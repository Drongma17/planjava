package codingcrack.java.eazybyte.mapHash;

import java.util.Map;

public class ImmutableMapExample {
    public static void main(String[] args) {
        // Creating an immutable map with more than 10 key-value pairs
        Map<String, Integer> immutableMap = Map.ofEntries(
            Map.entry("key1", 1),
            Map.entry("key2", 2),
            Map.entry("key3", 3)
            // Add more entries as needed
        );

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // immutableMap.put("key4", 4); // This will throw UnsupportedOperationException
    }
}