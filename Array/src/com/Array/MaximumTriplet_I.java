package com.Array;

public class MaximumTriplet_I {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxTripletValue =0,maxFirstElement  =0,maxDifference =0;
        for(int k = 0;k<n;k++){
            maxTripletValue = Math.max(maxTripletValue,maxDifference*nums[k]);
            maxDifference = Math.max(maxDifference,maxFirstElement-nums[k]);
            maxFirstElement = Math.max(maxFirstElement,nums[k]);
        }

        return maxTripletValue;
    }
    public static void main(String[] args) {
        MaximumTriplet_I m=new MaximumTriplet_I();
        int nums[]={12,6,1,2,7};
        System.out.println(m.maximumTripletValue(nums));
    }
}
