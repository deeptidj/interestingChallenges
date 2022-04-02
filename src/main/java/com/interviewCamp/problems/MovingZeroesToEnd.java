package com.interviewCamp.problems;

public class MovingZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,9,8,0,0,7};
        int b = arr.length-1;
        for (int i = arr.length-1; i >= 0 ; i--) {
            int temp;
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[b];
                arr[b] =temp;
                b--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
