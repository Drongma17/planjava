package com.chatgpt.oopsconcept;

class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child");
    }
}

public class StaticMethod1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        // All static calls depend on the reference type, not the object type
        parent.display();        // Output: Static method in Parent
        childAsParent.display(); // Output: Static method in Parent
        child.display();         // Output: Static method in Child
    }
}