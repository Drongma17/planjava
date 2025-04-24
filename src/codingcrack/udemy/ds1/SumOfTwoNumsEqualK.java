package codingcrack.udemy.ds1;

import java.util.Arrays;

public class SumOfTwoNumsEqualK {


    public static int sumEqualK(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int count = 0;
        int sum = 0;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            }
            else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k = 5;
        int i = SumOfTwoNumsEqualK.sumEqualK(arr, k);
        System.out.println("number of match : "+i);
    }
}