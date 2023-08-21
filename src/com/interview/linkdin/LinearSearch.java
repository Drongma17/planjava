package com.interview.linkdin;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearch {

    public static Integer linearSearch(int[] arr, int temp){
        for(int current: arr){
            if(current == temp){
                return temp;
            }
        }
        return null;
    }

    public static OptionalInt linearSearch2(int[] arr, int temp){
     return Arrays.stream(arr).filter(x->x == temp).findAny();
    }

    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8};
     linearSearch2(arr, 2).ifPresent(System.out::println);
    }
}
