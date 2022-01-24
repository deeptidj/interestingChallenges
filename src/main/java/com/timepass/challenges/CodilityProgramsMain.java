package com.timepass.challenges;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by deepti on 9/22/19.
 */
public class CodilityProgramsMain {
    public static void main(String[] args) {
        System.out.println("Codility Programs");
        CodilityProgramsMain c = new CodilityProgramsMain();
        int[] A = new int[]{1, 2, 3, 4, 5};Arrays.sort(A);
        System.out.println(A);
        System.out.print("6 == " +c.smallestPositiveNoNotInArray(A)+ " ");
        System.out.println();
        A = new int[]{-1,-2,-3};Arrays.sort(A);
        System.out.print("1 == " +c.smallestPositiveNoNotInArray(A)+ " ");
        System.out.println();
        A = new int[]{1, 2, 9};Arrays.sort(A);
        System.out.print("3 == "+c.smallestPositiveNoNotInArray(A)+ " ");
        System.out.println();
        System.out.println();Arrays.sort(A);
        System.out.println(c.solutionUniqueValuesInArray(A));

        System.out.println();
        int[] arr = {1,54,54,54,0,32};
        int res = c.solCountUniqueElementsInArrayWithoutSorting(arr);
        System.out.println(res);
    }


    public int maxInArray(int[] A) {
        int maxInArray = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            maxInArray = Math.max(maxInArray, A[i]);
        }
        if (maxInArray < 0) return 1;
        else return maxInArray;
    }

    /*
    Write a function:
    that, given an array A of N integers,
    returns the smallest positive integer (greater than 0) that does not occur in A.
    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    Given A = [1, 2, 3], the function should return 4.
    Given A = [−1, −3], the function should return 1.
    Write an efficient algorithm for the following assumptions:
    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
    */
    public int smallestPositiveNoNotInArray(int[] arr) {
        int res=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] < 0 || arr[i] == arr[i+1] || (arr[i] == arr[i]+1) ) continue;
            return arr[i] +1;
        }
        return arr[arr.length-1] > 0 ? arr[arr.length-1]+1 : 1;
    }

    public int solutionPassingCars(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = i + 1; j < A.length; j++) {
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

        int result = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                result++;

            }
        }
        return result;
    }
    public int solCountUniqueElementsInArrayWithoutSorting(int[] arr){
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        count = hs.size();
        System.out.println("Unique elements = "+count);
        return count;
    }
}
