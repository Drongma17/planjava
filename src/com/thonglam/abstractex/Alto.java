package com.thonglam.abstractex;

class Alto extends Car {
   public void changeGears() {
      System.out.println("Implement changeGears() method for Alto Car");
   }
}
class Santro extends Car {
   public void changeGears() {
      System.out.println("Implement changeGears() method for Santro Car");
   }
}


class Execute{
   public static void main(String[] args) {

      Alto car =new  Alto();
      car.accelerate();
      car.applyBrakes();

   }
}