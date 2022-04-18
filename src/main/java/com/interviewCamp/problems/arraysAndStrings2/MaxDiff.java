package com.interviewCamp.problems.arraysAndStrings2;

import com.facebook.challenges.MergeIntervals;

public class MaxDiff {
    public static void main(String[] args) {
        System.out.println("Stock price with max gain given prices in an array");
        int[] arr = {9,3,2,1,5,7,2,8,20,4};
        int res = maxDiff(arr);
        System.out.println(res);

        Integer[] arr1 = {9,3,2,1,5,7,2,8,20,4};
        Integer res1 = twoTrades(arr1);
        System.out.println(res1);

    }
    public static int maxDiff(int[] arr) {
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            maxDiff = Math.max(maxDiff, arr[i]-min);
        }
        return maxDiff;
    }

    public static Integer twoTrades(Integer[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int[] bestTill = new int[prices.length];
        int minSoFar = Integer.MAX_VALUE, maxDiff = 0;
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i] - minSoFar);
            bestTill[i] = maxDiff;
        }
        int[] bestFrom = new int[prices.length];
        int maxSoFar = Integer.MIN_VALUE; maxDiff = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxSoFar = Math.max(maxSoFar, prices[i]);
            maxDiff = Math.max(maxDiff, maxSoFar - prices[i]);
            bestFrom[i] = maxDiff;
        }
        int maxTwoTrades = 0;
        for (int i = 0; i < prices.length; i++) {
            int maxSecondTrade = (i+1 < prices.length) ? bestFrom[i+1] : 0;
            maxTwoTrades = Math.max(maxTwoTrades,  bestTill[i] + maxSecondTrade);
        }
        return maxTwoTrades;
    }
}
