package com.thonglam.collections.sett;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ImplementSet {


    public static void main(String[] args) {


        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(4);
        hashSet.add(12);
        hashSet.add(23);
        hashSet.add(4);
        hashSet.add(50);

        for(int hset: hashSet){
            System.out.println(hset +"  ");
        }

        hashSet.isEmpty();  // return true, if Set is empty
        hashSet.contains(10); // return true, if element is found
        hashSet.remove(23); // return true, if element was deleted
        hashSet.clear();     // delete all element


        System.out.println();

        Set<Integer> treeset= new TreeSet<>();
        treeset.add(4);
        treeset.add(12);
        treeset.add(23);
        treeset.add(4);
        treeset.add(50);


        for(int hset: treeset){
            System.out.println(hset +"  ");
        }

    }
}
