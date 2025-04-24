package codingcrack.udemy.ds1;

import java.util.Arrays;

class CountOfSumOfTwoEqualToK {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0,right=n-1;
        int c=0;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k) {
                c++;
                left++;
                right--;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return c;
    }


    public static void main(String[] args) {

        int[] nums = {1,2,3,4}; int k = 5;
        int i = CountOfSumOfTwoEqualToK.maxOperations(nums, k);
        System.out.println(i);
    }
}