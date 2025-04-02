package com.array;

public class MaximumTriplet {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;


        int leftmax[] = new int[n];
        leftmax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], nums[i]);
        }


        int rightmax[] = new int[n];
        rightmax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], nums[i]);
        }


        for (int j = 1; j < n - 1; j++) {
            if (leftmax[j - 1] > nums[j]) {  // Ensure positive result
                long value = (long) (leftmax[j - 1] - nums[j]) * rightmax[j + 1];
                max = Math.max(max, value);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        MaximumTriplet m=new MaximumTriplet();
        int nums[]={1,2,3};
        System.out.println(m.maximumTripletValue(nums));
    }
}
