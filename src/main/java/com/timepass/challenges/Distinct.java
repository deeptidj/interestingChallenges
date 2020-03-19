package com.timepass.challenges;

import java.util.Arrays;

/**
 * Created by deepti on 9/26/19.
 */
public class Distinct {
    public int solution(int[] A) {
        Arrays.sort(A);
        int count=1;
        for (int i = 0; i < A.length-1; i++) {
            if(A[i]!=A[i+1]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Distinct c = new Distinct();
       // int A[] = {2,1,1,2,3,1};
        int A[] = {2,1,1,2,3,1,2,2};
//        int A[] = {2,1,1,2,3,1};
//        int A[] = {2,1,1,2,3,1};
//        int A[] = {2,1,1,2,3,1};


        System.out.println(c.solution(A));

    }
}
