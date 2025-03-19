package bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n;i++){
//            System.out.println("Round"+i);
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
