package com.thonglam.interface1;

public class MyThreads
{
    public static void main(String[] args) 
    {
        Runnable runnable = () -> System.out.println("My thread is running");
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}