package com.interviewCamp.problems;

import java.util.Arrays;

public class TwoSumProblem {
    //Two Sum Problem - Find 2 numbers in a sorted array that sum to X. For example, if A = [1,2,3,4,5] and X = 9, the numbers are 4 and 5.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int x = -7;
        Arrays.sort(a);
        int[] nums = find2nums(a,x);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static int[] find2nums(int[] a, int x) {
        if (a == null || a.length == 0) return a;
        int first = 0;
        int last = a.length -1;

        while (first<=last) {
            if (a[first] + a[last] == x) return new int[]{a[first], a[last]};
            else if (a[first] + a[last] < x) first++;
            else if (a[first] + a[last] > x) last--;
        }
        return new int[]{-1,-1};
    }
}
