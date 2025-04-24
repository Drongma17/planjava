package com.chatgpt.hackerrank;

public class RorateArray1 {

   private static void rotateArr(int[] a, int k){
       // if first k element rotate
       reverseEle(a, 0, k);

       // rotate element remaining k
       reverseEle(a, k, a.length-k);
   }


    private static void reverseEle(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
