package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 1/30/18.
 */
public class EntireRowColumnZero {
    public static void main(String args[]) {
        System.out.println("Hello printing a matrix");
        int ROW = 4;
        int COL = 5;
        int[][] mat = new int[ROW][COL];

        int count = 1;
        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL ; ++j) {
                if (i == 2 && j == 2 ) {
                    mat[i][j] = 0 ;
                }
                else {
                    mat[i][j] = count ;
                }

                System.out.print(mat[i][j] + "  ");
                count++;
            }
            System.out.println();
        }


        boolean[] rows = new boolean[ROW];
        boolean[] cols = new boolean[COL];

        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL; ++j) {
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }

            }
        }
        System.out.println("Printing rows");
        for (int i = 0 ; i < ROW ; ++i) {
            System.out.println(rows[i]);
        }

        System.out.println("Printing cols");
        for (int j = 0 ; j < COL ; ++j) {
            System.out.println(cols[j]);
        }


        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL; ++j) {
               if (cols[j] || rows[i]) mat[i][j] = 0;
            }
        }

        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL; ++j) {
                System.out.print(mat[i][j] +"  ");
            }
            System.out.println();
        }



    }

    public static void printMatrix(int[][] mat) {

    }
}
