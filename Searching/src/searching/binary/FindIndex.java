package searching.binary;

public class FindIndex {
    public static void findIndex(int[] arr, int target) {

        int n= arr.length;
     int start = 0;
     int end = n-1;
     int ans = -1;



     while(start<=end){
         int mid = start + (end - start)/2;
         if(arr[mid] == target){
             ans = mid;
             break;
         }else if(arr[mid]<target){
             start = mid + 1;

         }else{
             end = mid-1;
         }
     }
     if(ans == -1){
         System.out.println("Element Not Found");
     }else{
         System.out.println("Element  Found at Index : " + ans);
     }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,23,45,67,89,90};
        int target = 5;
        findIndex(arr,target);
    }
}
