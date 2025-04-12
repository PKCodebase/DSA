package twopointer;

public class MaximumOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        char arr[] = s.toCharArray();
        while (left <= right) {
            if (arr[left] == '1') {
                left++;
            }
            if (arr[right] == '0') {
                right--;
            }
            if (left < right && arr[left] == '0' && arr[right] == '1') {
                arr[left] = '1';
                arr[right] = '0';
            }
        }
        arr[right] = '0';
        arr[n - 1] = '1';
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "010";
        System.out.println(maximumOddBinaryNumber(s));
    }

}
