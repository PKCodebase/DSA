package com.array;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurance {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        HashSet<Integer> uniqueFreq = new HashSet<>();

        // Check if all frequencies are unique
        for (int freq : freqMap.values()) {
            if (!uniqueFreq.add(freq)) { // If duplicate frequency is found
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3};
        System.out.println(uniqueOccurrences(arr));

    }
}
