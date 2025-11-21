package codingcrack.coderbyte;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums and an integer k,
return true if there are two distinct indices i and j
in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsDuplicate(nums, k));
    }


    public static boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            } else {
                int passIndex = hm.get(nums[i]);
                if (Math.abs(passIndex - i) <= k) {
                    return true;
                } else {
                    hm.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
