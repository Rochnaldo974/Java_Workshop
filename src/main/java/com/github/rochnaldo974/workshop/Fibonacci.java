package com.github.rochnaldo974.workshop;


public class Fibonacci {
    static int recursiveFibonacci(int n) {
        int i = 0;
        int b = recursiveFibonacci(i - 1) + recursiveFibonacci(i - 2) ;
        return i;
    }
    public static void main(String[] args) {
        int n = recursiveFibonacci(10);
        System.out.println(n);
    }
}
