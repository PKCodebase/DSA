package com.array;

public class TwoSum {
    public static int[] twoSum(int arr[],int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Fix loop condition
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};  // Return indices directly
                }
            }
        }
        return new int[]{-1, -1};  // Return -1, -1 if no solution found
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(arr,target);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
