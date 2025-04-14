package com.array;

public class CountGoodNumbers {
    private long MOD= 1_000_000_007;
    private long pow(long x, long n){
        if(n <= 0){
            return 1;
        }

        long ans = pow(x, n/2);
        if(n % 2 == 0){
            return (ans * ans) % MOD;
        }else{
            return (x * ans * ans )% MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long even = (n + 1)/2;
        long odd = n/2;
        long first = pow(5, even) % MOD;
        long second = pow(4, odd)%MOD;
        return (int)((first*second)%MOD);
    }
    public static void main(String[] args) {
        CountGoodNumbers c=new CountGoodNumbers();
        System.out.println(c.countGoodNumbers(4));
    }
}
