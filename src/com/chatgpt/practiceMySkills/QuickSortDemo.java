package com.chatgpt.practiceMySkills;

public class QuickSortDemo {


     static void quickSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length -i-1; j++){
                int temp = 0;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] arr={2,3,7,5,8,6,34,21,65,23};
         QuickSortDemo.quickSort(arr);
        for(int a: arr){
            System.out.print(a+ " ");
        }
    }
}
