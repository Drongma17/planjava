package com.thonglam.javatechie.stream.removeduplicate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        List<Integer> withDupes = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50, 50,50,50);

        System.out.println("List the duplicate : "+ withDupes);
        withDupes.stream().distinct().collect(Collectors.toList()).forEach(i->System.out.print(i+" "));


        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
