package com.array;

public class MinumumOperationArrayElementEqualToOne {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int s=0;s<(n-2);s++){
            if(nums[s]==0){
                nums[s] = 1-nums[s];
                nums[s+1] = 1-nums[s+1];
                nums[s+2] = 1-nums[s+2];
                count++;
            }
        }
        if(nums[n-1]==0 || nums[n-2]==0){
            return -1;
        }
        return count;
    }
    public static void main(String[] args) {
        MinumumOperationArrayElementEqualToOne minumumOperationArrayElementEqualToOne = new MinumumOperationArrayElementEqualToOne();
        int nums[] = {0,1,1,0};
        System.out.println(minumumOperationArrayElementEqualToOne.minOperations(nums));
    }
}
