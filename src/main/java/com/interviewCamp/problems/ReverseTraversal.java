package com.interviewCamp.problems;

public class ReverseTraversal {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        int end = a.length-1;
        for (int i = a.length-1; i >= 0 ; i--) {
            if(a[i] == 0) {
                end--;
            }
        }
        while (end >=0 ){

        }

    }
}
