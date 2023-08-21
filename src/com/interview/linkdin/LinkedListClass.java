package com.interview.linkdin;

import java.util.LinkedList;

public class LinkedListClass {



    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList();
        linkedList.add("baby");
        linkedList.add("hello");
        linkedList.add("kalsang");
        linkedList.add("dolam");
        linkedList.add("tsering");


        System.out.println(linkedList.contains("hello"));

//
//        for (String item: linkedList){
//            System.out.println(item+ "==>");
//        }

        linkedList.forEach(x-> System.out.println(x+"  ==>"));
    }
}
