package com.designpattern.builder1;

public class BikeBuilder implements VehicleBuilder {
    private Vehicle bike = new Vehicle();

    public void buildWheels() {
        bike.setWheels(2);
        bike.setType("Bike");
    }

    public void buildGPS() {
        bike.setHasGPS(false); // assume no GPS for bike
    }

    public Vehicle getVehicle() {
        return bike;
    }
}