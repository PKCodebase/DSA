package heap;

public class HeapSort {
    public static void heapiFy(int arr[],int n,int i){
        int maxIndex = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left] > arr[maxIndex]){
            maxIndex = left;
        }
        if(right < n && arr[right] > arr[maxIndex]){
            maxIndex = right;
        }
        if(maxIndex != i){
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            heapiFy(arr,n,maxIndex);
        }
    }

    public static void heapSort(int arr[]){
        int n = arr.length;
       buildMaxHeap(arr);
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapiFy(arr, i, 0);
        }
    }
    public static void buildMaxHeap(int arr[]){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapiFy(arr, n, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50,12,6,19, 70};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
