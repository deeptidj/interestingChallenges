package com.interviewCamp.problems;

public class ReverseInPlace {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int[] res = reverseInPlace(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
        System.out.println();
    }
    public static int[] reverseInPlace(int[] a) {
        if (a == null || a.length == 0) return a;
        int last = a.length -1;
        int first = 0;

        while(first <= last) {
            int temp;
            if(a[first]!=a[last]) {
                temp = a[last];
                a[last] = a[first];
                a[first] = temp;
            }
            first++; last--;
        }
        return a;
    }
}
