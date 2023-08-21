package com.thonglam.designpattern.builder.example2;

public class BuilderMain {

    public static void main(String[] args) {
        Person person = new PersonBuilder().setName("Ngawang").setAddress("Tibet").setAge(40).setPhoneNumber(76332114).getPerson();
        System.out.println(person);
    }
}
