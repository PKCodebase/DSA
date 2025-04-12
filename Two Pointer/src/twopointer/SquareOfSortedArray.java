package twopointer;

public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int left = 0;
        int right = n - 1;
        int j = n - 1;

        while (left <= right) {
            int sqL = nums[left] * nums[left];
            int sqR = nums[right] * nums[right];
            if (sqL >= sqR) {
                result[j] = sqL;
                left++;
            } else {
                result[j] = sqR;
                right--;
            }
            j--;
        }

        return result;
    }
    public static void main(String[] args) {
        SquareOfSortedArray obj = new SquareOfSortedArray();
        int[] nums = {-4,-1,0,3,10};
        int[] result = obj.sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
