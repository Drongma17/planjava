package com.chatgpt.oopsconcept.inheritant;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Method Overriding
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    // Method Overriding
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape; // Parent class reference

        myShape = new Circle(); // Refers to a Circle object
        myShape.draw(); // Output: "Drawing a circle"

        myShape = new Square(); // Now refers to a Square object
        myShape.draw(); // Output: "Drawing a square"
    }
}