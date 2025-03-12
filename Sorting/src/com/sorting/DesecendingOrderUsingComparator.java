package com.sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b-a ;
    }
}
public class DesecendingOrderUsingComparator {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Arrays.sort(arr, new MyIntegerComparator());
        System.out.println(Arrays.toString(arr));
    }
}
