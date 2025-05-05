package com.Array;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = currentSum + nums[i];
        }
        return (totalSum - currentSum);
    }
    public static void main(String[] args) {
        int nums[] = {3,0,2,6,5,4};
        System.out.println(missingNumber(nums));
    }

}
