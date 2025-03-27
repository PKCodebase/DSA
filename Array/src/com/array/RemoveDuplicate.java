package com.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main (String args[]){
        int [] arr = {23,45,67,89,56,45,67,13,78};

        Arrays.sort(arr);
        Set<Integer> mylist = new LinkedHashSet<>();
        for(int num:arr){
            mylist.add(num);
        }
        System.out.println(mylist);
    }
}
