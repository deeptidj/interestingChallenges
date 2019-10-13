package com.trackr.codilityPrograms.sorting;

/**
 * Created by deepti on 3/8/18.
 */
public class SelectionSort {

    public static void main(String args[]) {
        SelectionSort c = new SelectionSort();
        int[] A = {1,2,6,5,7,0};

        c.printArray(A);
        c.selectionSort(A);

        System.out.println();
        c.printArray(A);
    }

    public void printArray(int[] A) {
        for(int i=0;i< A.length;i++) {
            System.out.println(" Array Element :" +A[i]);
        }
    }

    public void selectionSort(int[] A) {
        int minIndex;
        for (int i = 0; i < A.length; i++) {
            minIndex = i;
            for (int j = i+1; j < A.length; j++) {
                if(A[j] < A[minIndex]) {
                    minIndex = j;
                }
                int t = A[minIndex];
                A[minIndex] = A[i];
                A[i] = t;
            }
        }
    }



    }
