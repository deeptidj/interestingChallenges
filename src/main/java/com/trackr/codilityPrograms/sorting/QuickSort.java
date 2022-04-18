package com.trackr.codilityPrograms.sorting;

/**
 * Created by deepti on 3/9/18.
 */
public class QuickSort {
    static int[] arr = {10,3,56,1,9};

    public static void main(String args[]) {
        printArray();
        quickSort1(arr, 0, arr.length-1);
        printArray();

    }

    public static void quickSort1(int[] arr, int start, int end) {
        while (start < end) {
            int pivot = partition1(arr, start, end);
            quickSort1(arr, start, pivot-1);
            quickSort1(arr, pivot+1, end);
        }
    }
    public static int partition1(int[] arr, int start, int end) {
        int pivot = arr[end]; int i = start;
        // 1,7,3,2,4 =>
        int tmp;
        for (int j = start; j < end; j++) {
            if(arr[j] <= pivot) {
                 tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }

        tmp = arr[end];
        arr[end] = arr[i];
        arr[i] = tmp;


        return i;
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
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;int t;

        for(int j = start ;j < end;j++) {
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
