package codingcrack.linkedlistpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyPracticeLinked {

    public static int[] findTwoSumOptimized(List<Integer> a, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<a.size(); i++){
            int complement = target - a.get(i);
            if(map.containsKey(complement)){
                return new int[]{complement, i};
            }
            map.put(a.get(i), i);
        }
        return new int[0];
    }

    public static int[] findTwoSumBruteForce(List<Integer> nums, int target) {
        int n = nums.size();
        // Outer loop iterates through each element (i)
        for (int i = 0; i < n; i++) {
            // Inner loop iterates through all subsequent elements (j)
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the pair equals the target
                System.out.println(nums.get(j)+" ====== ");
                if (nums.get(i) + nums.get(j) == target) {
                    return new int[] { i, j }; // Return the indices of the pair
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[0];
    }

    public static void main(String[] args) {
        // Example list and target
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15);
        int targetValue = 9;

        System.out.println("--- Input ---");
        System.out.println("List: " + numbers);
        System.out.println("Target: " + targetValue);

        // Test Optimized Solution
        int[] resultOptimized = findTwoSumOptimized(numbers, targetValue);
        System.out.println("\n--- Optimized Solution (HashMap) ---");
        if (resultOptimized.length == 2) {
            System.out.println("Found indices: " + Arrays.toString(resultOptimized));
            System.out.printf("Pair is: %d + %d = %d\n",
                    numbers.get(resultOptimized[0]),
                    numbers.get(resultOptimized[1]),
                    targetValue
            );
        } else {
            System.out.println("No pair found.");
        }

        // Test Brute Force Solution
        int[] resultBruteForce = findTwoSumBruteForce(numbers, targetValue);
        System.out.println("\n--- Brute Force Solution (Nested Loops) ---");
        if (resultBruteForce.length == 2) {
            System.out.println("Found indices: " + Arrays.toString(resultBruteForce));
        } else {
            System.out.println("No pair found.");
        }

        // Example where no solution exists
        List<Integer> noSolutionNumbers = Arrays.asList(1, 2, 3, 4);
        int noSolutionTarget = 10;
        int[] noSolutionResult = findTwoSumOptimized(noSolutionNumbers, noSolutionTarget);
        System.out.println("\n--- No Solution Example ---");
        System.out.println("List: " + noSolutionNumbers + ", Target: " + noSolutionTarget);
        System.out.println("Result: " + (noSolutionResult.length == 0 ? "No pair found." : Arrays.toString(noSolutionResult)));
    }
}
