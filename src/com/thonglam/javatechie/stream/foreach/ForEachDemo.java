package com.thonglam.javatechie.stream.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ngawang");
        list.add("Tashi");
        list.add("Dawa");
        list.add("Kunsang");
        list.add("Dolma");
        list.add("Sonam");

        for(String s: list){
            System.out.println(s);
        }

        list.stream().forEach(t-> System.out.println(t));



    Map<Integer, String> mp = new HashMap<>();

    mp.put(1, "a");
    mp.put(2, "b");
    mp.put(3, "c");
    mp.put(4, "d");
    mp.put(5, "e");

    mp.forEach((Key, Val)-> System.out.println(Key+"  "+Val));
    mp.entrySet().stream().forEach(object-> System.out.println(object));

        Consumer<String> consumer = t-> System.out.println(t);
        for(String s1: list){
            consumer.accept(s1);
        }

    }
}
