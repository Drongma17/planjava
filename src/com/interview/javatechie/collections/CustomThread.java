package com.interview.javatechie.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread{

    static Map<Integer,String> map=new ConcurrentHashMap<>();

    public void run(){
        try {
            Thread.sleep(1000);
            map.put(103, "D");
        }catch (InterruptedException e){
            System.out.println("Child Thread going to add element ");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        CustomThread customThread = new CustomThread();
        customThread.start();

        for(Object o: map.entrySet()){
            Object s =o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }

//    Segment locking or bucket locking
}
