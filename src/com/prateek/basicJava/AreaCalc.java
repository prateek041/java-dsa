package com.prateek.basicJava;

import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        System.out.println("Enter 1 for circle, 2 triangle, 3 rectangle,  4 parallelogram, 5 rhombus, 6  equilateral triangle ");
        int input = main.nextInt();
        switch (input) {
            case 1 -> circleArea();
            case 2 -> triangleArea();
            case 3 -> rectangle();
            case 4 -> para();
            case 5 -> rhombus();
            case 6 -> equi();
            default -> System.out.println("invalid input");
        }
    }

    static void circleArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius = in.nextInt();
        double area = 3.14*(Math.pow(radius, 2));
        System.out.println(area);
    }

    static void triangleArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base length and height of the triangle");
        int base = in.nextInt();
        int height = in.nextInt();
        double area = 0.5*base*height;
        System.out.println(area);
    }

    static void rectangle(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the circle");
        int length = in.nextInt();
        int breadth = in.nextInt();
        double area = length*breadth;
        System.out.println(area);
    }

    static void para(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height");
        int base = in.nextInt();
        int height = in.nextInt();
        double area = base*height;
        System.out.println(area);
    }

    static void equi(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        int side = in.nextInt();
        double area = (Math.sqrt(3)/4)*(Math.pow(side, 2));
        System.out.println(area);
    }

    static void rhombus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter P and Q");
        int p = in.nextInt();
        int q = in.nextInt();
        double area = (p*q)/2;
        System.out.println(area);
    }

}
