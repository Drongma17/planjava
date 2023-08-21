package com.interview.linkdin.hashDemo;

import java.util.HashMap;

public class FreequenceOfElement {

    public static void frequenceOfElement(int[] a){
        HashMap<Integer, Integer> freqMap=new HashMap<>();
        for (int x: a){
            if(!freqMap.containsKey(x)){
                freqMap.put(x,1);
            }else {
                freqMap.put(x, freqMap.get(x)+1);
            }
        }
        System.out.println("number  :  times ");
        freqMap.forEach((key, value)-> System.out.println(key + "       :    "+ value));
    }
    public static void main(String[] args) {
frequenceOfElement(new int[]{1,2,3,4,3,4,4,5,6,76,7,6});
    }
}
