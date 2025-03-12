package com.sorting;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
      Integer arr[] = {7,8, 1, 2,6, 3, 4, 5 };



//      Arrays.sort(arr);
//      System.out.println(Arrays.toString(arr));

      Arrays.sort(arr, Collections.reverseOrder());
      System.out.println(Arrays.toString(arr));
    }
}
