package com.thonglam.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();

        hs.add("Dawa");
        hs.add("Dolma");
        hs.add("Pasang");
        hs.add("Sonam");
        hs.add("Dorjee");
        hs.add("Ngawang");
        hs.add("Ngawang");

        Iterator<String> set =hs.iterator();
        while (set.hasNext()){
            System.out.println(set.next());
        }
    }
}
