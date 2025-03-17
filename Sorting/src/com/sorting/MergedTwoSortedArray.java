package com.sorting;

import java.util.Arrays;

public class MergedTwoSortedArray {

    public static void mergedTwoArrays(int a[],int b[]){
        int m = a.length;
        int n = b.length;

         int i = 0;
         int j = 0;

         while(i<m && j<n){
             if(a[i] <= b[j]){
                 System.out.print(a[i]+" ");
                 i++;
             }else{
                 System.out.print(b[j]+" ");
                 j++;
             }
         }
         while(i<m){
             System.out.print(a[i]+" ");
             i++;
         }
         while(j<n){
             System.out.print(b[j]+" ");
             j++;
         }

    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6, 8, 10};
       mergedTwoArrays(a,b);
    }
}
