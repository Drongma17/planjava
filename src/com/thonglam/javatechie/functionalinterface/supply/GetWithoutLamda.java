package com.thonglam.javatechie.functionalinterface.supply;

import java.util.function.Supplier;

public class GetWithoutLamda implements Supplier<String> {

//    T get();

    @Override
    public String get() {
        return "HI Java Techie ";
    }

    public static void main(String[] args) {
      Supplier<String> ss= new GetWithoutLamda();
        System.out.println(ss.get());
    }
}
