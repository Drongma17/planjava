package com.thonglam.wellsfargo;

import java.util.concurrent.ConcurrentHashMap;


//3. ConcurrentHashMap(int initialCapacity, float loadFactor):
//        This constructor creates a ConcurrentHashMap with specified
//        capacity and specified load factor. But it has default concurrency level is 16.

public class ConcurrentHashMapExample2
{
   public static void main(String args[])
   {
       ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>(10, 0.80f);
       concurrentHashMap.put(1, "JavaGoal.com");
       concurrentHashMap.put(2, "Learning");
       concurrentHashMap.put(3, "Website");
       
       System.out.println("Object from ConcurrentHashMap: "+ concurrentHashMap);

   }
 
}