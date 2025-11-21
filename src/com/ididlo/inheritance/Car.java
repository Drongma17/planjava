package com.ididlo.inheritance;

import codingcrack.designpattern.factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void wheel() {
        System.out.println("Car has four wheels ");
    }
}
