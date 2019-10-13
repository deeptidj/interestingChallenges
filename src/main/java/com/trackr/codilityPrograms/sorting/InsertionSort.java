package com.trackr.codilityPrograms.sorting;

/**
 * Created by deepti on 3/8/18.
 */
public class InsertionSort {


    public static void main(String args[]) {
        int[] A = {10,2,6,4,8};
        InsertionSort c = new InsertionSort();
        System.out.println("Hello");
        c.printArray(A);
        c.insertSort1(A);
        System.out.println("***** Sorted ***** ");
        c.printArray(A);
    }
    public void printArray(int[] A) {
        for(int i=0;i< A.length;i++) {
            System.out.println(" Array Element :" +A[i]);
        }
    }
    public void insertSort1(int[] A ) {
        for (int i = 0; i < A.length; i++) {
            int j = i;
            int t;
            while(j>0 && A[j-1] > A[j]) {
                t = A[j-1];
                A[j-1] = A[j];
                A[j] = t;
                j--;
            }
        }
    }

}
