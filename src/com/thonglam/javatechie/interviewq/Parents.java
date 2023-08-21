package com.thonglam.javatechie.interviewq;

public interface Parents {
    public static void method1(){
        System.out.println("i am static method ");
    }
    public default String method2(){
        return "i am default method ";
    }
}
