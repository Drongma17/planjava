package com.designpattern.builder1;

public class BuilderFactory {
    public static VehicleBuilder getBuilder(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new CarBuilder();
            case "bike":
                return new BikeBuilder();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
