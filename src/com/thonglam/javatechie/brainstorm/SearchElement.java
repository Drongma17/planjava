package com.thonglam.javatechie.brainstorm;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {

    public static void main(String args[]) {
        List<DataStructure> dataList = new ArrayList<>();
        dataList.add(new DataStructure("first", "123"));
        dataList.add(new DataStructure("second", "456"));
        dataList.add(new DataStructure("third", "891"));
        dataList.add(new DataStructure("hundred", "895"));

        System.out.println(findValueOldSchool(dataList, "first")); //works ok
        System.out.println(findValueStream0(dataList, "second")); //throws NoSuchElementException
        System.out.println(findValueStream(dataList, "third")); //throws NoSuchElementException
        System.out.println(searchElementFromList(dataList, "hundred")); //throws NoSuchElementException
    }

    static String findValueOldSchool(List<DataStructure> list, String key) {
        for (DataStructure ds : list) {
            if (key.equals(ds.getKey())) {
                return ds.getValue();
            }
        }
        return null;
    }

    static String findValueStream0(List<DataStructure> list, String key) {
        return list.stream()
                .filter(ds -> key.equals(ds.getKey()))
                .findFirst()
                .get().getValue();
    }

    static String findValueStream(List<DataStructure> list, String key) {
        return list.stream() // initial Stream<DataStructure>
                .filter(ds -> key.equals(ds.getKey())) // filtered Stream<DataStructure>
                .map(DataStructure::getValue) // mapped Stream<String>
                .findFirst() // first Optional<String>
                .orElse(null); // or else return 'null'
    }


    static String searchElementFromList(List<DataStructure> list, String element) {
        return list.stream().filter(you -> element.equals(you.getKey()))
                .map(data->data.getValue())
                .findFirst()
                .orElse(null);
    }


    static String getwhatiwant(List<DataStructure> list, String element){
        return list.stream().filter(find->element.equals(find.getKey()))
                .map(DataStructure::getValue)
                .findFirst()
                .orElse(null);
    }

}

