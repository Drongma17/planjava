package com.thonglam.designpattern.factorypattern.factory1;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}