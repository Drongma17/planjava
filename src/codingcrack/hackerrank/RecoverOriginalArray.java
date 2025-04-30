package codingcrack.hackerrank;

import java.util.*;

public class RecoverOriginalArray {

    public static int[] recoverArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[0];
            if (diff % 2 != 0 || diff == 0) continue;
            int k = diff / 2;

            Map<Integer, Integer> counter = new HashMap<>();
            for (int num : nums) {
                counter.put(num, counter.getOrDefault(num, 0) + 1);
            }

            List<Integer> arr = new ArrayList<>();
            for (int num : nums) {
                if (counter.getOrDefault(num, 0) == 0) continue;
                int partner = num + 2 * k;
                if (counter.getOrDefault(partner, 0) == 0) break;

                arr.add(num + k);
                counter.put(num, counter.get(num) - 1);
                counter.put(partner, counter.get(partner) - 1);
            }

            if (arr.size() == n) {
                return arr.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        return new int[0]; // No valid array found
    }

    public static void main(String[] args) {
        int[] nums = {2, 10, 6, 4, 8, 12}; // Example input  2,6,10,4,8,12
        int[] original = recoverArray(nums);  // 2,4,6,8,10,12

        System.out.print("Recovered Original Array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}
