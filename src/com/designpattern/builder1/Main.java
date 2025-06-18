package com.designpattern.builder1;

public class Main {
    public static void main(String[] args) {
        VehicleBuilder builder = BuilderFactory.getBuilder("car");
        VehicleDirector director = new VehicleDirector(builder);

        director.construct();
        Vehicle vehicle = director.getVehicle();

        System.out.println(vehicle);
    }
}
