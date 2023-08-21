package com.thonglam.javatechie.functionalinterface.consumer;

import java.util.function.Consumer;

public class AcceptMethodWithoutLamda implements Consumer<Integer> {

//    void accept(T t);


    @Override
    public void accept(Integer i) {
        System.out.println("this is Consumer functional interface "+ i);
    }

    public static void main(String[] args) {
        new AcceptMethodWithoutLamda().accept(50);
    }


}
