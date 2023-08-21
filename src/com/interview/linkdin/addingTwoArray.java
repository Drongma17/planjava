package com.interview.linkdin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class addingTwoArray {

    public static int[] findEvenNumber(int[] arr1, int[] arr2){
        ArrayList<Integer> result=new ArrayList<>();

        for(int item1: arr1){
            if(item1 % 2 ==0){
                result.add(item1);
            }
        }

        for (int item: arr2){
            if(item % 2 ==0){
                result.add(item);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] findEventNumber2(int[] arr1, int[] arr2){
        IntPredicate isEvenPre=num->num % 2 ==0;
        return Stream.of(arr1,arr2).flatMapToInt(Arrays::stream).filter(isEvenPre).toArray();
    }

    public static void main(String[] args) {
    int[] a={-9, 3, 2, -8, 12, -16};
    int[] b ={0, -3, -8, -35, 40, 20, 7};

    Arrays.stream(findEvenNumber(a, b)).forEach(System.out::println);
        System.out.println("=============================");
    Arrays.stream(findEventNumber2(a, b)).forEach(System.out::println);
    }


}
