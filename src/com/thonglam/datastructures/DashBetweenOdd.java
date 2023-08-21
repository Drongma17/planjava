package com.thonglam.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DashBetweenOdd {

    private static LinkedList<Object> list;
    static List<Object> dashAtTwoOdd(int arr[]){
        int l = arr.length-1;
        list = new LinkedList<>();
            for(int j=0; j<l; j++){
                if(arr[j] %2 !=0 && arr[j+1] %2 !=0){
                    list.add(j);
                    list.add("-");
                }else {
                    list.add(j);
                }
                j++;
            }
        return list;
    }


    public static void main(String[] args) {

        System.out.println(DashBetweenOdd.dashAtTwoOdd(new int[]{1, 7, 4, 5, 3, 8, 9,}));
    }

}
