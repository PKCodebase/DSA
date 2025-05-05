package com.Array;

public class MaximumTripletMoreTime {
    public long maximumTripletValue(int[] nums) {
        long maxSum = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long value = (long) (nums[i] - nums[j]) * nums[k];
                    maxSum = Math.max(maxSum, value);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumTripletMoreTime m = new MaximumTripletMoreTime(); // ✅ Corrected object creation
        int nums[] = {12, 6, 1, 2, 7};
        long result = m.maximumTripletValue(nums);
        System.out.println(result);
    }
}
