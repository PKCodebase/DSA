package quick;

import java.util.Arrays;

public class SimplePartition {
    public static void simplePartition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int n = high-low+1;

     int temp[] = new int[n];
     int k = low;

     for(int i=low;i<=high;i++){
         if(arr[i]<=pivot){
             temp[k++] = arr[i];
         }
     }

     for(int i=low;i<=high;i++){
         if(arr[i]>pivot){
             temp[k++] = arr[i];
         }
     }
     for(int i=low;i<=high;i++){
         arr[i] = temp[i-low];
     }
    }
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50,12,6,19, 70};
        int low = 0;
        int high = arr.length - 1;
        simplePartition(arr, low, high);
        System.out.println("Array after partitioning:");
        System.out.println(Arrays.toString(arr));
    }

}

//Time:O(3n)
//Space:O(n)
