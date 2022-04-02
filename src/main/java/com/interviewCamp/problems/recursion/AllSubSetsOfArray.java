package com.interviewCamp.problems.recursion;

public class AllSubSetsOfArray {
    public static void main(String[] args) {
        //Print all the subsets of an array
        int[] a = {11,22,33};
        int[] buffer = new int[a.length];
        printSubSetsHelper(a, buffer, 0, 0);

    }
    public static void printSubSetsHelper(int[] a, int[] buffer, int startIndex, int bufferIndex) {
        printSubSets(buffer, bufferIndex);

        if (bufferIndex == buffer.length) return;
        if (startIndex == a.length) return;

        for (int i = startIndex; i < a.length; i++) {
            buffer[bufferIndex] = a[i];
            printSubSetsHelper(a, buffer, i+1, bufferIndex+1);

        }
    }
    public static void printSubSets(int[] buffer, int bufferIndex) {
        for (int i = 0; i < bufferIndex; i++){
            System.out.print(buffer[i]+" ");
        }
        System.out.println();
    }
}
