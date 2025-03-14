package com.sorting;

import java.util.Arrays;

public class BubbleSortOptimizedMore {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i=1;i<=n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
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
