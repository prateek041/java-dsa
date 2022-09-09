package com.prateek.arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
//        int left = 0;
//        int right = height.length-1;
//        int maxArea = Math.min(height[left], height[right]);
//        System.out.println(linearTime(left, right, height, maxArea));
        System.out.println(linearTimeUsingLoop(height));
//        System.out.println(bruteForce(height));
    }

//    public static int bruteForce(int[] height){ // this is the brute force method.
//        int areaMax = (Math.min(height[0], height[1]));
//        int areaCheck;
//        for (int number = 0; number < height.length; number++) {
//            for (int combiNumber = 0; combiNumber < height.length; combiNumber++) {
//                areaCheck = (Math.min(height[number], height[combiNumber]))*(combiNumber-number);
//                if(areaCheck > areaMax){
//                    areaMax = areaCheck;
//                }
//            }
//        }
//        return areaMax;
//    }

//    public static int linearTime(int left, int right, int[] height, int maxArea){ // this was the linear time using recursion.
////        int newArea = (Math.min(left, right))*(right-left);
//        if(left >= right){
//            return maxArea;
//        }else if(height[left] < height[right]){
//            maxArea = areaChecker(left, right, height, maxArea);
//            return linearTime(left+1, right, height, maxArea);
//        } else{
//            maxArea = areaChecker(left, right, height, maxArea);
//            return linearTime(left, right-1, height, maxArea);
//        }
//    }
//
//    public static int areaChecker(int left, int right, int[] height, int maxArea){
//        int newArea = Math.min(height[left], height[right])*(right-left);
//        return Math.max(newArea, maxArea);
//    }

    public static int linearTimeUsingLoop(int[] height){
        int left = 0;
        int right = height.length-1;
//        int maxArea = Math.min(height[left], height[right]);
        int maxArea = 0 ;
        int newArea;
        while(left < right){
            newArea = Math.min(height[left], height[right])*(right-left);
            maxArea = Math.max(newArea, maxArea);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }

}
