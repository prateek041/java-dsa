package com.prateek.recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(binarySearchRec(arr, 0, arr.length-1, target));
    }

    static int binarySearchRec(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearchRec(arr, mid + 1, end, target);
        } else {
            return binarySearchRec(arr, start, mid - 1, target);
        }
    }
}
