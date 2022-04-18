package com.interviewCamp.problems.twoDArrays;

public class Rotate2DArray {

//0 1 2 3
//4 5 6 7
//8 9 10 11
//12 13 14 15

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
        rotateMatrix(mat, mat.length);
    }

    public static void rotateMatrix(int[][] mat, int n){
        for(int layer = 0; layer < n/2; layer++) {
            System.out.println("Layer value = " +layer);
            int first;int last;
            first = layer; last = n-1-layer;
            for (int i = first; i < last ; i++) {
                int offset = i - first;
                int top = mat[first][i]; //save top
                //left => top
                mat[first][i] = mat[last-offset][first];
                //bottom => left
                mat[last-offset][first] = mat[last][last-offset];
                //right => bottom
                mat[last][last-offset] = mat[i][last];
                //top => right
                mat[i][last] = top;
            }

        }


        for(int i = 0; i < mat.length; i++) {
            for (int j =0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
    }
    }


}
