package com.thonglam.javatechie.brainstorm;

import java.util.ArrayList;
import java.util.List;

public class FindElementInList {

    public static String findElement(List<Integer> arr, int k) {

        for (Integer i : arr) {
            if (i.equals(k)) {
                return "YES";
            }
        }
        return "NO";
    }


        public static void main (String[]args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
          List<Integer> arr=new ArrayList<>();
          arr.add(1);
          arr.add(2);
          arr.add(3);
          arr.add(4);
          arr.add(5);
          arr.add(6);
          arr.add(7);
            System.out.println(findElement(arr, 8));
        }
    }

