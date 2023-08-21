package com.thonglam.staticproperties;

public class MainMethod {

    public static void main(String[] args) {

        Animal animal=new AquaticAnimal();
        animal.specialProperty();
        AquaticAnimal.specialProperty();
    }
}
