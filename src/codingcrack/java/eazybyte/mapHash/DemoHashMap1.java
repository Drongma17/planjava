package codingcrack.java.eazybyte.mapHash;

import java.util.HashMap;

public class DemoHashMap1 {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Retrieve value by key
        System.out.println("Value associated with 'banana': " + hashMap.get("banana"));

        // Update value
        hashMap.put("apple", 25);

        // Remove key-value pair
        hashMap.remove("orange");

        // Iterate over entries
        System.out.println("All entries in the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}