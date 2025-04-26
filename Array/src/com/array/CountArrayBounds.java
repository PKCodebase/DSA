package com.array;

public class CountArrayBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int skip = -1;
        int min = -1;
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                skip=i;
            }if(nums[i]==minK){
                min=i;
            }if(nums[i]==maxK){
                max=i;
            }
            int result = Math.min(min,max);
            if(result>skip){
                count += result - skip;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountArrayBounds obj = new CountArrayBounds();
        int nums[] = {1,3,5,2,7,5};
        System.out.println(obj.countSubarrays(nums,1,5));
    }
}
