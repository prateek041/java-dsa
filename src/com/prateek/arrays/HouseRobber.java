package com.prateek.arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums){
        if(nums.length > 1) {
            int robPatternOne = nums[0]; // taking the first house.
            int robPatternTwo = nums[1]; // skipping the first house.

            for (int i = 2; i < nums.length; i++) {
                if (i % 2 == 0) {
                    robPatternOne = robPatternOne + nums[i];
                } else {
                    robPatternTwo = robPatternTwo + nums[i];
                }
            }

            return Math.max(robPatternOne, robPatternTwo);
        }
        return nums[0];
    }
}
