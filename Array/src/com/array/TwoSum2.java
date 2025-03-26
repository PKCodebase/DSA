package com.array;

import java.util.HashMap;

public class TwoSum2 {
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
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
