package codingcrack.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class MultiValueMapExample {
    public static void main(String[] args) {
        Map<String,String> treeMap1 = new TreeMap<>();
        Map<String, List<String>> treeMap = new TreeMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<11; i++){
            treeMap.computeIfAbsent("key-"+i, k->new ArrayList<>()).add("Value"+i);
            treeMap1.put("key-"+i, "Value-"+i);
           // treeMap.computeIfAbsent("key-"+1, k->new ArrayList<>()).add("Value-"+i);
            list.add("Value-"+i);
        }

        // Add values using computeIfAbsent
        treeMap.computeIfAbsent("Ngawang", k -> new ArrayList<>()).add("Phaduk");
        treeMap.computeIfAbsent("Tashi", k -> new ArrayList<>()).add("Tsakor");
        treeMap.computeIfAbsent("Sonam", k -> new ArrayList<>()).add("Tsakor");
        treeMap.computeIfAbsent("Ngawang", k -> new ArrayList<>()).add("Tsakor");
        treeMap.computeIfAbsent("Trinley", k -> new ArrayList<>()).add("Shador");
        treeMap.computeIfAbsent("Pema", k -> new ArrayList<>()).add("Phaduk");
        treeMap.computeIfAbsent("Ngawang", key -> new ArrayList<>()).add("Rabai");
        treeMap.computeIfAbsent("apple", k->new ArrayList<>()).add("Iron-Fruit");
        treeMap.computeIfAbsent("Sherab", k->new ArrayList<>()).add("Gyaltso");

        for(Map.Entry<String, String> map : treeMap1.entrySet()){
            System.out.println(map.getKey() + "   == "+map.getValue());
        }

        // Retrieve all values for "Ngawang" using Java 8
        List<String> valuesForNgawang = treeMap.getOrDefault("Ngawang", Collections.emptyList());
        System.out.println();
        System.out.println("Values for Ngawang: " + valuesForNgawang);

        System.out.println();
        for(String str: list){
            System.out.println("String Value : "+str);
        }
    }
}