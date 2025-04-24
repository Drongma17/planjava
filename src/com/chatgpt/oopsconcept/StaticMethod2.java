package com.chatgpt.oopsconcept;

class Parent2 {
    static String message = "Parent Message";
}

class Child2 extends Parent {
    static String message = "Child Message";
}

public class StaticMethod2 {
    public static void main(String[] args) {
        System.out.println(Parent2.message); // Output: Parent Message
        System.out.println(Child2.message);  // Output: Child Message
    }
}