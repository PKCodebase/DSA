package searching.binary;

public class FindSmallestLetter_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = binarySearchCeil(letters,target);
        return res;
    }
    static char binarySearchCeil(char arr[],char target){
        char ans = '$';
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= target){
                start = mid+1;
            }else{
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return (ans == '$')?arr[0]:ans;
    }
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'c';
        FindSmallestLetter_744 obj = new FindSmallestLetter_744();
        char res = obj.nextGreatestLetter(letters, target);
        System.out.println("Ceil : " + res);
    }

}
