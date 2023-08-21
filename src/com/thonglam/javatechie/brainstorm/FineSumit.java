package com.thonglam.javatechie.brainstorm;

import java.util.stream.IntStream;

public class FineSumit {

    public static void main(String[] args) {

        long start =0;
        long end =0;

        start =System.currentTimeMillis();
        IntStream.range(1, 10).forEach(System.out::println);
        end =System.currentTimeMillis();
        System.out.println("time lapse in normal :"+ (end - start) + " millisecond ");


        start =System.currentTimeMillis();
        IntStream.range(1, 10).parallel().forEach(System.out::println);
        end =System.currentTimeMillis();
        System.out.println("time lapse in parallel :"+ (end - start) + " millisecond ");
    }
}



