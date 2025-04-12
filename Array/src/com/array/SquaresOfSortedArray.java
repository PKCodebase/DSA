package com.array;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int left = 0;
        int right = n - 1;
        int j = n - 1;

        while (left <= right) {
            int sqL = nums[left] * nums[left];
            int sqR = nums[right] * nums[right];
            if (sqL >= sqR) {
                result[j] = sqL;
                left++;
            } else {
                result[j] = sqR;
                right--;
            }
            j--;
        }

        return result;
    }
    public static void main(String[] args) {
        SquaresOfSortedArray s=new SquaresOfSortedArray();
        int nums[]={-4,-1,0,3,10};
        int ans[]=s.sortedSquares(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
