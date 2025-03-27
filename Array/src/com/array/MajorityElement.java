package com.array;

public class MajorityElement {

        public int majorityElement(int[] nums) {
            int count = 0, candidate = 0;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;


    }
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int nums[] = {2,2,1,1,1};
        System.out.println(majorityElement.majorityElement(nums));
    }
}

//  Arrays.sort(nums);
// return nums[nums.length / 2];
