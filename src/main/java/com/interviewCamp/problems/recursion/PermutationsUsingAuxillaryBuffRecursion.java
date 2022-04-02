package com.interviewCamp.problems.recursion;

public class PermutationsUsingAuxillaryBuffRecursion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] buffer = new int[3];
        printCombos(a,buffer, 0,0);
        System.out.println("DONE");
    }

    public static void printCombos(int[] a, int[] buffer, int bufferIndex, int startIndex){
        if (bufferIndex == buffer.length) {
            print(buffer);
            return;
        }
        if (startIndex == a.length) return;

        for (int i = startIndex; i < a.length; i++) {
            //place item into buffer
            buffer[bufferIndex] = a[i];
            printCombos(a,buffer, bufferIndex+1, i+1);
        }
    }

    public static void print(int[] buffer){
        for (int j : buffer) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
