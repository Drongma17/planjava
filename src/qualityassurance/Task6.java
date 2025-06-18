package qualityassurance;

public class Task6 {

    // Return the largest element in the array.
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 1, 4};
        System.out.println(findMax(nums)); // Output: 9
    }
}