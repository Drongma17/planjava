package com.thonglam.hackersrank;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("enter the "+n + "elements ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        System.out.println("the sum of array is :" + sum);
    }
}
