package com.udemy;

import java.util.*;
import java.util.stream.Collectors;



public class ImplementFlatMap {


    public static void main(String[] args) {


        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four"),
                Arrays.asList("five", "six")
        );


        List<String> collect = listOfList.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());


        List<String> result = collect.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println("List of List are : "+ result);


        Optional<Integer> reduce = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().reduce((a, b) -> a + b);
        System.out.println("reduce : "+reduce);


        Optional<Integer> max = Arrays.asList(3, 4, 54, 32, 47, 78, 43, 98, 23).stream().max(Integer::compareTo);
        System.out.println("max integer is : " +max);


        String collect1 = Arrays.asList("apple", "banana", "cherry", "orange").stream().collect(Collectors.joining(", "));
        System.out.println(" joining : "+collect1);


        String collect2 = Arrays.asList("apple", "banana", "cherry", "orange").stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println("Joining 2 : " + collect2);

    }
}
