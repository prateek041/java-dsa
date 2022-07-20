package com.prateek.recursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l', 'l','o'};
        char[] n = new char[s.length];
        int start = 0;
        int end = s.length-1;
        reverseString(s, start, end);
        System.out.println(s);
    }

//    static void reverseString(char []s, int index){ // time : 13% faster.
//        int start = 0;
//        int end = s.length;
//        int mid = start + (end-start)/2;
//        if(index>= (mid)){
//            return;
//        }
//        char temp = s[index];
//        s[index] = s[(s.length-1)-index];
//        s[(s.length-1)-index] = temp;
//        reverseString(s, index+1);
//    }

    static void reverseString(char[]s, int start, int end){ // time: 40% faster, space: 84% less.
        if(start>end){
            return;
        }
        swap(s, start, end);
        reverseString(s, start+1, end-1);
    }

    static void swap(char[] s, int indexOne, int indexTwo){
        char temp = 'a';
        temp = s[indexOne];
        s[indexOne] = s[indexTwo];
        s[indexTwo] = temp;
    }
}
