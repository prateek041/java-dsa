package com.prateek.basicJava;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("Average using recursion " + (averageRec(num))/num);
        System.out.println("Average using iteration " + (averageLoop(num)));
    }

    static double averageLoop(int num){
        int average = 0;
        for (int i = 1; i <= num; i++) {
            average = average + i;
        }

        return average/(double)num;
    }

    static double averageRec(int num){
        if(num==1){
            return num;
        }

        return num +averageRec(num-1);
    }
}
