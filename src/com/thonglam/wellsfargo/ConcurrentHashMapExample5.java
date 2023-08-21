package com.thonglam.wellsfargo;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Fail-safe iterator in ConcurrentHashMap
//As we know we can’t modify the Collection during transversal.
//If we try to modify them during the iteration, it throws ConcurrentModificationException.
// But the Concurrent collection overcome from this problem. If we talk about ConcurrentHashMap,
// it doesn’t throw an exception if we modify it while iterating because the iterator returned
// by the ConcurrentHashMap is fail-safe.

public class ConcurrentHashMapExample5
{
   public static void main(String args[])
   { 
       // Creating ConcurrentHashMap
       Map<String, String> cityTemperatureMap = new ConcurrentHashMap<String, String>();
        
        cityTemperatureMap.put("Delhi", "24");
        cityTemperatureMap.put("Mumbai", "32");
        cityTemperatureMap.put("Chennai", "35");
        cityTemperatureMap.put("Bangalore", "22" );

        Iterator<String> iterator = cityTemperatureMap.keySet().iterator();
        while (iterator.hasNext())
        {
          System.out.println(cityTemperatureMap.get(iterator.next()));
          // adding new value, it won't throw error
          cityTemperatureMap.put("Kolkata", "34");   
        }
   }
}