package com.Pairs;

public class NumberOfEquivalentDominoPair {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] map = new int[100];

        int ans = 0;
        for(int[] d: dominoes){
            int num = Math.min(d[0], d[1])*10 + Math.max(d[0], d[1]);
            ans += map[num];

            map[num]++;
        }

        return ans;

    }
    public static void main(String[] args) {
        int dominoes[][] = {{1,2},{2,1},{3,4},{5,6},{1,2},{2,1}};
        System.out.println(numEquivDominoPairs(dominoes));
    }



}
