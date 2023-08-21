package com.thonglam.javatechie.methodreference.referencetoinstancemethod;
class Thread1{
    void testThread(){
        System.out.println("this is testing thread");
    }
}

public class InstanceMethodReference2 {

    public static void main(String[] args) {
        Thread thread= new Thread(new Thread1()::testThread);
        thread.start();
    }
}
