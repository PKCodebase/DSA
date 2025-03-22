package heap;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int temp=0;
        int max ;
        for(int i=0;i<arr.length;i++ ){
            max =i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[max])
                {
                    max = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
