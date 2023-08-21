package com.thonglam.threadex;

class NoneStatic
{ 
    synchronized public void countIncrement() 
    { 
        synchronized (NoneStatic.class) 
        {
            System.out.println("Increment values");
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
    synchronized public void countDecrement() 
    { 
        synchronized (NoneStatic.class) 
        {
            System.out.println("Decrement values");
            for (int i = 3; i > 0; i--) 
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
} 
  
class MyThreadNoneStatic extends Thread { 
   
    NoneStatic test; 
  
    MyThreadNoneStatic (NoneStatic test) { 
        this.test = test; 
    } 
  
    @Override
    public void run() { 
        test.countIncrement(); 
        test.countDecrement();
    } 
} 
  
public class SynchronizedNonStaticMethod 
{ 
    public static void main(String[] args) 
    { 
        NoneStatic obj = new NoneStatic(); //Object of Apple class that is shared amoung threads
  
        MyThreadNoneStatic thread1 = new MyThreadNoneStatic(obj); 
        MyThreadNoneStatic thread2 = new MyThreadNoneStatic(obj); 
  
        thread1.start(); 
        thread2.start(); 
    } 
} 