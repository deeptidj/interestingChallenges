package com.facebook.challenges;

public class MoveZerosToLeft {
    public static void main(String[] args) {
        int[] a = {3,3,7,3,0,12,2,0,0};
        //int[] res = {0,0,0,3,3,7,3,12,2};

        int count = 0;
        int end = a.length-1;
        int i = end;

        while(end >= 0){
            if (a[end] == 0) {
                count++;
                end--;
            }
            else {
                a[i--] = a[end--];
            }
        }

        while (count > 0){
            a[i--] = 0;
            count--;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+"  ");
        }
        System.out.println();

    }

}
