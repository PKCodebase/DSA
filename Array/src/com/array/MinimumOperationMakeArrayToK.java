package com.array;

import java.util.HashSet;
import java.util.Set;

public class MinimumOperationMakeArrayToK {
    public static int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<k){
                return -1;
            }if(nums[i]>k){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        int nums[] = {2,3,3,2,4,4,1,5,1};
        int k = 1;
        System.out.println(minOperations(nums,k));
    }

}
