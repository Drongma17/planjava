package com.thonglam.failfastfailsafe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayTest {

    public static void main(String[] args) {


        List<String> list = new CopyOnWriteArrayList<String>();
        for(int x=0; x<100; x++){
            list.add("a"+x);
        }
        for(String s: list){
            System.out.println(s);
            if(s.equals("a0")){
                list.remove(s);
            }
        }
    }
}
