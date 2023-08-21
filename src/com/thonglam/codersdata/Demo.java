package com.thonglam.codersdata;

class Emp{
  int i;
  void method(int j){
      i = j;
      System.out.println("this is i from class DEPT " + i);
  }
}


class Company extends Emp{
    int i;
    void method(int j){
        i = j;
        System.out.println("this is i from class COMPANY  " + i);
    }

}

public class Demo {

    public static void main(String[] args) {

        System.out.println("ok");

        Emp emp = new Company();
        emp.method(80);
    }
}
