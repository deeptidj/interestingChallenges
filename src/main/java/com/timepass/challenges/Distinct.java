package com.timepass.challenges;

import java.util.Arrays;

/**
 * Created by deepti on 9/26/19.
 * Calculate the number of distinct numbers in the given array.
 */
public class Distinct {
    public int solution(int[] A) {
        Arrays.sort(A);
        int count = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Distinct c = new Distinct();
        // int A[] = {2,1,1,2,3,1};
        int[] A0 = {2, 1, 1, 2, 3, 1, 2, 2};
        System.out.println(c.solution(A0));
        int A1[] = {2,1,1,2,3,1,2,4,5,6,7,8,9};
        System.out.println(c.solution(A1));
        int A2[] = {2,1,1,2,3,1,45,65};
        System.out.println(c.solution(A2));
        int A3[] = {2,1,1,2,3,1, -1,12};
        System.out.println(c.solution(A3));



    }
}
