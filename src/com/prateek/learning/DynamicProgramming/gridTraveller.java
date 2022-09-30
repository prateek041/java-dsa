package com.prateek.learning.DynamicProgramming;

import java.util.HashMap;

public class gridTraveller {
    public static void main(String[] args) {
        HashMap<String, Long> memo = new HashMap<>();
        System.out.println(recGridTravel(18, 18, memo));
    }

    public static long recGridTravel(int row, int column, HashMap<String, Long> memo){
        String key = row + "," + column; // creating a string to check values.

        if (memo.containsKey(key)){
            return memo.get(key);
        }
        if(row == 0 || column == 0){ // either of the dimensions missing will result in 0 possible moves.
            return 0;
        } else if ( row == 1 && column == 1){ // only one move left.
            return 1;
        }
        long value = recGridTravel(row-1, column, memo) + recGridTravel(row, column - 1, memo); // add all
        memo.put(key, value);
        return value;
    }
}
