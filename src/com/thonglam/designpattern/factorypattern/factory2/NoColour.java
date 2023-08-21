package com.thonglam.designpattern.factorypattern.factory2;

public class NoColour implements Colour{
    @Override
    public void display() {
        System.out.println("Colour is not matched");
    }
}
