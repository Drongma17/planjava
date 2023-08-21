package com.thonglam.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

//        ctrl + alt + shift +j

        Set<String>  set=new TreeSet<>();

        set.add("Dorjee");
        set.add("Ngawang");
        set.add("Ngawang");
        set.add("Dawa");
        set.add("Dolma");
        set.add("Pasang");
        set.add("Sonam");
        set.add("Abtul");



        Iterator<String> set1 =set.iterator();
        while (set1.hasNext()){
            System.out.println(set1.next());
        }
    }
}
