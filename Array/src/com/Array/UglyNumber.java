package com.Array;

public class UglyNumber {
    public boolean isUgly(int n) {
        if(n<1) return false;

        int factor[] = {2,3,5};
        for(int factors:factor){
            while(n%factors==0){
                n= n/factors;
            }
        }
        return n==1;
    }
    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.isUgly(6));
    }
}
