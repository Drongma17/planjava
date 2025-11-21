package com.ididlo;

import java.util.Arrays;

public class TrainStation {
    public static int findMinimumStations(int[] arrival, int[] departure, int n) {
        // Sort arrival and departure arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformNeeded = 1; // at least one platform for the first train
        int maxPlatforms = 1;
        int i = 1, j = 0;

        // Traverse the arrival and departure arrays
        while (i < n && j < n) {
            // If next train arrives before previous departs, need more platforms
            if (arrival[i] <= departure[j]) {
                platformNeeded++;
                i++;
            } else { 
                // One train departs, free a platform
                platformNeeded--;
                j++;
            }
            // Keep track of maximum platforms required
            maxPlatforms = Math.max(maxPlatforms, platformNeeded);
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;

        int result = findMinimumStations(arrival, departure, n);
        System.out.println("Minimum number of train stations required: " + result);
    }
}