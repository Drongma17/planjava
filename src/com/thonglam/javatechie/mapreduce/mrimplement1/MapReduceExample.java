package com.thonglam.javatechie.mapreduce.mrimplement1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        int sum=0;
        for(Integer no: numbers){
            sum = sum + no;
        }
        System.out.println(sum);


        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);


        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);


        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());


        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);


        Integer maxVal = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxVal);


        Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueWithMethodReference);

        Integer integer = numbers.stream().reduce(Integer::sum).get();
        System.out.println(integer);

    }
}
