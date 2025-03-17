package com.sorting;

public class MergeSort {
    public static void mergeArray(int arr[],int low,int mid,int high){

        int m = mid-low;
        int n = high-mid+1;

        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i] = arr[i];
        }
        int b[] = new int[n];
        for(int j=0;j<n;j++){
            b[j] = arr[mid+j];
        }

    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7,18,90 };
        int high = arr.length-1;
        int low=0;
        int mid =3;
        mergeArray(arr,low,high,mid);
    }

}
