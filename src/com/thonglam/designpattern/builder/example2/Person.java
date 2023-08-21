package com.thonglam.designpattern.builder.example2;

public class Person {

    private String name;
    private String address;
    private int age;
    private int phoneNumber;


    public Person(String name, String address, int age, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
