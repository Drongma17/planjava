package com.ididlo;

import java.util.Arrays;

public class MinimumPlatforms {

    public static int findMinPlatforms(int[] arrival, int[] departure) {
        // Sort both arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int platformNeeded = 1;   // at least one platform needed for first train
        int maxPlatforms = 1;
        int i = 1;  // pointer for arrival
        int j = 0;  // pointer for departure

        // Traverse the arrival and departure arrays
        while (i < n && j < n) {
            // If next train arrives before the previous one departs -> need extra platform
            if (arrival[i] <= departure[j]) {
                platformNeeded++;
                i++;
            } 
            // If train departs before next train arrives -> free a platform
            else if (arrival[i] > departure[j]) {
                platformNeeded--;
                j++;
            }

            // Update result if needed
            maxPlatforms = Math.max(maxPlatforms, platformNeeded);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        // Example schedule (in 24-hour format)
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int requiredPlatforms = findMinPlatforms(arrival, departure);
        System.out.println("Minimum Number of Platforms Required = " + requiredPlatforms);
    }
}
