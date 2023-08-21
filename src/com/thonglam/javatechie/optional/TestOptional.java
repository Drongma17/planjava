package com.thonglam.javatechie.optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {

        String name = "ngawang";
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt);

      Optional<String> optionalS = Optional.empty();
      if(optionalS.isPresent()) {
          System.out.println(optionalS);
      }else {
          System.out.println("Option is not present");
      }


        String book=null;
        if(book != null){
            System.out.println(book.toUpperCase());
        }
        optionalS= Optional.ofNullable(book);
        if(optionalS.isPresent()){
            System.out.println(optionalS.get().toUpperCase());
        }


        String jams="Java";
        if(jams != null){
            System.out.println(jams);
        }else {
            jams ="Java 8";
        }

        Optional<String> stringOptional=Optional.ofNullable(jams);
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }

        String book1 = null;
        Optional<String> stringOptional1 = Optional.ofNullable(book1);
        System.out.println(stringOptional1.orElse("Java 11").toUpperCase());

    }
}
