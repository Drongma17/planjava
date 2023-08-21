package com.thonglam.javatechie.brainstorm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberUsingStream {


    public static void main(String[] args) {

        System.out.println("please input the number for Prime Check ");
        Scanner scanner=new Scanner(System.in);
        Boolean isPrime = true;
        int number =scanner.nextInt();

//
//        for(int i=2; i< number; i++){
//            if(number % i == 0){
//                isPrime = false;
//                System.out.println(number +" Number is not prime:");
//                break;
//            }
//        }
//
//         if(isPrime){
//             System.out.println("Number "+number+" is prime  ");
//         }



        if(IntStream.range(2, number).noneMatch(t->number%t ==0)){
            System.out.println(number + " is Prime Number ");
        }else {
            System.out.println(number + " is Not Prime Number ");
        }



    }



}
