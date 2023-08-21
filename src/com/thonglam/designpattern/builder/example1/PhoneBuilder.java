package com.thonglam.designpattern.builder.example1;

public class PhoneBuilder {

    private String name;
    private String battery;
    private int ram;


    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone() {
        Phone phone = new Phone(name,battery,ram);
        return phone;
    }


    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setName("Samsung").setBattery("4t").setRam(8).getPhone();
        System.out.println(phone);
    }

}
