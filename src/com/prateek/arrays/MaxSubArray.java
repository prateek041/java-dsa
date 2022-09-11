package com.prateek.arrays;

import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(bruteForce(nums));
        System.out.println(optimised(nums));
    }

//    public static int bruteForce(int[]nums){
//        int maxSum = nums[0];
//        for (int outer = 0; outer < nums.length; outer++) {
//            int saveSum = 0;
//            for (int inner = outer; inner < nums.length; inner++) {
//                int sum = 0;
//                for (int check = outer; check <= inner; check++) {
//                    sum = saveSum+nums[check];
//                    if(sum>maxSum){
//                       maxSum = sum;
//                    }
//                }
//                saveSum = sum;
//            }
//        }
//        return maxSum;
//    }

    // optimised solution using sliding window.

    public static int optimised(int[] nums){
        int maxSum = nums[0];
        int currentSum = 0;
        for (int index = 0; index < nums.length; index++) {
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += nums[index];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
