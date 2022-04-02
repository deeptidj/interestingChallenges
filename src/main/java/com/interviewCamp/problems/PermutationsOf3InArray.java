package com.interviewCamp.problems;

public class PermutationsOf3InArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        printCombos(a, new int[3], 0, 0);
    }
    public static void printCombos(int[] a,int[] buffer, int startIndex, int bufferIndex) {
        System.out.println(" called: "+ "start Index " +startIndex + " buff Index " +bufferIndex);
        printBuffer(buffer);
        System.out.println(" ");
        if (bufferIndex == buffer.length) {
            printBuffer(buffer);
            return;
        }
        if (startIndex == a.length) {
            return;
        }
        for (int i = startIndex; i < a.length; i++) {
            buffer[bufferIndex] = a[i];
            printCombos(a, buffer, startIndex+1, bufferIndex+1);
        }
    }
    public static void printBuffer(int[] buffer){
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i]+ " ");
        }
        System.out.println();
    }
}
