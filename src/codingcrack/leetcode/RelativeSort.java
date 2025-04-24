package codingcrack.leetcode;

import java.util.*;


    /*
    Given two arrays arr1 and arr2, the elements of arr2 are distinct,
    and all elements in arr2 are also in arr1.  Sort the elements of arr1
    such that the relative ordering of items in arr1 are the same as in arr2.
    Elements that do not appear in arr2 should be placed at the end
    of arr1 in ascending order.
   */

public class RelativeSort {

    public int[] relativeSortArray(int[] arr1, int[] arr2){
        int[] cnt = new int[1001];
        for(int num: arr1){
            cnt[num] ++;
        }
        int i=0;
        for(int num: arr2){
            while (cnt[num]-- >0){
                arr1[i++] =num;
            }
        }
        for(int num=0; num<cnt.length; num++){
            while (cnt[num]-- >0){
                arr1[i++] = num;
            }
        }
        return arr1;
    }

    // Sample main method to test
    public static void main(String[] args) {
        RelativeSort solution = new RelativeSort();
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] result = solution.relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
