package com.thonglam.designpattern.factorypattern.factory2;

public class ColorFactory {

    Colour getColor(String colr){
        if(colr.equals("red"))
            return new RedColor();
        else if(colr.equals("green"))
            return new GreenColor();
        else if(colr.equals("blue"))
            return new BlueColor();
        else return new NoColour();
    }
}
