package com.interview.linkdin.hashDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingElement {

    public static List<Integer> findMissingElements(int[] first, int[] second){
        List<Integer> missingElement=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();
        for(int x: second){
            hashSet.add(x);
        }

        for (int x: first){
            if(!hashSet.contains(x)){
                missingElement.add(x);
            }
        }
        return missingElement;
    }
    public static void main(String[] args) {
    findMissingElements(new int[]{1,2,3,4,5,6}, new int[]{1,3,5}).forEach(System.out::println);
        System.out.println();
    findMissingElements(new int[]{8,0,1,7,3}, new int[]{5,7,8,0,2}).forEach(System.out::println);

    }
}
