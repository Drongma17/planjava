package com.thonglam.streamex;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamKeyValEx {

    public static void main(String[] args) {


        Map<String, Integer>  studentMap=new HashMap<>();
        studentMap.put("Ngawang", 38);

        studentMap.put("Kunsang", 2);
        studentMap.put("Dolma", 39);


        Map<String, Integer> age=studentMap.entrySet().stream().filter(map->"Ngawang".equals(map.getKey()))
                .collect(Collectors.toMap(m->m.getKey(), m->m.getValue()));
        System.out.println(age);
    }
}
