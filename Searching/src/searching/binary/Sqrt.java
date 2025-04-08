package searching.binary;

public class Sqrt {
    public static int mySqrt(int num){

        if(num<2){
            return num;
        }
        long start = 2;
        long end = num/2;
        long result = 0;
        while(start<=end){
            long mid = (start + end)/2;
            result = mid * mid ;

            if(result == num){
                return (int) mid;
            }
            else if(result<num){
                start = mid + 1;
            }else if (result>num){
                end =  mid -1;
            }

        }
        return (int) end;

    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println(mySqrt(num));
    }
}
