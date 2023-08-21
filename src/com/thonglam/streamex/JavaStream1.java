package com.thonglam.streamex;

import java.util.Arrays;
import java.util.List;

public class JavaStream1 {

    public static void main(String[] args) {
        List<Integer> listOfint = Arrays.asList(11, 3, 5, 20, 4, 8, 22);

        listOfint.stream().filter(x -> x > 10).forEach(p -> System.out.println(p));
        listOfint.stream().filter(x -> x > 10).map(y -> y * y).forEach(p -> System.out.println(p));
        int sum = listOfint.stream().filter(x -> x > 10).map(y -> y * y).mapToInt(y -> y).sum();
        System.out.println(sum);



    }
}