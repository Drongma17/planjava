package com.problemsolving;

public class MyArmstrongNumber {


    public static void main(String[] args) {

        int givenNumber = 153;
        int originNumber = givenNumber;

        int value = String.valueOf(givenNumber).length();
        int sumof = 0;

        while(givenNumber !=0){
            int lastDigit = givenNumber % 10;
            sumof += Math.pow(lastDigit, value);
            givenNumber = givenNumber /10;
        }

        if(originNumber == sumof){
            System.out.println("given number is an Anstrom number");
        }else {
            System.out.println("Given number is not Anstrom number");
        }
    }
}
