package searching.binary;

public class FindCeil {
    public static int binarySearchCeil(int arr[],int target){
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,23,45,67,89,90};
        int target = 22;
        int res = binarySearchCeil(arr,target);
        System.out.println("Floor : " + res);
    }
}
