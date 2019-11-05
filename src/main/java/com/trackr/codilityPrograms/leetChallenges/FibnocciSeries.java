package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 10/17/19.
 */
public class FibnocciSeries {
    public static int fib(int n) {
        if (n<=1) return n;
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(9));
    }
}
