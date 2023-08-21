package com.thonglam.interface1.casting.john;

public class Casting {

    public static void main(String[] args) {

//
//        Dog myDog = new Dog();
//        Casting.makestaff(myDog);

        Cat myCat = new Cat();
        Casting.makestaff(myCat);
    }

    public static void makestaff(Animal animal) {
        animal.makeNoice();
        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal;
            myDog.grow1();
        }
    }

}
