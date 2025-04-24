package codingcrack.leetcode;


  /*
  You have n dice, and each dice has k faces numbered from 1 to k.

Given three integers n, k, and target,
return the number of possible ways (out of the kn total ways)
 to roll the dice, so the sum of the face-up numbers equals target.
 Since the answer may be too large, return it modulo 109 + 7.
   */

public class DiceRolls {

    private static final int MOD = 1_000_000_007;

    public static int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000007;
        // dp[i][j] represents the number of ways to get a sum of j using i dice.
        int[][] dp = new int[n + 1][target + 1];

        // Base case: When using 0 dice, there is 1 way to get a sum of 0.
        dp[0][0] = 1;

        // Iterate through the number of dice
        for (int i = 1; i <= n; i++) {
            // Iterate through the possible target sums
            for (int j = 1; j <= target; j++) {
                // Iterate through the possible face values of the current die
                for (int face = 1; face <= k; face++) {
                    // If the current face value is less than or equal to the current target sum,
                    // we can consider this face value as the last roll.
                    if (j >= face) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - face]) % MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }


    public static void main(String[] args) {
        int n = 2;       // Number of dice
        int k = 6;       // Number of faces per dice
        int target = 7;  // Target sum

        int ways = numRollsToTarget(n, k, target);
        System.out.println("Number of ways to reach target: " + ways);
    }
}