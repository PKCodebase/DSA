package cycle;

import java.util.Arrays;

public class CycleSort {
    public static void cycleSort(int arr[]){
        int n = arr.length;
        for(int cycle=0;cycle<n;cycle++){
            int item = arr[cycle];
            int position = cycle;
            for(int j = cycle+1;j<n;j++){
                if(arr[j]<item){
                    position++;
                }
            }
            int temp = item;
            item = arr[position];
            arr[position] = temp;

            while(position!=cycle){
                position = cycle;
                for(int j = cycle+1;j<n;j++){
                    if(arr[j]<item){
                        position++;
                    }
                }
                temp = item;
                item = arr[position];
                arr[position] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,4,5,6,5,8,9};
        System.out.println(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
