//package com.interview.linkdin.java8;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class LeveragingNewFeature {
//
//    public static void main(String[] args) {
//
//        // Create a stream
//        Stream<String> shoppingStream = Stream.of("apples", "banana", "cherries", "coffee");
//
//        // Array
//        String[] shoppingArray = new String[]{"apples", "banana", "cherries", "coffee"};
//        Stream<String> shopArray = Arrays.stream(shoppingArray);
//
//        // List
//        List<String> shoppingList = List.of("apples", "banana", "cherries", "coffee");
//
//         Stream<String> shoppingListStream = shoppingList.stream();
//
//         shoppingList.stream().forEach(System.out::println);
//         shoppingList.parallelStream().forEach(System.out::println);
//
//         // Match
//        boolean isOnlist = shoppingList.stream()
//                .anyMatch(item->item.contains("apple"));
//
//        // Filter
//        Stream<String> itemsInAlisle = shoppingList.stream().
//                filter(item ->item.startsWith("c"));
//
//        // Map
//        List<Integer> numberList = List.of(4,2,6,9,10,17,3);
//        Stream<Integer> doubleStream = numberList.stream()
//                .map((n->n*n));
//
//        // Collect
//        Stream<Integer> doubleList = (Stream<Integer>) numberList.stream()
//                .map((n->n*n))
//                .collect(Collectors.toList());
//    }
//}