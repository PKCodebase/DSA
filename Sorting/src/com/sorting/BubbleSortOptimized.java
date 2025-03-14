package com.sorting;

import java.util.Arrays;

public class BubbleSortOptimized {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

//Time : O(n2)
//Space : O(1)