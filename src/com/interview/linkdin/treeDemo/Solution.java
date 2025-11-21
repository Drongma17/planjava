package com.interview.linkdin.treeDemo;

import java.util.HashMap;
import java.util.Map;

class Solution {
   public static HashMap<Integer, Integer> map = new HashMap<>();
    public static int[] twoSum(int[] nums, int target) throws IllegalArgumentException{

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
        int target = 17;
        twoSum(nums, target);
    }
}