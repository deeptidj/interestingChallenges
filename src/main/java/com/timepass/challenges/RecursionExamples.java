package com.timepass.challenges;

public class RecursionExamples {
    public static void main(String[] args) {
        //Print all subsets of an array - {11,12} => [], [11], [12], [11, 12]
        //int startIndex =0, bufferIndex = 0;
        printSubSetsArray(new int[]{11,22}, new int[2], 0, 0);

//        int[] a = {11,22,33,44};
//        int[] buffer = new int[3];
//        int startIndex = 0 ; int bufferIndex = 0;
//        printCombos(a, buffer, startIndex, bufferIndex);
//
//        try {
//            sayHi(10);
//        } catch (StackOverflowError ex) {
//            System.out.println(ex.getMessage()+ " add base case ");
//        }

    }
    public static void printSubSetsArray(int[] a, int[] buffer, int startIndex, int bufferIndex) {
        printBuffer(buffer, bufferIndex);

        for (int i = startIndex; i < a.length; i++) {
            buffer[bufferIndex] = a[i];
            printSubSetsArray(a, buffer, startIndex+1, bufferIndex +1);
        }

    }
    public static void printBuffer(int[] buffer, int bufferIndex) {
        for(int i =0; i < bufferIndex; i++) {
            System.out.print(buffer[i]+" ");
        }
    }


    public static void printCombos(int[] a, int[] buffer, int startIndex, int bufferIndex) {
        System.out.print("StartIndex = "+startIndex+" Buffer Index = "+bufferIndex+" ;");
        printBuffer(buffer);

        if (bufferIndex == buffer.length) {
            printBuffer(buffer); //=> 11,22,33
            return;
        }
        if (startIndex == a.length) {
            return;
        }

        for (int i = startIndex; i < a.length; i++) { //i = 0,
            System.out.println("Value of i = "+i +" before calling the print combos ");
            buffer[bufferIndex] = a[i];// buffer => [11,22,33]
            printCombos(a, buffer, startIndex+1, bufferIndex+1); // 0,0 (i = -0-, 1, 2, 3) | 1,1 (i = -1-, 2, 3))
        }

    }
    public static void printBuffer(int[] buffer){
        for(int i: buffer) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
    }
    public static void sayHi(int count){
        if (count == 0) return;
        System.out.println("Hi = "+count);
        sayHi(count-1);
    }


}
