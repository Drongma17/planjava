package com.thonglam.designpattern.factorypattern.factory1;

import com.thonglam.designpattern.factorypattern.factory1.Shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}