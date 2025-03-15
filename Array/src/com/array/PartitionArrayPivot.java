package com.array;

public class PartitionArrayPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ans[]=new int[n];
        int l=0,r=n-1;
        for(int i=0,j=r;i<n;i++,j--){
            if(nums[i]<pivot){
                ans[l]=nums[i];
                l++;
            }
            if(nums[j]>pivot){
                ans[r]=nums[j];
                r--;
            }
        }
        while(l<=r){
            ans[l]=pivot;
            l++;
        }
        return ans;
    }
    public static void main(String[] args) {
        PartitionArrayPivot p=new PartitionArrayPivot();
        int nums[]={9,12,5,10,14,3,10};
        int pivot=10;
        int ans[]=p.pivotArray(nums, pivot);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
