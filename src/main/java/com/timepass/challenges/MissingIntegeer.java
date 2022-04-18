package com.timepass.challenges;

import java.util.Arrays;

/**
 * Created by deepti on 9/26/19.
 * Whats this ?
 */
public class MissingIntegeer {
    public static void main(String[] args) {
        MissingIntegeer d = new MissingIntegeer();
        //  int[] A = {1, 3, 6, 4, 1, 2};
        // int[] A = {1,1,2, 3,4, 6,};
        // int A[] = {1,1,34};
        // int A[] = {0,2,3,4};
        // int[] A = {0, 3,100,102};
        // int[] A = {-2,-1,0};
        // int[] A = {-1,-1, 2,3};
        //  int[] A = {-1,-1,1};
        // int[] A = {-4,-3,-2};
        //  int[] A = {2};
        int[] A = {1000000, 878787879};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A[0] > 1) return 1;
        if ((A[A.length - 1]) <= 0) return 1;
        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] == A[i + 1]) continue;
            if ((A[i] + 1) != A[i + 1]) {
                if ((A[i] + 1 == 0) && (A[i + 1] != 1)) return 1;
                if ((A[i] + 1 == 0) && (A[i + 1] == 1)) return 2;
                return (A[i] + 1);
            }


        }
        return 0;
    }
}
