package com.interview.linkdin.java8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nameOpt = Optional.of("Kathryan");

        if(nameOpt.isPresent()){
            System.out.println("hi "+ nameOpt.get());
        }else {
            System.out.println("hi");
        }

        System.out.println("Hi " + nameOpt.orElse(""));
        System.out.println("Hi " + emptyOpt.orElse(""));
    }

}
