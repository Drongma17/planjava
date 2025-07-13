package codingcrack.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapImplement {


    public static void main(String[] args) {


        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Ngawang", "Phaduk");
        treeMap.put("Tashi", "Tsakor");
        treeMap.put("Sonam", "Tsakor");
        treeMap.put("Ngawang", "Tsakor");
        treeMap.put("Trinley", "Shador");
        treeMap.put("Pema", "Phaduk");

//        for(Map.Entry<String, String> home: treeMap.entrySet()){
//            System.out.println("Name is "+ home.getKey()+ "   Born at " + home.getValue());
//        }
//
//        treeMap.entrySet().stream().forEach(System.out::println);
//        treeMap.entrySet().stream().map(
//                home->home.getValue().equalsIgnoreCase(
//                        "Phaduk")).forEach(System.out::println);

        // Retrieve key whose value is "Phaduk"
        Optional<Map.Entry<String, String>> result = treeMap.entrySet()
                .stream()
                .filter(entry -> "Phaduk".equals(entry.getValue()))
                .findFirst();

        result.ifPresent(entry ->
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));


        List<String> matchingKeys = treeMap.entrySet()
                .stream()
                .filter(entry -> "Phaduk".equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        List<String> collect = treeMap.entrySet().stream().filter(name -> "Ngawang".equalsIgnoreCase(name.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());


        System.out.println("Keys with value 'Phaduk': " + matchingKeys);
        System.out.println("Keys with  'Ngawang': " +  collect);

    }

}
