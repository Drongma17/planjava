package com.thonglam.functionalinterface;

import java.util.Arrays;

@FunctionalInterface
interface MyFunctionalInterface {
 
    boolean isEvenNumber(int i);
}
 
public class MethodReferenceDemo {

    //instance method
    boolean myImplementation(int i) {
        
        return i%2 == 0;
    }
 
    public static void main(String[] args) {
        
        MethodReferenceDemo demo = new MethodReferenceDemo();
        MyFunctionalInterface mi = demo::myImplementation;
        
        MyFunctionalInterface mi2 = new MethodReferenceDemo()::myImplementation;
        
        System.out.println(mi.isEvenNumber(15));//false
        System.out.println(mi2.isEvenNumber(20));//true
    }
}