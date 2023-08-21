package com.thonglam.javatechie.interviewq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachEX implements Parents {

    public String method2(){
        return "i am from FOREACHEXAMPLE class";
    }

    public static void method1(){
        System.out.println("i am printing from static method1 of ForEachEx ");
        return;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,8,9,121,13,14,14,15,16,16,65);
        // list.stream().distinct().collect(Collectors.toList()).forEach(i-> System.out.println(i));
        ForEachEX.method1();
        ForEachEX fx = new ForEachEX();
           String p1=fx.method2();
        System.out.println(p1);
        System.out.println(fx.method2());
        Parents.method1();
    }
}
