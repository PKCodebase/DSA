package com.Array;

public class CountEqualAndDivisiplePair { public int countPairs(int[] nums, int k) {
    int n = nums.length;
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]==nums[j] && (i*j)%k==0){
                count++;
            }
        }
    }
    return count;
}
public static void main(String[] args) {
    CountEqualAndDivisiplePair c = new CountEqualAndDivisiplePair();
    int nums[] = {3, 1, 2, 2, 2, 1, 3};
    int k = 2;
    int ans = c.countPairs(nums, k);
    System.out.println(ans);
}
}
