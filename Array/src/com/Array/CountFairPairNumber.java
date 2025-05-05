package com.Array;

import java.util.Arrays;

public class CountFairPairNumber {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        long count = 0;
        int l = 0, r = nums.length - 1;
        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum <= upper && sum >= lower){
                //binary search to find the uppper bound
                int low = l + 1;
                int high = r;
                int start = r + 1;

                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (nums[l] + nums[mid] >= lower) {
                        start = mid;
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
                count += (r - start + 1);
                l++;
            }else if(sum > upper){
                r--;
            }else if(sum < lower){
                l++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        CountFairPairNumber countFairPairNumber = new CountFairPairNumber();
        int nums[] = {0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;
        System.out.println(countFairPairNumber.countFairPairs(nums,lower,upper));
    }
}
