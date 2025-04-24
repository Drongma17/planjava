package com.chatgpt.java8;

import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {

        Optional<String> nameOne = Optional.of("Tashi");
        Optional<String> nameTwo = Optional.empty();
        Optional<String> nameThree = Optional.ofNullable("Dawa");

        System.out.println(nameOne);
        System.out.println(nameTwo);
        System.out.println(nameThree);
        String thereIsNothing = nameThree.orElse("there is nothing");
        System.out.println(thereIsNothing);
        String somethings = nameOne.orElse("Somethings");
        System.out.println(somethings);
        nameOne.ifPresent(n -> System.out.println("Hello " + n));
        if(nameOne.isPresent()){
            System.out.println("there is something and you can see it ");
        }
        nameOne.ifPresent(n-> System.out.println("hello world "+n));
    }
}
