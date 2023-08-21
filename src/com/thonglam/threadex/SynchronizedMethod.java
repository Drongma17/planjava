package com.thonglam.threadex;

class Test
{ 
    synchronized public void count() 
    { 
        for (int i = 0; i < 3; i++) 
        { 
            System.out.println(i); 
            try 
            { 
                Thread.sleep(400); 
            } 
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
} 
  
class MyThreadQ extends Thread {
   
    Test test; 
  
    MyThreadQ (Test test) {
        this.test = test; 
    } 
  
    @Override
    public void run() { 
        test.count(); 
    } 
} 
  
public class SynchronizedMethod 
{ 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); //Object of Apple class that is shared amoung threads
  
        MyThreadQ thread1 = new MyThreadQ(obj);
        MyThreadQ thread2 = new MyThreadQ(obj);
  
        thread1.start(); 
        thread2.start(); 
    } 
} 