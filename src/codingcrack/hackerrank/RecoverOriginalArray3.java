package codingcrack.hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RecoverOriginalArray3 {

    public int[] recoverArray(int[] nums) {
        Arrays.sort(nums);  // Important to sort
        ArrayList<Integer> diff = new ArrayList<>();

        // temp is greater than zero and even then add to diff
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] - nums[0];
            if (temp > 0 && temp % 2 == 0)
                diff.add(temp);
        }

        for (int num : diff) {
            ArrayList<Integer> arr = checkDiff(nums, num);
            if (arr.size() == nums.length / 2) {
                return arr.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return new int[]{};
    }

    public ArrayList<Integer> checkDiff(int[] nums, int diff) {
        Map<Integer, Integer> fre = new HashMap<>();
        for (int num : nums) {
            // creating frequence of each num
            fre.put(num, fre.getOrDefault(num, 0) + 1);  //
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (fre.getOrDefault(num, 0) > 0 && fre.getOrDefault(num + diff, 0) > 0) {
                ans.add(num + diff / 2);
                fre.put(num, fre.get(num) - 1);
                fre.put(num + diff, fre.get(num + diff) - 1);
            }
        }
        return ans;
    }

    // Optional: Add a main method to test it
    public static void main(String[] args) {
        RecoverOriginalArray3 sol = new RecoverOriginalArray3();
        int[] nums = {2, 10, 6, 4, 8, 12};// Example input
        System.out.println(Arrays.toString(sol.recoverArray(nums)));
    }
}