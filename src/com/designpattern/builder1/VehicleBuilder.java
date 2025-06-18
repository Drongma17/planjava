package com.designpattern.builder1;

public interface VehicleBuilder {
    void buildWheels();
    void buildGPS();
    Vehicle getVehicle();
}
