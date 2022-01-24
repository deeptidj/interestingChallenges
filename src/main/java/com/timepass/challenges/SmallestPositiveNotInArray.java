package com.timepass.challenges;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Deep on 9/22/19.
 */
public class SmallestPositiveNotInArray {
    public static void main(String[] args) {
        System.out.println("Programs");

        SmallestPositiveNotInArray c = new SmallestPositiveNotInArray();

        int[] arr = {1,54,54,54,0,32};
        int res = c.countUniqueElementsInArrayWithoutSorting(arr);
        System.out.println("4 == "+res);

        arr = new int[]{};
        res = c.countUniqueElementsInArrayWithoutSorting(arr);
        System.out.println("Empty == "+res);

        arr = null;
        res = c.countUniqueElementsInArrayWithoutSorting(arr);
        System.out.println("null == "+ res);

        arr = new int[]{-1,-2,-3,5,0,1,-1};
        res = c.countUniqueElementsInArrayWithoutSorting(arr);
        System.out.println("6 == "+res);

        int[] A = new int[]{1, 2, 3, 4, 5};Arrays.sort(A);
        System.out.println(Arrays.toString(A));
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

        System.out.println("*******");
        System.out.println("Maximum number in an Array "+ maxInArray(new int[]{1,2,6,4,5,8,9,7,12}));
    }

    /*
    Find the maximum number in a given array of integers.
     */
    public static int maxInArray(int[] A) {
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

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] < 0 || arr[i] == arr[i+1] || (arr[i] == arr[i]+1) ) continue;
            return arr[i] +1;
        }
        return arr[arr.length-1] > 0 ? arr[arr.length-1]+1 : 1;
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

    /*
    Count no. of unique elements in a given array
     */
    public int countUniqueElementsInArrayWithoutSorting(int[] arr){
        if (arr == null) return -1;
        int count;
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr) {
            hs.add(j);
        }
        count = hs.size();
        System.out.println("Unique elements = "+count);
        return count;
    }
}
