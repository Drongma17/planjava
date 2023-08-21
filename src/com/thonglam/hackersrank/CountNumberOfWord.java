package com.thonglam.hackersrank;

import java.util.Scanner;

public class CountNumberOfWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String  ");

        String s=sc.nextLine();
        char ch[] = s.toCharArray();
        int count=0;

        for(int i=0; i<ch.length-1; i++){
            if(ch[i] == ' ' && ch[i-1] ==' '){
                count =count + 1;
            }
        }
        System.out.println("Number of Words are : "+ count);
    }
}
