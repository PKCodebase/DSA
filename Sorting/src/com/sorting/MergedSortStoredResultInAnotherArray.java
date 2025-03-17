package com.sorting;

import java.util.Arrays;

public class MergedSortStoredResultInAnotherArray {
    public static int[] mergedTwoArray(int a[],int b[]){
        int m = a.length;
        int n = b.length;

        int temp[] = new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(a[i]<=b[j]){
                temp[k++] = a[i];
                i++;
            }else{
                temp[k++] = b[j];
                j++;
            }
        }

        while(i<m){
            temp[k++] = a[i];
            i++;
        }
        while(j<n){
            temp[k++] = b[j];
            j++;
        }
        return temp;

    }
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6, 8, 10};
        int c[]=mergedTwoArray(a,b);
        System.out.println(Arrays.toString(c));
    }
}
