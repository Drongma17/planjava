package com.thonglam.wellsfargo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample4
{
   public static void main(String args[])
   {
       ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<String, String>();
       hashMap.put("CHD", "123ABC");
       hashMap.put("Mohali", "CBA321");
       hashMap.put("KKR", "55RR");
       
       for(String key : hashMap.keySet())
       {
           System.out.print("Key from Map: "+key +"             ===       ");
           System.out.println("Value from Map: "+ hashMap.get(key));
       }
   }
 
}