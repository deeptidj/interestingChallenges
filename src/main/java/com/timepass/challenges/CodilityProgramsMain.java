package com.timepass.challenges;

import java.util.Arrays;

/**
 * Created by deepti on 9/22/19.
 */
public class CodilityProgramsMain {
    public static void main(String[] args) {
        System.out.println("Codility Programs");
        /*

        Write a function:

        class Solution { public int solution(int[] A); }

        that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        */
        //int[] A = {1, 3, 6, 4, 1, 2, -1, 0, -2, 0, 5};
       // int[] A = {-1, -2};
        CodilityProgramsMain c = new CodilityProgramsMain();
        //int[] A = {0,1,0,1,1};
       // System.out.println(c.solutionPassingCars(A));
        int[] A = {1,2,2,3,4,5,0,8,8};
        Arrays.sort(A);
        System.out.println(c.solutionUniqueValuesInArray(A));

    }
    public int solution(int[] A){
        // -1, 0, 1, 2, 2, 3, 4, 5
        Arrays.sort(A);

//        IntStream stream = Arrays.stream(A);
//        stream.forEach(i -> System.out.print(i + " "));
//
//        //List L = Arrays.asList(A);
//        //L.stream().filter( i -> i>0).collect(Collectors.toSet());


        for (int i=0; i<A.length-1; i++) {
            if( A[i] <= 0 || (A[i] == A[i+1]) || A[i] + 1 == A[i + 1]) continue;
            return A[i] + 1;
        }
        return A[A.length-1] > 0 ? A[A.length-1] + 1 : 1;
    }

    public int solutionPassingCars(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = i+1; j < A.length; j++) {
                    if (A[j] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    //Count the no. of unique elements in the array
    public int solutionUniqueValuesInArray(int[] A) {

        int result=1;
        for (int i = 0; i < A.length -1 ; i++) {
            if(A[i]!=A[i+1]){
                result++;

            }
        }


        return result;
    }
}
