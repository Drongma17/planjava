package com.interview.javatechie.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NullKeyValue {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map);
//        Exception throw while using ConcurrentHashMap
    }
}
