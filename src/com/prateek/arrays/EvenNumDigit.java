package com.prateek.arrays;

// link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
// time: 99.84%, memory: 52.49%
public class EvenNumDigit {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumber(nums, 0, 0));
    }

    static int findNumber(int [] nums, int index, int countEven){
        if(index>=nums.length){
            return countEven;
        }
        int count = 0;
        while(nums[index] != 0){
            count ++;
            nums[index]/=10;
        }

        if(count%2==0){
           countEven+=1;
        }

        return findNumber(nums, index+1, countEven);
    }
}
