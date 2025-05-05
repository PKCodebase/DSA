package com.Array;

public class MakeArrayNonDecreasing {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int n = nums.length;
        int prev=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<prev){
                count++;
            }else{
                prev=nums[i];
            }
        }
        return n-count;

    }
    public static void main(String[] args) {
        MakeArrayNonDecreasing m = new MakeArrayNonDecreasing();
        int nums[] = {5,3,4,4,2,3,1};
        int ans = m.maximumPossibleSize(nums);
        System.out.println(ans);
    }
}
