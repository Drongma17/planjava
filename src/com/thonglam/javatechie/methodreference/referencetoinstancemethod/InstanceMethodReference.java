package com.thonglam.javatechie.methodreference.referencetoinstancemethod;
interface SaySomething{
    void say();
}
public class InstanceMethodReference {

    void speak(){
        System.out.println("you should say hello instance");
    }
    public static void main(String[] args) {
       SaySomething saySomething= new InstanceMethodReference()::speak;
       saySomething.say();
    }
}
