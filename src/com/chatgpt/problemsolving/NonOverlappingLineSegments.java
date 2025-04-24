package com.chatgpt.problemsolving;

import java.util.*;

/*
write a java code to show Number of sets of K non-overlapping line segments.
 */
public class NonOverlappingLineSegments {

    public static int countNonOverlappingSegments(int[] x, int[] l, int n, int k) {
        // If k is greater than the number of points, it's impossible
        if (k > n) {
            return 0;
        }

        // Create a list to store the end points of each segment
        List<Integer> endPoints = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            endPoints.add(x[i] + l[i]);
        }

        // Sort the end points
        Collections.sort(endPoints);

        // Initialize the count of non-overlapping segments
        int count = 0;

        // Iterate through the sorted end points
        for (int i = 0; i <= n - k; i++) {
            // Check if the next k segments are non-overlapping
            if (endPoints.get(i + k - 1) <= endPoints.get(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] x = {1, 3, 4, 5, 8};
        int[] l = {10, 1, 2, 2, 5};
        int n = x.length;
        int k = 3;

        int result = countNonOverlappingSegments(x, l, n, k);
        System.out.println("Number of sets of " + k + " non-overlapping line segments: " + result);
    }
}