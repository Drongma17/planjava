package com.thonglam.wellsfargo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1
{
   public static void main(String args[])
   {
       ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>(10);
       concurrentHashMap.put(1, "JavaGoal.com");
       concurrentHashMap.put(2, "Learning");
       concurrentHashMap.put(3, "Website");
       
       System.out.println("Object from ConcurrentHashMap: "+ concurrentHashMap);
   }
 
}