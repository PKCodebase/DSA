package com.sorting;

import java.util.Arrays;

public class MergeSort {
    
public static void mergeArray(int arr[], int start, int mid, int end) {
  int m = mid -start+1;
  int n = end - mid;

  int a[] = new int[m];
  for(int i=0;i<m;i++){
      a[i] = arr[start+i];
  }
  int b[] = new int[n];
  for(int j=0;j<n;j++){
      b[j] = arr[mid+j+1];
  }
  int i=0;
  int j=0;
  int k=start;

  while(i<m && j<n){
      if(a[i]<=b[j]){
          arr[k++] = a[i++];
      }else{
          arr[k++] = b[j++];
      }
  }
  while(i<m){
      arr[k++] = a[i++];
  }
  while(j<n){
      arr[k++] = b[j++];
  }


}


    public static void mergeSort(int arr[],int start,int end) {
        if (start < end) {
            int mid = start+(end-start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            mergeArray(arr, start, mid, end);
        }



    }
    public static void main(String[] args) {
        int arr[] = { 10,5 };
        int start=0;
        int end = arr.length-1;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

}
