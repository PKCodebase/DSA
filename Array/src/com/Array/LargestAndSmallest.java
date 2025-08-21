package com.Array;

public class LargestAndSmallest {
    public static void largestAndSamllest(int nums[]){

        if(nums.length==0 || nums== null){
            System.out.println("Array is empty");
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num:nums){
            if(num > max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("Largest number is: "+max);
        System.out.println("Smallest number is: "+min);

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        largestAndSamllest(nums);
    }
}
