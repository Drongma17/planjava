package com.interview.leetest;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

//    check whether sum of two number in array equal to the target number
    public static int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int element = nums[i];
            int remaining = target - element;
            if(map.containsKey(remaining)){
                System.out.println("["+map.get(remaining)+","+ i+ "]");
                System.out.println(nums[map.get(remaining)] +" +  " + nums[i] + " = " + target);
                return new int[]{map.get(remaining), i};
            }
           map.put(element, i);
        }
        return null;
        
    }
    
    public static void main(String[] args){
       int[] nums ={2,7,11,15};
        Arrays.stream(nums).forEach(x-> System.out.print(x+",  "));
        System.out.println();
        int target = 22;
        twoSum(nums, target);
    }
}