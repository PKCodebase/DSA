package com.Array;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        reverse(nums, 0, n - 1);  // Step 1: Reverse entire array
        reverse(nums, 0, k - 1);  // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);  // Step 3: Reverse remaining n-k elements
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1,-100,3,99};
        rotate(nums,2);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
