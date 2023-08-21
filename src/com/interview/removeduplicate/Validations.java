package com.interview.removeduplicate;

public class Validations {

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(c-> Character.isUpperCase(c) && Character.isLowerCase(c) && Character.isDigit(c));
    }

    public static boolean isComplexPassword(String s){
        return s.chars().anyMatch(Character::isUpperCase) && s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(Validations.isPasswordComplex("nga2wangyeshi@Tibet"));
    }
}
