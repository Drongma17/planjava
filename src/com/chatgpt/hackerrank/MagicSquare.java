package com.chatgpt.hackerrank;

import java.util.Arrays;

public class MagicSquare {
    // All possible 3x3 magic squares
    private static final int[][][] MAGIC_SQUARES = {
        { {8, 1, 6}, {3, 5, 7}, {4, 9, 2} },
        { {6, 1, 8}, {7, 5, 3}, {2, 9, 4} },
        { {4, 9, 2}, {3, 5, 7}, {8, 1, 6} },
        { {2, 9, 4}, {7, 5, 3}, {6, 1, 8} },
        { {8, 3, 4}, {1, 5, 9}, {6, 7, 2} },
        { {4, 3, 8}, {9, 5, 1}, {2, 7, 6} },
        { {6, 7, 2}, {1, 5, 9}, {8, 3, 4} },
        { {2, 7, 6}, {9, 5, 1}, {4, 3, 8} }
    };

    // Calculate the cost to transform a given matrix into a magic square
    private static int calculateCost(int[][] input, int[][] magic) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(input[i][j] - magic[i][j]);
            }
        }
        return cost;
    }

    public static int formingMagicSquare(int[][] s) {
        int minCost = Integer.MAX_VALUE;

        // Compare input matrix with all possible magic squares
        for (int[][] magic : MAGIC_SQUARES) {
            int cost = calculateCost(s, magic);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    public static void main(String[] args) {
        // Input 3x3 matrix
        int[][] inputMatrix = {
            {4, 8, 7},
            {3, 5, 6},
            {8, 1, 2}
        };

        // Calculate the minimal cost to convert input to a magic square
        int cost = formingMagicSquare(inputMatrix);

        // Output the result
        System.out.println("Minimal cost to convert to a magic square: " + cost);
    }
}