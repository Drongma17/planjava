package com.thonglam.javatechie.functionalinterface.predicate;

import java.util.function.Predicate;

public class TestMethodWithoutLamda implements Predicate<Integer> {

//    boolean test(T t);

    @Override
    public boolean test(Integer t) {
        if(t%2==0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Predicate<Integer> predicate= new TestMethodWithoutLamda();
        System.out.println(predicate.test(4));
    }
}
