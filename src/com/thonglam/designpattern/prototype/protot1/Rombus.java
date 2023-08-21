package com.thonglam.designpattern.prototype.protot1;

public class Rombus extends Shape{

    public Rombus() {
        type = "rombus";
    }

    @Override
    void draw() {
        System.out.println("i am rombus !!!");
    }
}
