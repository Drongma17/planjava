package com.thonglam.threadex;

class MyThreadw implements Runnable
{
    String name;
    Thread thread;
    MyThreadw(String threadName)
    {
        name = threadName; 
        thread = new Thread(this, name);
        thread.start();
    }
    public void run() 
    {
         try 
         {
             for(int i = 0; i < 5; i++) 
             {
                 System.out.println("The "+ name + " is running...");
                 Thread.sleep(1000);
             }
         }
         catch (InterruptedException e) 
         {
             System.out.println(name + "Interrupted");
         }
    }
}
 
public class MultipleThreadw 
{
    public static void main(String args[]) 
    {
         new MyThreadw("First thread");
         new MyThreadw("Second thread");
         new MyThreadw("Third thread");
         try 
         {
             Thread.sleep(10000);
         } 
         catch (InterruptedException e) 
         {
             System.out.println("Main thread Interrupted");
         }
     }
}