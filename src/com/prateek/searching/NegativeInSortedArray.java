package com.prateek.searching;

public class NegativeInSortedArray {
    public static void main(String[] args) {
//        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int [][] grid = {{3, 2}, {1, 0}};
        System.out.println(counter(grid));
    }

    static int counter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[0].length - 1;

            // problem with loop count is that, it returns last index if there is none -ve numbers.
            int loopCount = recurseSearch(grid[i], start, end, end);
            System.out.println(loopCount);
//            if(loopCount == end){
//                loopCount = end+1; // making it length of index, so that the difference in the next line becomes 0.
//            }
            count = count + (end-loopCount);
        }
        return count;
    }

    static int recurseSearch(int[] grid1D, int start, int end, int index) {
        if (start > end) {
            return index;
        }
        int mid = start + (end - start) / 2;
        index = mid;
        if (grid1D[mid] > 0) {
            return recurseSearch(grid1D, mid + 1, end, index);
        } else if (grid1D[mid] < 0) {
            return recurseSearch(grid1D, start, mid - 1, index);
        } else {
            return index;
        }
    }
}

