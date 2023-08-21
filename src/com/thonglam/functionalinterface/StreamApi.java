package com.thonglam.functionalinterface;

interface i{
    public void s(int salary);
}

class A{

    public static void show1(int salary){
        System.out.println("static" + " "+ salary);
    }

    public void show(int salary){
        System.out.println("OK"+ " "+ salary);
    }

    A(int sal){
        System.out.println("Constructor"+ " this is salary  "+ sal);
    }
}
public class StreamApi {

    public static void main(String[] args) {

        i ob=new A(4500)::show;

        ob.s(5000);
//        i ob1= A::show1;
//        ob1.s(7500);
//        i ob2= A::new;
//        ob2.s(7800);




//        i d=(400)->{
//            System.out.println("ok");
//       };
//
//        i d1=(5000)->{
//            System.out.println("this is the one of functional interface implementation");
//        };
    }
}
