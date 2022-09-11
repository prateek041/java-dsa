package com.prateek.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
//        System.out.println(bruteForce(nums));
//        System.out.println(hashMap(nums));
        System.out.println(sortAndCheck(nums));
    }

    public static boolean bruteForce(int [] nums){
        boolean appearTwice = false;
        for (int outer = 0; outer < nums.length; outer++) {
            for (int inner = outer+1; inner < nums.length; inner++) {
                if(nums[outer]==nums[inner]){
                    appearTwice = true;
                    return appearTwice;
                }
            }
        }

        return appearTwice;
    }

    // using the hashmap technique.

    public static boolean hashMap(int[] nums){
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int index = 0; index < nums.length; index++) {
            if(numbers.contains(nums[index])){
                return true;
            } else{
                numbers.add(nums[index]);
            }
        }
        return false;
    }

    // using sort and check.

    public static boolean sortAndCheck(int[] nums){
        // learn and apply the merge sort in near future.
        Arrays.sort(nums);
        for (int index = 0; index < nums.length-1; index++) {
            if(nums[index] == nums[index+1]){
                return true;
            }
        }
        return false;
    }
}
