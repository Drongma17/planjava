package com.designpattern.pack2;

public class FactoryMain {


    public static void main(String[] args) throws IllegalAccessException {
        FactoryDesignPattern factoryDesignPattern =new FactoryDesignPattern();
        FlyingInSky flying = factoryDesignPattern.birdsFlyingToSky("duck");
        flying.fly();
    }
}
