package com.thonglam;

interface i{
  public void s(int a);
}

class A{
   static void show1(int i){
        System.out.println("this is a salary inside show1 method "+ i);
    }
    void show(int salary){
        System.out.println("salary of Ngawang "+ salary);
    }

    A(){
        System.out.println("this is salary ");
    }
}

public class TestMyProgram {

    public static void main(String[] args) {

        i obje=A::show1;
        obje.s(5000);
        i ob2 = new A()::show;
        ob2.s(89000);
    }

}
