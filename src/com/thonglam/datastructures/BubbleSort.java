package com.thonglam.datastructures;

import java.util.HashMap;

public class BubbleSort {


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    int[] arrs={4,52,3,6,7,7,3,9,56,78};
       bubbleSort(arrs);
        for (int i=0; i<arrs.length; i++){
             System.out.print(arrs[i]+" ");
       }

        System.out.println();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        bubbleSort(arrs);
        for(int i=0; i<arrs.length; i++){
            hm.put(arrs[i], i);
        }
        Integer sortedint = hm.get(hm.keySet());
        System.out.println(hm.keySet());
        bubbleSort(arrs);

//
//        System.out.println("Befor sort .............");
//        for(int i=0; i<arrs.length; i++){
//            System.out.print(arrs[i]+" ");
//        }
//
//        bubbleSort(arrs);
//        System.out.println();
//        System.out.println("After Bubble Sort ............");
//
//        for (int i=0; i<arrs.length; i++){
//            System.out.print(arrs[i]+" ");
//        }
   }
}
