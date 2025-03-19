package insertion;

public class LomutoPartition {
    public static void lomutoPartition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i =low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,13,6,9,12,4,8};
        int low = 0;
        int high = arr.length - 1;
        lomutoPartition(arr, low, high);
        System.out.println("Array after partitioning:");
    }
}

//Time-O(n)
//Space-O(1)
