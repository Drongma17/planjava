package com.thonglam.wellsfargo;

import java.util.concurrent.ConcurrentHashMap;

//4. ConcurrentHashMap(int initialCapacity, float loadFactor,
//   int concurrencyLevel): This constructor is used to create an object of
//   ConcurrentHashMap with specified capacity, load Factor, and concurrency level.

public class ConcurrentHashMapExample3
{
   public static void main(String args[])
   {
       ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>(10, 0.80f, 8);
       concurrentHashMap.put(1, "JavaGoal.com");
       concurrentHashMap.put(2, "Learning");
       concurrentHashMap.put(3, "Website");
       
       System.out.println("Object from ConcurrentHashMap: "+ concurrentHashMap);

   }
 
}