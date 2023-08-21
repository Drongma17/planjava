package com.interview.linkdin.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {



    public static void main(String[] args) {

        List<DataStructure> dataList = new ArrayList<>();
        dataList.add(new DataStructure("first", "123"));
        dataList.add(new DataStructure("second", "456"));
        dataList.add(new DataStructure("third", "891"));
        dataList.add(new DataStructure("hundred", "895"));

        Stream<String> applelist = Stream.of("apple", "mango", "tomato", "potato");
        applelist.forEach(x -> System.out.print(x + ", "));
        System.out.println();

        String[] breakfast = new String[]{"bread", "croson", "bamroti", "toast", "egg"};
        List<String> stringList = Arrays.stream(breakfast).collect(Collectors.toList());
        stringList.forEach(x -> System.out.println(x + ", "));


        String first = TestClass.findValueOldSchool(dataList, "first");
        System.out.println("search found is " + first);

    }

    static String findValueOldSchool(List<DataStructure> list, String key) {
        for (DataStructure ds : list) {
            if (key.equals(ds.getKey())) {
                return ds.getValue();
            }
        }
        return null;
    }

    static String findValueByStream(List<DataStructure> streamList, String key) {
        return streamList.stream().filter(x -> key.equals(x.getKey())).findFirst().get().getValue();
    }

    static String findValueStream(List<DataStructure> list, String key) {
        return list.stream().filter(x -> key.equals(x.getKey()))
                .map(DataStructure::getValue).findFirst().orElse("no data found");
    }

    static String findValueWithMapFunction(List<DataStructure> list, String key) {
      return  list.stream().filter(x -> key.equals(x.getKey()))
                .map(data -> data.getValue())
                .findFirst()
                .orElse(null);
    }

}

