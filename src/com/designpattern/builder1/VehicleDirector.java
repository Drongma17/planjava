package com.designpattern.builder1;

public class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildWheels();
        builder.buildGPS();
    }

    public Vehicle getVehicle() {
        return builder.getVehicle();
    }
}
