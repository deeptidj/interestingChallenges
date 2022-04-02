package com.interviewCamp.problems;

import java.util.Arrays;

public class SumTargetX {
    public static void main(String[] args) throws Exception {
        int[] a = {1,2,-4,6,0,3,10};
        int t = 43; int[] res = new int[]{-1,-1};
        if(a ==null || a.length ==0) {
            throw new Exception("Array is empty or length is 0");
        }
        Arrays.sort(a); // {-4,0,1,2,3,6}
        int low = 0; int hi = a.length-1;
        while(low <= hi){
            int curr_target = a[low]+a[hi]; //2
            if(curr_target < t){
                if (low >= a.length-1) break;
                low++;
            } else if (curr_target > t) {
                if (hi <= 0) break;
                hi--;
            } else {
                res[0] = a[low];
                res[1] = a[hi];
                break;
            }
        }
        if (res[0] == -1 && res[1] == -1) {
            System.out.println("Pair does not exists that sums to "+t);
        }
        else {
            System.out.println(" numbers are "+ res[0] +" "+ res[1]);
        }
    }
}
