package com.thonglam.mixing;

public class CalculatorMethodOverLoad {
   private int addition(int a , int b){
      int result = a+b;
      return result;
   }
   private int addition(int a , int b, int c){
      int result = a+b+c;
      return result;
   }
   public static void main(String args[]){
      CalculatorMethodOverLoad obj = new CalculatorMethodOverLoad();
      System.out.println(obj.addition(12, 13));
      System.out.println(obj.addition(12, 13, 15));
   }
}