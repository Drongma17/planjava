package codingcrack.udemy.ds1;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    public int[] productExceptSelf1(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int pro = 1;
            for(int j=0; j< nums.length; j++){
                if(i != j){
                    pro *= nums[j];
                }
            }
            arr[i] = pro;
        }
        return arr;
    }

    public static int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            Arrays.fill(ans, 1);
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        ans[i] *= nums[j];
                    }
                }
            }
            return ans;
        }



    public static void main(String[] args) {
        int[] nums = {2,3,4,6};

        for (int i : ProductOfArrayExceptSelf.productExceptSelf(nums)) {
            System.out.print(i+" ");
        }

    }

}
