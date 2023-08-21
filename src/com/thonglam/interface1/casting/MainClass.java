package com.thonglam.interface1.casting;

public class MainClass {


    public static void main(String[] args) {

//        ThirdClass tc =null;
//        ThirdClass  tc= (ThirdClass) new SubClass();
//       String outp= tc.message();
//        System.out.println(outp);


        B b=null;
           b = (B) new A();
           b.draw();


    }
}
