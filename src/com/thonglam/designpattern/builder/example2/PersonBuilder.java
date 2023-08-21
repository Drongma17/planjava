package com.thonglam.designpattern.builder.example2;

public class PersonBuilder {

    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }


    Person getPerson(){
        Person person=new Person(name, address, age, phoneNumber);
        return person;
    }
}
