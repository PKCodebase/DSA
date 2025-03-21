package quick;

public class QuickSortWithLomuto {
    public static int lomutoPartition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i =low-1;

        for(int j=low;j<=high;j++){
            if(arr[j]<=pivot){
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return (i);
    }
    public static void quickSort(int arr[],int low,int high) {
        if (low < high) {
            int pivotIndex = lomutoPartition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1, high);

        }
    }
        public static void main(String[] args) {
            int[] arr = {7,5,13,6,9,12,4,8};
            int low = 0;
            int high = arr.length - 1;
            quickSort(arr, low, high);
            System.out.println("Array after partitioning:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

}
