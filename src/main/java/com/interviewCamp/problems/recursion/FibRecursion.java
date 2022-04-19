package com.interviewCamp.problems.recursion;

import java.util.HashMap;

public class FibRecursion {
    public static void main(String[] args) {
        int n = 10;
        HashMap<Integer, Integer> memo = new HashMap<>();
        int res = fib(n, memo);
        System.out.println(res+ " is the nth number in fib series");
    }
    public static Integer fib(int n, HashMap<Integer,Integer> memo) {
        System.out.println("Entered recursive function "+n);
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo.containsKey(n)){
            System.out.println(" looking in map for "+n);
            return memo.get(n);
        }
        int res = fib(n-1, memo) + fib(n-2, memo);
        memo.put(n, res);
        return res;
    }
}
