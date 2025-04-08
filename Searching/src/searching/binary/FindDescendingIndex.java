package searching.binary;

public class FindDescendingIndex {
    public static void findIndexDescending(int nums[],int target){

        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid]<target){
                end = mid- 1;
            }else{
                start = mid+1;
            }
        }
        if(ans == -1){
            System.out.println("Element Not Found");
        }else{
            System.out.println("Element  Found at Index : " + ans);
        }
    }
    public static void main(String[] args) {
        int[] nums = {90,89,67,45,23,6,5,4,3,2,1};
        int target = 5;
        findIndexDescending(nums,target);
    }
}
