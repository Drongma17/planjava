package com.thonglam.threadex;

class ExampleOfThreadCreation extends Thread
{  
   public static void main(String args[])
   {  
       firstMethod();
       SecondMethod();
       ExampleOfThreadCreation t1 = new ExampleOfThreadCreation();
       t1.start();
   }  
   public void run()
   {
       System.out.println("Thread is running...");
       for(int i = 0; i < 5 ; i++)
           methodOfThread(i);
   }
   
   public static void firstMethod()
   {
       System.out.println("First method");
   }
   
   public static void SecondMethod()
   {
       System.out.println("Second method");
   }
   
   public static void methodOfThread(int i)
   {
       System.out.println("Counting in thread : " + i);
   }
}  