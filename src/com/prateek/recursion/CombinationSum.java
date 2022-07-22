//package com.prateek.recursion;
//
//import java.util.List;
//
//public class CombinationSum {
//    public static void main(String[] args) {
//
//    }
//
//    static List<List<Integer>> combinationSum(int[] candidate, int target){
//
//
//    }
//
//    static void allCombinations (int index, int target, List <Integer> combi, int[] candidate){
//        if (index >= candidate.length){
//            if(target == 0){
//
//            }
//            else{
//                return
//            }
//        }
//
//        // if pick the index.
//        allCombinations(index, (target-candidate[index]), combi, candidate);
//        // if non pick the index.
//        allCombinations(index+1, target, combi, candidate);
//        return combi
//    }
//}
