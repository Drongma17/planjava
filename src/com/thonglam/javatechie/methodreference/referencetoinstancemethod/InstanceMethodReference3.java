package com.thonglam.javatechie.methodreference.referencetoinstancemethod;

import java.util.function.BiFunction;

class ArithFunction{
    int add(int a, int b){
        return a + b;
    }
}

public class InstanceMethodReference3 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bi= new ArithFunction()::add;
        Integer apply = bi.apply(10, 20);
        System.out.println(apply);
    }
}
