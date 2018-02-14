/**
 * Created by deepti on 1/30/18.
 */
public class TurnBy90Degrees {
    public static void main(String args[]) {
        System.out.println("Turn the matrix by 90 degrees");

        System.out.println("Create and print a matrix");

        int ROW = 4;
        int COL = 4;
        int[][] mat = new int[ROW][COL];

        int count = 1;
        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL ; ++j) {
                    mat[i][j] = count;
                System.out.print(mat[i][j] + "  ");
                count++;
            }
            System.out.println();
        }



        for (int layer = 0 ; layer < ROW/2; layer++ ) {
            int first = layer;
            int last = ROW - 1 - layer;
            System.out.println("First is : " +first + " ");
            System.out.println("Last is : "+last + " ");

            for (int i = first ; i < last ; i++) {
                int offset = i - first;
                //save top
                int top = mat[first][i];
                //left --> top
                mat[first][i] = mat[last-offset][first];
                //bottom --> left
                mat[last-offset][first] = mat[last][last-offset];
                //right --> bottom
                mat[last][last-offset] = mat[first][last-i];
                //top --> right
                mat[i][last] = top;

            }
        }



        for (int i = 0 ; i < ROW ; ++i) {
            for (int j = 0; j< COL ; ++j) {
                System.out.print(mat[i][j] + "  ");
                count++;
            }
            System.out.println();
        }
    }
}
