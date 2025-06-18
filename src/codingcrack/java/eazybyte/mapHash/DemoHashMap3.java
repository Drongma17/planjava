package codingcrack.java.eazybyte.mapHash;

import java.util.HashMap;

public class DemoHashMap3 {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Iterate over values
        System.out.println("All values in the HashMap:");
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }
    }
}