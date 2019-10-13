package com.trackr.codilityPrograms.sorting;

/**
 * Created by deepti on 3/9/18.
 */
public class QuickSort {
    static int[] arr = {10,3,56,1,9};

    public static void main(String args[]) {
        printArray();
        quickSort(arr, 0, arr.length-1);
        printArray();

    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int piv = partition(arr, start, end);
            quickSort(arr, start, piv - 1);
            quickSort(arr, piv+1, end);
        }
    }

    public static void printArray() {
        for(int i=0;i< arr.length;i++) {
            System.out.println(" Array Element :" +arr[i]);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;int t;

        for(int j = start ;j < arr.length-1;j++) {
            if (arr[j] <= pivot ) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i = i+1;
            }

        }
        t = arr[end];
        arr[end] = arr[i];
        arr[i] = t;

        return i;
    }
}
