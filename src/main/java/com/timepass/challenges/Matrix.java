package com.timepass.challenges;

/**
 * Created by deepti on 3/1/20.
 */
public class Matrix {
    private int rows;
    private int cols;
    private int n;

    public Matrix(int n, int[][] data){
        this.n = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = data[i][j];
            }
        }
    }
    public Matrix(int rows, int cols, int n){
        this.rows = rows;
        this.cols = cols;

    }
    public Matrix(int n) {
        this.rows = n;
        this.cols = n;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getN() {
        return n;
    }

}
