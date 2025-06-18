package com.thonglam.failfastfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("D"); // ❌ ConcurrentModificationException
        }

    }



}
