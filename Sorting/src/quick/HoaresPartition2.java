package quick;

public class HoaresPartition2 {
    public static void hoaresPartition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (true) {

             while (arr[i] < pivot){
                 i++;
             }

           while (arr[j] > pivot){
               j--;
           }

            if (i >= j) {
                return;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        int low = 0;
        int high = arr.length - 1;
        hoaresPartition(arr, low, high);
        System.out.println("Array after partitioning:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
