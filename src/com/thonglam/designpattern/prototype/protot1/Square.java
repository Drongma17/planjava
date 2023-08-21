package com.thonglam.designpattern.prototype.protot1;

import com.thonglam.designpattern.prototype.protot1.Shape;

public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}