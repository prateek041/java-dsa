package com.prateek.recursion;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        selectionSort(arr, 0, arr.length-1, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int []arr, int max, int subArray, int index){
        if(subArray<=0){
            return;
        }
        if(index<=subArray){
            if(arr[index]>arr[max]){
                max = index;
                selectionSort(arr, max, subArray, index);
            }
        }
        int temp = arr[subArray];
        arr[subArray] = arr[max];
        arr[max] = temp;
        selectionSort(arr, 0, subArray-1, 1);
    }

}
