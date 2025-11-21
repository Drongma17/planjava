package com.ididlo.inheritance;

import codingcrack.designpattern.factory.Vehicle;

public class MyMain {


    public static void main(String[] args) {
        Car car = new ToyotaRav4();
        ToyotaRav4 v = (ToyotaRav4) car;
        v.wheel();
    }
}
