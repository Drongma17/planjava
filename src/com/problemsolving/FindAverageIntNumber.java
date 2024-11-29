package com.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageIntNumber {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50);

        double average = integers.stream().mapToInt(num -> num.intValue())
                .average()
                        .getAsDouble();

        System.out.println("average is "+average);
    }
}
