package searching;

import static searching.FindDescendingIndex.findIndexDescending;
import static searching.FindIndex.findIndex;

public class FindIndexBothType {
    public static void FindIndexBothType(int arr[],int target){
       int start = 0;
       int end = arr.length-1;
       if(arr[start]<=arr[end]){
           findIndex(arr, target);
       }else{
           findIndexDescending(arr, target);
       }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,23,45,67,89,90};
        int[] arr1 = {90,89,67,45,23,6,5,4,3,2,1};
        FindIndexBothType(arr,67);
        FindIndexBothType(arr1, 67);
    }
}
