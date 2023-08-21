package com.interview.java8code;

import java.util.Arrays;
import java.util.List;

public class RandomNumberMul {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(i-> System.out.print(i*2+"  "));


    }
}
