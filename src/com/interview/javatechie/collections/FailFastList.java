package com.interview.javatechie.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

    public static void main(String[] args) {
        List<String> list= new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");


        Iterator<String> iterator=list.iterator();

        while (iterator.hasNext()){
            String element =iterator.next();
              list.add("c");
            }
        list.forEach(System.out::println);
    }
}
