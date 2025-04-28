package problems;

public class MaxSumSubArrayOfSizeK {
    public static int maximumSubArray(int[] arr, int k){
        int n = arr.length;
        if (n < k) return -1; // not enough elements

        int sum = 0;
        int maxSum = 0;
        int start = 0;
        int end = 0;

        // Make first window sum
        while (end < k) {
            sum += arr[end];
            end++;
        }

        maxSum = sum;

        // Slide the window
        while (end < n) {
            sum = sum + arr[end] - arr[start];
            maxSum = Math.max(maxSum, sum);
            start++;
            end++;
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maximumSubArray(arr, k));
    }
}
