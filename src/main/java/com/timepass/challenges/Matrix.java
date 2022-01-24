package com.timepass.challenges;

/**
 * Created by deepti on 3/1/20.
 */

class MainClass {
    public static void main(String[] args) {
        System.out.println(" Matrix");
        int rows = 3, cols = 3;
        int[][] data = new int[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = count++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
