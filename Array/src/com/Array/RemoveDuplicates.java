package com.Array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // Pointer for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { // New unique element found
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1; // New length of unique elements
    }
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 4, 4};
        int ans = removeDuplicates(nums);

        // Loop through only the unique elements
        System.out.print("Unique Elements: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
