package com.trackr.insertSort;

/**
 * Created by deepti on 3/8/18.
 */
public class InsertionSort {
    static int[] arr = {10,2,6,4,8};


    public static void main(String args[]) {
        System.out.println("Hello");
        printArray();
        insertSort();
        printArray();
    }
    public static void printArray() {
        for(int i=0;i< arr.length;i++) {
            System.out.println(" Array Element :" +arr[i]);
        }
    }
    public static void insertSort() {
        int curr;int j; int t;
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = curr;
        }
    }
}
