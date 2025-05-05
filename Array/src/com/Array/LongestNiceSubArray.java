package com.Array;

public class LongestNiceSubArray {
    public int longestNiceSubarray(int[] nums) {
        int start = 0;
        int maxLength=0;
        int bitMask = 0;
        int n = nums.length;
        for(int end = 0;end<n;end++){
            while((bitMask & nums[end]) !=0){
                bitMask = bitMask ^ nums[start];
                start++;
            }
            bitMask = bitMask | nums [end];
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestNiceSubArray longestNiceSubArray = new LongestNiceSubArray();
        int nums[] = {1,3,8,48,10};
        System.out.println(longestNiceSubArray.longestNiceSubarray(nums));
    }
}
