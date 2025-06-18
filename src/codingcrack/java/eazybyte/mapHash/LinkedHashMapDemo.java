package codingcrack.java.eazybyte.mapHash;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Inserting elements
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Orange");

        // Removing an element
        linkedHashMap.remove(2);

        // Displaying LinkedHashMap contents
        System.out.println("LinkedHashMap after operations: " + linkedHashMap);
    }
}