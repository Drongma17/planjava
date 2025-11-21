package com.vanguard;

import java.util.Arrays;

public class TestProgram {


    public static int maxPlatform(int[] a, int[] b){

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0, j=0; int plat_form =1;

        while (i < a.length) {
            if (a[i] <= b[j]) {
                plat_form++;
                i++;
            } else {
                plat_form--;
                j++;
            }
        }
       return plat_form;
    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        maxPlatform(arr,dep);
        for (int a: arr){
            System.out.print(a+"    ");
        }
        System.out.println();
        for (int a: dep){
            System.out.print(a+"   ");
        }
        System.out.println( maxPlatform(arr, dep));
    }


}
