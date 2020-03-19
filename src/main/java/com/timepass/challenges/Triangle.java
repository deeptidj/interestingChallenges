package com.timepass.challenges;

/**
 * Created by deepti on 9/26/19.
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle c = new Triangle();
       //
         int[] A = {10, 2,5,1,8,20};
        //int[] A = {10, 50, 5,1};
        System.out.println(c.solution(A));
    }
    public int solution(int[] A) {
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i+1; j < A.length - 1; j++) {
                for (int k = j+1; k < A.length; k++) {
                    if(A[i] + A[j] > A[k] && A[j] + A[k] > A[i] && A[k] + A[i] > A[j]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
