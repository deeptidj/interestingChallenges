package com.interviewCamp.problems;

import java.util.Arrays;

public class SumSubArrayTargetX {

    public static void main(String[] args) {
        int[] a = {1,5,2,3,4}; int t = 9;
        sumSubArray(a, t);
    }
    public static int[] sumSubArray(int[] a, int t) {
        int[] res= new int[]{-1,-1};

        if (a ==null || a.length ==0) {
            throw new IllegalArgumentException("Input array is empty or length is 0");
        }

        int start = 0; int end = 0; int sum = a[start];

        while(start <= a.length){
            if (start > end) {
                end = start;
                sum = a[start];
            }
            if(sum < t) {
                if (end >= a.length-1) break;
                end++;
                sum = sum +a[end];
            } else if (sum > t) {
                sum = sum - a[start];
                start++;
            } else {
                res[0] = start;
                res[1] = end;
                break;
            }
        }

        if (res[0] ==-1 || res[1]==-1) {
            System.out.println("Sub Array witht that sum does not exists");
        }
        else {
            System.out.println("Sub  - starting index = " + res[0] +" ending index = "+ res[1]);

        }

        return res;

    }
}
