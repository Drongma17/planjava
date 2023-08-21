package com.thonglam.mixing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {

    public static void main(String[] args) {


        List<String> list = new LinkedList<>();
        list.add("Ngawang");
        list.add("Dolma");
        list.add("Kunsang");

        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(1,"Pema");
        Iterator<String> it =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
