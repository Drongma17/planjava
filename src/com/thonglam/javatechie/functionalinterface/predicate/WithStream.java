package com.thonglam.javatechie.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WithStream {

    public static void main(String[] args) {

//        Predicate<Integer> predicate = t-> t % 2 ==0;
//
//        System.out.println(predicate.test(5));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//        list1.stream().filter(predicate).forEach(t-> System.out.println("Only Even Number .."+t));
        list1.stream().filter(t-> t % 2 ==0).forEach(t-> System.out.println("Only Even Number .."+t));
    }
}
