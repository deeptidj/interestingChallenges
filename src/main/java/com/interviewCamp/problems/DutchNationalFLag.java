package com.interviewCamp.problems;

public class DutchNationalFLag {
    public static void main(String[] args) {
        int arr[] = {1,6,2,5,3,4,4,4,5,7,8,7,4};


        int[] res = dutchNationalFlag(arr, 4);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
        System.out.println("******");
        int i = 0; int low = 0; int hi = arr.length -1;
        int pivot = 4;
        //loop the i until the hi and not the array length since we want to dont want to go over the hi bubble that has been already sorted out.
        while(i <= hi) {
            if(arr[i] < pivot) {
                swap(arr, i, low);
                low++;
                i++;
            } else if (arr[i] > pivot) {
                swap(arr, i, hi);
                hi--;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();

    }
    public static int[] swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
        return arr;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] dutchNationalFlag(int[] arr, int target) {
        printArray(arr);
        int low=0; int hi=arr.length-1; int i = 0;
        while(i < hi){
            if(arr[i] < target) {
                swap(arr, i,low);
                low++;i++;
            } else if (arr[i] > target) {
                swap(arr, i, hi);
                hi--;
            } else {
                i++;
            }
        }
        return arr;

    }
}
