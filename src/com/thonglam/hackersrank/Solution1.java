package com.thonglam.hackersrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }


        int left_to_right =0;
        int right_to_right =0;


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    left_to_right += arr[i][j];
                }
                if((i+j)== n-1){
                    right_to_right += arr[i][j];
                }
            }
        }

        int diff=Math.abs(right_to_right - left_to_right);

        System.out.println(diff);

    }
















   // Complete the diagonaldefference function below
//    static int diagonalDifference(int[][] arr){
//
//        int left_to_right = 0;
//        int right_to_left = 0;
//
//        int rows = arr.length;
//        int columns = arr[0].length;
//
//
//        int i =0;
//        int j=0;
//        int k=0;
//        int l= arr.length - 1;
//
//        while(i< rows && j< columns && k< rows && l >= 0){
//            left_to_right += arr[i][j];
//            right_to_left += arr[k][l];
//            i += 1;
//            j += 1;
//            k += 1;
//        }
//
//        return Math.abs(left_to_right - right_to_left);
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2029\u0085])?");
//    }
}
