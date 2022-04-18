package com.interviewCamp.problems.twoDArrays;

public class zigZagOrder {

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int count = 0;
        for(int i = 0; i < mat.length; i++) {
            for (int j =0; j < mat[0].length; j++) {
                mat[i][j] = count++;
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        printZigZagOrder(mat, mat.length);
    }

    public static void printZigZagOrder(int[][] mat, int n){

    }


}