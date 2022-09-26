package com.prateek.learning.DynamicProgramming;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        HashMap<Integer, Long> memo = new HashMap<>();
        System.out.println(fibonacciDp(6, memo));

//        System.out.println(fibonacciClassicRec(7));
    }

/*
    public static int fibonacciClassicRec(int index){
        if(index == 1 || index == 2){
            return 1;
        }

        return fibonacciClassicRec(index-1)+fibonacciClassicRec(index-2);
    }
*/

    public static long fibonacciDp(int index, HashMap<Integer, Long> memo){
        if(index == 1 || index == 2){
            return 1;
        }

        if(memo.containsKey(index)){ // if the result is present in the memo, just return the value directly.
            return memo.get(index);
        }


        long recValue = fibonacciDp(index-1, memo) + fibonacciDp(index-2, memo);
        memo.put(index, recValue); // value not in memo,
                                                                                                // calculate and put for future reference.
        return memo.get(index);
    }

}
