package com.ididlo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentDemo {


    public static void main(String[] args) {


        Map<String, List<String>> map= new HashMap<>();

        map.computeIfAbsent("fruit", k-> new ArrayList<>()).add("apple");
        map.computeIfAbsent("fruit", k-> new ArrayList<>()).add("orange");
        map.computeIfAbsent("fruit", k-> new ArrayList<>()).add("avokada");
        map.computeIfAbsent("fruit", k-> new ArrayList<>()).add("apple");

        System.out.println(map);

    }
}
