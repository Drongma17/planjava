package com.designpattern.builder1;

public class CarBuilder implements VehicleBuilder {
    private Vehicle car = new Vehicle();

    public void buildWheels() {
        car.setWheels(4);
        car.setType("Car");
    }

    public void buildGPS() {
        car.setHasGPS(true);
    }

    public Vehicle getVehicle() {
        return car;
    }
}


