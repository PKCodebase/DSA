package com.array;

import java.util.HashMap;

public class NumberOfRabbits {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int x: answers){
            if(x == 0){
                ans += 1;
                continue;
            }

            if(!map.containsKey(x)){
                ans += (x + 1);
                map.put(x, 1);
            }else if(map.get(x) + 1  > (x+1)){
                ans += (x+1);
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        NumberOfRabbits numberOfRabbits = new NumberOfRabbits();
        int arr[] = {1,1,2};
        System.out.println(numberOfRabbits.numRabbits(arr));
    }

}
