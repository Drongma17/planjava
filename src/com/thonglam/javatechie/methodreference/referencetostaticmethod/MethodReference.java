package com.thonglam.javatechie.methodreference.referencetostaticmethod;

import java.util.Collection;
import java.util.Collections;

interface Syllabus{
    void say();
}

public class MethodReference {

    public static void saySomething(){
        System.out.println("say this is static method reference");
    }
    public static void main(String[] args) {
        Syllabus saySomething = MethodReference::saySomething;
        saySomething.say();

    }
}
