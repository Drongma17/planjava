package com.thonglam.designpattern.builder.example1;

public class Phone {

    private String name;
    private String battery;
    private int ram;

    public Phone(String name, String battery, int ram) {
        this.name = name;
        this.battery = battery;
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", battery='" + battery + '\'' +
                ", ram=" + ram +
                '}';
    }



}
