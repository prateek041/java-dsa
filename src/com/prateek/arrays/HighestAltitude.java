package com.prateek.arrays;
// I used prefix sum in this question.
// link: https://leetcode.com/problems/find-the-highest-altitude
// time: 100% memory 35%
public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(prefixSum(arr));
    }

    static int prefixSum(int [] arr){
        int[] newGain = new int[arr.length+1];
        newGain[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            newGain[i+1] = newGain[i] + arr[i];
        }

        int max = 0;
        for (int i = 1; i < newGain.length; i++) {
            if(newGain[i] > newGain[max]){
                max = i;
            }
        }
        return newGain[max];
    }
}
