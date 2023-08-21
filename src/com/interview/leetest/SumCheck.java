package com.interview.leetest;

import java.util.HashMap;

public class SumCheck {
  public static boolean checkSum(int[] arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(target - arr[i])) {
        int ele = target - arr[i];
        System.out.println(target +" is sum of "+ arr[i] + " and " + ele);
        return true;
      } else {
        map.put(arr[i], i);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int target = 9;
    System.out.println(checkSum(arr, target));
  }
}
