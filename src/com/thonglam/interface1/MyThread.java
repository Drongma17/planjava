package com.thonglam.interface1;

public class MyThread
{
    public static void main(String[] args)
    {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("My thread is running");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}