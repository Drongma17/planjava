package com.thonglam.threadex;

public class MyThread extends Thread{



    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getId()+ " value " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Demo{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1=new MyThread();
        myThread1.start();
    }
}
