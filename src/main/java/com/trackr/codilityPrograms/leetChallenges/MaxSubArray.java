package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 3/16/18.
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println("Max Sub Array");
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(arr);
        System.out.println(res);
    }
    public static int maxSubArray(int[] arr) {

        int[] sum = new int[arr.length];
        int max = sum[0];
        sum[0] = arr[0];
        for(int i=1; i< sum.length;i++) {
            sum[i] = Math.max(arr[i], sum[i-1] + arr[i]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }
}
