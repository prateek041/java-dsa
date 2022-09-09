package com.prateek.strings;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next(); // input string
            int x=sc.nextInt(); // input integer
            System.out.printf("%-15s %03d", s1, x);
        }

        System.out.println("================================");
    }
}
