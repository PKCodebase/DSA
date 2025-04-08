package searching.binary;

public class FindFirstAndLastOcuurance {
    public int[] searchRange(int arr[], int target) {
        int res [] = new int[2];
        int first = binarySearch(arr,target,true);
        int   last = binarySearch(arr,target,false);
        res[0] = first;
        res[1] = last;
        return res;
    }
    public static int binarySearch(int[] arr, int target,boolean isFirst) {

        int n= arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }     else{
                    start = mid + 1;
                }
            }else if(arr[mid]<target){
                start = mid + 1;

            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,23,45,67,89,90};
        int target = 4;
        FindFirstAndLastOcuurance obj = new FindFirstAndLastOcuurance();
        int[] res = obj.searchRange(arr, target);
        System.out.println("First Occurance : " + res[0]);
        System.out.println("Last Occurance : " + res[1]);
    }
}
