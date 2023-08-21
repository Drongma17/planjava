package com.thonglam.javatechie.functionalinterface.supply;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class GetMethodWithLamda {

//    T get();

    public static void main(String[] args) {

//        Supplier<String> supplier= ()-> "Hi Java Techie";
//        System.out.println(supplier.get());

        List<String> st1 = Arrays.asList("a","b");
//        System.out.println(st1.stream().findAny().orElseGet(supplier));
        System.out.println(st1.stream().findAny().orElseGet(()->"Hi Viewer !!! "));
    }
}
