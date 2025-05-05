package com.Array;

import java.util.Arrays;

public class MinimumDiffernceBetweenHighestAndLowest {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0; // If selecting only one student, difference is 0

        Arrays.sort(nums); // Step 1: Sort the array

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Sliding window to find the minimum difference
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i]; // Difference between max and min in the window
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        MinimumDiffernceBetweenHighestAndLowest minimumDiffernceBetweenHighestAndLowest = new MinimumDiffernceBetweenHighestAndLowest();
        int nums[] = {8,2,7,6};
        System.out.println(minimumDiffernceBetweenHighestAndLowest.minimumDifference(nums,3));
    }
}
