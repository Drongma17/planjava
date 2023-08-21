package com.thonglam.javatechie.brainstorm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class displayPrimeNo {
    private static boolean isPrimeNumber(int x){
        int count =0;
        for(int i=1; i<=x; i++){
            if(x%i==0){
                count ++;
            }
        }
        return count ==2;
    }

    public static void main(String[] args) {

     List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> collect = list.stream().filter(i -> isPrimeNumber(i)).collect(Collectors.toList());
        System.out.println(collect);

        Integer sum = list.stream().filter(i -> isPrimeNumber(i)).reduce(1, (a,b)->a+b);
        System.out.println(sum);
    }
}
