package com.thonglam.datastructures;

public class Practices {

   static  void mergeSort(int[] arr, int start, int mid, int end) {

        int n1 = mid - start +1;
        int n2 = end - mid;
        int len= arr.length;

        int L[] = new int[n1];
        int R[] =new int[n2];
        int K[] =new int[len];

        for(int i=0; i<n1; i++){
            K[i] = arr[start+i];
        }

        for(int j=0; j<n2; j++){
            K[j] = arr[mid+j+1];
        }


        int k = start;
        int i =0; int j=0;
        while (i<n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i>n1 ){
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j<n2){
            arr[k] = R[j];
            k++;
            j++;
        }
    }


    void sort(int arr[], int l, int r){
        if(l<r){
            int m=l + (r - l)/2;

            sort(arr, l, m);
            sort(arr, m+1, r);

            mergeSort(arr, l, m, r);

        }
    }


   static void printArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print( arr[i]+" ");
        }
    }



    static void kthnumber(int arr[], int k){
        System.out.println();
        for(int i=1; i<arr.length-1; i++){
            if(k == i){
                System.out.print("K value "+k+"   and    Out put :" +arr[i]);
            }
        }
    }


    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.println("\nSorted array");
        printArray(arr);

        kthnumber(arr, 4);
    }
}
