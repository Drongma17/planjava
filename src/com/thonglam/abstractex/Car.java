package com.thonglam.abstractex;

abstract class Car {
   public void accelerate() {
      System.out.println("Do something to accelerate");
   }
   public void applyBrakes() {
      System.out.println("Do something to apply brakes");
   }
   public abstract void changeGears();
}