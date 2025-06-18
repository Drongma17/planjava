package codingcrack.java.eazybyte.mapHash;

import java.util.Map;

public class ImmutableMapExample1 {
    public static void main(String[] args) {
        // Creating an immutable map with three key-value pairs
        Map<String, Integer> immutableMap = Map.of(
            "key1", 1,
            "key2", 2,
            "key3", 3
        );

        // Attempting to modify the immutable map will result in an UnsupportedOperationException
        // immutableMap.put("key4", 4); // This will throw UnsupportedOperationException
    }
}