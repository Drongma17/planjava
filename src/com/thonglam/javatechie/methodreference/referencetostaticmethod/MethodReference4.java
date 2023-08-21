package com.thonglam.javatechie.methodreference.referencetostaticmethod;

import java.util.function.BiFunction;

class Arithme1tic{
   public static int add(int a, int b){
       return a + b;
   }
   public static double add(int a, double b){
       return a + b;
   }
   public static double add(double a, double b){
       return a + b;
   }
}

public class MethodReference4 {
    static int add(int a, int b){
        return a + b;
    }
    static double add(int a, double b){
        return a+b;
    }
    static double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction1=Arithme1tic::add;
        BiFunction<Integer, Double, Double> biFunction2=Arithme1tic::add;
        BiFunction<Double, Double, Double> biFunction3=Arithme1tic::add;
        int a1 = biFunction1.apply(2,4);
        double a2 = biFunction2.apply(5, 7.00);
        double a3 = biFunction3.apply(50.0, 7.00);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
