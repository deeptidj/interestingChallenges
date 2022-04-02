package com.interviewCamp.problems;

public class KadaneMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-4,5,6,7,1,-2,-5,-6};
        System.out.println(maxSumSubArray(arr));
    }
    public static Integer maxSumSubArray(int[] arr) {
        if (arr == null || arr.length ==0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }
        int maxSum = arr[0]; int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere+arr[i]);
            maxSum = Math.max(maxEndingHere, maxSum);
        }
        return maxSum;
    }
}
