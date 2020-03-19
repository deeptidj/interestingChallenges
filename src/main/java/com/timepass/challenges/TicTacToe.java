package com.timepass.challenges;

/**
 * Created by deepti on 3/11/20.
 */
public class TicTacToe {
    static int n = 3;
    static int[][] tic = new int[n][n];
    static int[] rows = new int[n];
    static int[] cols = new int[n];
    static int[] diag = new int[20000];
    public static void main(String[] args) {

        try {
        move(0,1,0);
            move(1,1,0);
           int res = move(2,1,0);
            System.out.println("Res " +res);

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static int move(int r, int c, int player) throws Exception {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tic[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tic[i][j]+ "  ");
            }
            System.out.println();
        }

        if (player == 0) {
            //-1
            tic[r][c] = -1;
            rows[r]+=-1;
            cols[c]+=-1;
        }

        else if (player == 1){
            //1
            tic[r][c] = 1;
            rows[r]+=1;
            cols[c]+=1;
        }
        else {
            throw new Exception("Invalid player");
        }
        if (rows[r] == -3 || cols[c] == -3) return -1;
        if (rows[r] == -3 || cols[c] == 3) return 1;
        return 1;
    }
}
