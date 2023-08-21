package com.interview.javatechie.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImp {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("a", "xyz");
        map.put("x", "slkf");
        map.put("r", "klsd");
        map.put("b", "woeiekd");
        map.put("d", "iekdks");

        System.out.println(map);
    }
}
