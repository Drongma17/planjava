package com.thonglam.javatechie;

interface Calculator{
//    void switchOn();

//    void add(int input);

    int subtract(int i1, int i2);
}

public class CalculatorImpl {

    public static void main(String[] args) {

//        ()-> {}

//        Calculator cal = () ->
//            System.out.println("Switch On");
//        cal.switchOn();


//        Calculator cal =(input)->
//                System.out.println("Sum "+ input);
//
//        cal.add(500);


        Calculator calc = (i, j)->{
            if(j<i){
                throw new RuntimeException("can not subtract");
            }else {
                return j - i;
            }
        };
        System.out.println(calc.subtract(5, 25));

    }
}
