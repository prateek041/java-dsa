package com.prateek.arrays;

// link: https://leetcode.com/problems/product-of-array-except-self/submissions/
// time: 87.89% memory: 30.20%
import java.util.Arrays;

public class ArrayProduct {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] productArray = new int[nums.length];
        System.out.println(Arrays.toString(productSelf(nums)));
    }

//    static int[] productSelf(int[] nums, int index, int[] productArray, int indexArray){ // exceeds time for very big input.
//        if(index>=nums.length){
//            return productArray;
//        }
//
//        int product = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if(i != index) {
//                product *= nums[i];
//            }
//        }
//
//        productArray[indexArray] = product;
//        return productSelf(nums, index+1, productArray, indexArray+1);
//    }

    static int[] productSelf(int [] nums){
        int[] leftSide = new int[nums.length];
        leftSide[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftSide[i] = leftSide[i-1]*nums[i-1];
        }

        int right = 1;
        for (int i = (nums.length)-2; i >= 0; i--) {
            right = right*nums[i+1];
            leftSide[i] = right*leftSide[i];
        }

        return leftSide;
    }
}
