package com.sorting;

import java.util.Arrays;

public class SortElement {
    public static void main(String[] args) {
        int arr1[] = {7,8, 1, 2,6, 3, 4, 5 };

        char ch[]= {'A','N','J','K','L','F','B'};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
    }
}
