package com.chatgpt.problemsolving;

public class MergeSort {

    // Main function to sort an array using Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort the left half
            mergeSort(array, left, mid);

            // Sort the right half
            mergeSort(array, mid + 1, right);

            // Merge the two halves
            merge(array, left, mid, right);
        }
    }

    // Function to merge two sorted halves
    private static void merge(int[] array, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0; // Initial indexes of the two subarrays
        int k = left; // Initial index of the merged array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of the left array
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of the right array
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the merge sort algorithm
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}