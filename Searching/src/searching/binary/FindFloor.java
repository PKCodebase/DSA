package searching.binary;

public class FindFloor {
    public static int binarySearchFloor(int arr[],int target){
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
                ans = arr[mid];
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,23,45,67,89,90};
        int target = 22;
        int res = binarySearchFloor(arr,target);
        System.out.println("Floor : " + res);
    }
}
