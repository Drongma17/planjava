package com.thonglam.javatechie.brainstorm;

import java.util.Arrays;
import java.util.List;

public class reduce1 {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1, 2, 3, 8, 9, 7, 45, 50, 90);

        Integer integer=numbers.stream().reduce(0, (a, b)->a+b);
        int number1= numbers.stream().mapToInt(i->i).sum();
        System.out.println(number1);
    }
}
