package com.array;

public class CountGoodTripletsArray {public long goodTriplets(int[] nums1, int[] nums2) {
    int n = nums1.length;

    // Map each value to its position in nums2
    int[] pos = new int[n];
    for (int i = 0; i < n; i++) {
        pos[nums2[i]] = i;
    }

    // Convert nums1 to positions in nums2
    int[] converted = new int[n];
    for (int i = 0; i < n; i++) {
        converted[i] = pos[nums1[i]];
    }

    // Initialize Fenwick tree (Binary Indexed Tree)
    FenwickTree bit = new FenwickTree(n);

    // Count good triplets
    long result = 0;

    for (int i = 0; i < n; i++) {
        // Count smaller elements to the left
        int smallerLeft = bit.sum(converted[i]);

        // Count larger elements to the right
        int largerRight = n - 1 - converted[i] - (i - smallerLeft);

        // Add to result the number of good triplets with this element as the middle
        result += (long) smallerLeft * largerRight;

        // Update the Fenwick tree to mark this position as visited
        bit.update(converted[i], 1);
    }

    return result;
}

    // Fenwick Tree (Binary Indexed Tree) implementation
    class FenwickTree {
        private int[] tree;

        public FenwickTree(int size) {
            tree = new int[size + 1];
        }

        // Update value at position i
        public void update(int i, int val) {
            i++; // 1-indexed
            while (i < tree.length) {
                tree[i] += val;
                i += i & -i; // Add the least significant bit
            }
        }

        // Get sum from 0 to i (inclusive)
        public int sum(int i) {
            i++; // 1-indexed
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i; // Remove the least significant bit
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        CountGoodTripletsArray countGoodTripletsArray = new CountGoodTripletsArray();
        int nums1[] = {2,0,1,3};
        int nums2[] = {0,1,2,3};
        System.out.println(countGoodTripletsArray.goodTriplets(nums1,nums2));
    }
}
