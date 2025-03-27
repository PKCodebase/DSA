package com.array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumOperationToMakeUniqueGrid {
    public int minOperations(int[][] grid, int x) {
        List<Integer> nums = new ArrayList<>();

        // Step 1: Flatten the grid and check feasibility
        int remainder = grid[0][0] % x;
        for (int[] row : grid) {
            for (int num : row) {
                if (num % x != remainder) return -1; // Not possible
                nums.add(num);
            }
        }

        // Step 2: Sort to find median
        Collections.sort(nums);
        int median = nums.get(nums.size() / 2);

        // Step 3: Compute operations
        int totalOperations = 0;
        for (int num : nums) {
            totalOperations += Math.abs(num - median) / x;
        }

        return totalOperations;
    }

    public static void main(String[] args) {
        MinimumOperationToMakeUniqueGrid minimumOperationToMakeUniqueGrid = new MinimumOperationToMakeUniqueGrid();
        int grid[][] = {{2, 4}, {6, 8}};
        System.out.println(minimumOperationToMakeUniqueGrid.minOperations(grid, 2));
    }
}
