package com.thonglam.designpattern.factorypattern.factory2;

public class MainColor {

    public static void main(String[] args) {
        ColorFactory cf=new ColorFactory();
        Colour c= cf.getColor("yellow");
        c.display();
    }
}
