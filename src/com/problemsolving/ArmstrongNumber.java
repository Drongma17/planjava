package com.problemsolving;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 243; // The number to check
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            result += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of the number of digits
            number /= 10; // Remove the last digit
        }

        // Check if the original number equals the calculated result
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}