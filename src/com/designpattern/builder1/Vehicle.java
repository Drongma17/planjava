package com.designpattern.builder1;

public class Vehicle {
    private String type;
    private int wheels;
    private boolean hasGPS;

    public void setType(String type) {
        this.type = type;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", wheels=" + wheels + ", GPS=" + hasGPS + "]";
    }
}
