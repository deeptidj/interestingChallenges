package com.trackr.selectionSort;

/**
 * Created by deepti on 3/8/18.
 */
public class SelectionSort {

        static int[]  arr = {10,2,8,6,7};

        public static void main(String args[]) {
            System.out.println("Hello");
            printArray();
            selectsort();
            printArray();
        }
        public static void printArray() {
            for(int i=0;i< arr.length;i++) {
                System.out.println(" Array Element :" +arr[i]);
            }
        }
        public static void selectsort() {
            int minIndex ;
            for(int i = 0 ; i < arr.length;i++) {
                minIndex = i;
                for (int j = i+ 1; j< arr.length; j++) {
                    if (arr[j] < arr[minIndex])
                        minIndex = j;
                }
                int t = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = t;
            }
        }



    }
