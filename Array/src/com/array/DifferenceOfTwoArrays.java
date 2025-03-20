package com.array;

import java.util.*;

public class DifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num1 : nums1){
            set1.add(num1);

        }
        for(int num2:nums2){
            set2.add(num2);
        }

        List<Integer> list1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        return Arrays.asList(list1, list2);

    }
    public static void main(String[] args) {
        DifferenceOfTwoArrays differenceOfTwoArrays = new DifferenceOfTwoArrays();
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        System.out.println(differenceOfTwoArrays.findDifference(nums1,nums2));
    }
}
