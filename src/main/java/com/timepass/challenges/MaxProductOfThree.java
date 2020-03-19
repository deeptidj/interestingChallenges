package com.timepass.challenges;

import java.util.Arrays;

/**
 * Created by deepti on 9/25/19.
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        MaxProductOfThree c = new MaxProductOfThree();
        //int[] d = {-3,1,2,-2,5,6};
        //int[] d = {-3,1,2,-2,5,6};
       //int[] d = {-13,21,62,-27,57,68};
        int[] d = {-5,5,-5,4};
        System.out.println(c.solution(d));
    }
    public int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int p1 = A[len-1] * A[len-2] * A[len-3];
        int p2 = A[0] * A[1] * A[len-1];
        return p1 > p2 ? p1 : p2;

    }

}
