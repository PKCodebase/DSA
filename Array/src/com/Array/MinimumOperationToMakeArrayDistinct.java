package com.Array;

public class MinimumOperationToMakeArrayDistinct {
    public static int minimumOperations(int[] nums) {
        boolean[] value = new boolean[128];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (value[nums[i]]) {
                return i / 3 + 1;
            }
            value[nums[i]] = true;
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,2,3,3,5,7};


        int ans = minimumOperations(nums);
        System.out.println(ans);
    }

}
