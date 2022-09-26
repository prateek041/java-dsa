//package com.prateek.arrays;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class TwoSum {
//    public static void main(String[] args) {
//        int[] nums = {3,3};
//        System.out.println(Arrays.toString(bruteForce(nums, 6)));
//    }
//
//    public static int[] bruteForce(int []nums, int target){
//        int [] subArray; // declaring array.
//        int sum = 0;
////        subArray = new int[nums.length-1];
//        for (int outer = 0; outer < nums.length; outer++) {
//            for (int inner = outer+1; inner < nums.length; inner++) {
//                sum = nums[outer]+nums[inner];
//                if(sum == target){
//                    return new int[] {outer, inner};
//                }
//            }
//        }
//        return new int[] {-1};
//    }
//
//    // using hashmap.
//
//    public static int[] hashMap(int[] nums, int target){
//        HashSet <Integer> hashSet= hashCreator(nums);
//        for (int index = 0; index < nums.length; index++) {
//
//        }
//    }
//
//    public static HashSet<Integer> hashCreator(int [] nums){
//        HashSet<Integer> numbers = new HashSet<Integer>();
//        for (int index = 0; index < nums.length; index++) {
//            numbers.add(nums[index]);
//        }
//        return numbers;
//    }
//}
