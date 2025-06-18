package reviews.desparate;

import java.util.*;

public class MapComparison {
    public static void main(String[] args) {
        // HashMap: No specific order
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("b", "Banana");
        hashMap.put("a", "Apple");
        hashMap.put("c", "Cherry");
        System.out.println("HashMap: " + hashMap);

        // TreeMap: Keys in sorted order
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("b", "Banana");
        treeMap.put("a", "Apple");
        treeMap.put("c", "Cherry");
        System.out.println("TreeMap: " + treeMap);

        Map<String, String> syncHashMap = Collections.synchronizedMap(new HashMap<>());

        SortedMap<String, String> syncTreeMap = Collections.synchronizedSortedMap(new TreeMap<>());


    }
}
