package com.thonglam.interface1.casting;

class A {
  public void draw() {
    System.out.println("1");
  }

  public void draw1() {
    System.out.println("2");
  }
}

class B extends A {
  public void draw() {
    System.out.println("3");
  }
  public void draw2() {
    System.out.println("4");
  }
}