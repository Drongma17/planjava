package com.thonglam.javatechie.functionalinterface.predicate;

import java.util.function.Predicate;

public class TestMethodWithLamda {

//    boolean test(T t);

    public static void main(String[] args) {

//        Predicate<Integer> predicate = t->{
//            if(t % 2 ==0){
//                return true;
//            }else {
//                return false;
//            }
//        };

        Predicate<Integer> predicate = t-> t % 2 ==0;

        System.out.println(predicate.test(5));
    }
}
