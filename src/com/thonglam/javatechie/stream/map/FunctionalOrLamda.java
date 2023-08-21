package com.thonglam.javatechie.stream.map;

import java.util.*;

public class FunctionalOrLamda {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1,  o2) ->o1.getKey().compareTo(o2.getKey()));

        for (Map.Entry<String, Integer> entity :entries){
            System.out.println(entity.getKey()+ "  " + entity.getKey());
        }
    }
}
