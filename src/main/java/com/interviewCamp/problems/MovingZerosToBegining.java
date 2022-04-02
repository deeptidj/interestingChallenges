package com.interviewCamp.problems;

public class MovingZerosToBegining {
    public static void main1(String[] args) {
        System.out.println("Moving zeroes to beginning");
        //For example, [4,0,0,1,0,3,6] -> [0,0,0,4,1,2,3]
        int[] arr = {4,2,0,1,0,0,0};
        int j = arr.length-1;
        int last = arr.length-1;
        int countZeroes = 0;

        while (j >= 0) {
            if(arr[j] != 0) {
                arr[last--] = arr[j];
            }
            else countZeroes++;

            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Moving zeroes to beginning");
        int[] arr = {10,11,1,4,0,4,0,8,9,0,0,0};
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp;
            if (arr[i] == 0) {
                temp = arr[i];
                arr[i] = arr[b];
                arr[b] = temp;
                b++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
