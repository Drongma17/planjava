package com.ididlo.inheritance;

import codingcrack.designpattern.factory.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void wheel() {
        System.out.println("Bicycle has two wheels");
    }
}
