package com.chatgpt.problemsolving;

public class countNonOverlappingSegments11111 {
    public static int numberOfSets(int n, int k) {
        final int MOD = 1_000_000_007;
        int[][] dp = new int[n][k + 1];
        int[][] prefix = new int[n][k + 1];
        
        // Base case: 0 segments
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1; // 1 way to select 0 segments
            prefix[i][0] = 1; // Prefix sum for j = 0
        }
        
        for (int j = 1; j <= k; j++) {
            for (int i = 1; i < n; i++) {
                // Add the current segment ending at i
                dp[i][j] = (dp[i - 1][j] + prefix[i - 1][j - 1]) % MOD;
                // Update prefix sum
                prefix[i][j] = (prefix[i - 1][j] + dp[i][j]) % MOD;
            }
        }
        
        return dp[n - 1][k];
    }


    public static void main(String[] args) {
        System.out.println("the segment "+ numberOfSets(4,2));
    }
}