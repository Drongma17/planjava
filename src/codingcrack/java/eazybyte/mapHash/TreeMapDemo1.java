package codingcrack.java.eazybyte.mapHash;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserting elements
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Removing an element
        treeMap.remove(2);

        // Displaying TreeMap contents
        System.out.println("TreeMap after operations: " + treeMap);
    }
}