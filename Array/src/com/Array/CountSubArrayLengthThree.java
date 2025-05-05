package com.Array;

public class CountSubArrayLengthThree {
    public static int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-2;i++){
            if((nums[i] + nums[i+2])*2 == nums[i+1]){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1,4,1};
        System.out.println(countSubarrays(nums));
    }
}
