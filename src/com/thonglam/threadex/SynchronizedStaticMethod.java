package com.thonglam.threadex;

class TestOfStatic
{ 
    synchronized static public void countIncrement() 
    { 
        synchronized (TestOfStatic.class) 
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
    synchronized static public void countDecrement() 
    { 
        synchronized (TestOfStatic.class) 
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
  
class MyThreadStatic extends Thread { 
   
    TestOfStatic test; 
  
    MyThreadStatic (TestOfStatic test) { 
        this.test = test; 
    } 
  
    @Override
    public void run() { 
        test.countIncrement(); 
        test.countDecrement();
    } 
} 
  
public class SynchronizedStaticMethod 
{ 
    public static void main(String[] args) 
    { 
        TestOfStatic obj = new TestOfStatic(); //Object of Apple class that is shared amoung threads
  
        MyThreadStatic thread1 = new MyThreadStatic(obj); 
        MyThreadStatic thread2 = new MyThreadStatic(obj); 
  
        thread1.start(); 
        thread2.start(); 
    } 
} 