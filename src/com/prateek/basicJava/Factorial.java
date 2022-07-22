package com.prateek.basicJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("Factorial using loop " + factLoop(num));
        System.out.println("Factorial using recursion" + factRec(num));
    }

    static double factLoop(int num){
        if(num == 0){
            System.out.println(1);
        }
        int factorial = 1;

        // factorial loop.
        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }

    static double factRec(int num){
        if(num == 0){
            return 1;
        }

        return num * factRec(num-1);
    }
}
