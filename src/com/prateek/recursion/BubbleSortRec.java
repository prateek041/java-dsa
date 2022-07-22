package com.prateek.recursion;

import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        bubbleSortRec(arr, arr.length-1, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortRec(int [] arr, int subArray, int index, int max){
        if(subArray<=0){
            return;
        }

        if(index <= subArray) {
            if (arr[index] <= arr[max]) {
                swap(arr, index, max);
                bubbleSortRec(arr, subArray, index + 1, max + 1);
            }
        }

        if(index>=subArray){
            bubbleSortRec(arr, subArray-1, 1, 0);
        }
    }

    static void swap(int[]arr, int index, int max){
        int temp;
        temp = arr[index];
        arr[index] = arr[max];
        arr[max] = temp;
    }
}
