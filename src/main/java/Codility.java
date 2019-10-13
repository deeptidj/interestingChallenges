import java.util.*;

/**
 * Created by deepti on 9/19/19.
 */
public class Codility {
    public static void main(String[] args) {

//        int n= 5;
//        System.out.println(Integer.toBinaryString(n));
//        int v = binGap(n);
//        System.out.println("Codility programs " +v);
//
//        n= 6;
//        System.out.println(Integer.toBinaryString(n));
//        v = binGap(n);
//        System.out.println("Codility programs " +v);
//
//         n= 9;
//        System.out.println(Integer.toBinaryString(n));
//         v = binGap(n);
//        System.out.println("Codility programs " +v);
//
//        n= 20;
//        System.out.println(Integer.toBinaryString(n));
//        v = binGap(n);
 //       System.out.println("Codility programs " +v);

        int k = solution(7, 78, 5);
        System.out.println(k);

         k = solution(1, 5, 2);
        System.out.println(k);
    }
    public static int binGap(int n) {
        ArrayList<Integer> l = new ArrayList<Integer>();

        char[] arr = Integer.toBinaryString(n).toCharArray();
       // boolean startGapSeq = false, endGapSeq = false;
        int i = 0;

        while(i < arr.length) {
            while (i < arr.length && arr[i] =='0') i++;
            boolean startGapSeq = false, endGapSeq = false;
            int countGapLen =0;
            if (i < arr.length && arr[i] == '1') {
                startGapSeq = true; i++;
                while (i < arr.length && arr[i] =='0') {
                    countGapLen++;
                    i++;
                }
                if(i < arr.length && arr[i] == '1') {endGapSeq = true;}
            }

            if (startGapSeq && endGapSeq) l.add(countGapLen);

        }

        Integer max = 0;
        for (Integer temp : l) {

            if (temp > max) max = temp;
        }

        return max;
    }
    public static int solution(int X, int Y, int D) {
        System.out.println();
        if (((Y - X) % D) == 0) return (Y - X)/D;
        return ((Y - X)/D) + 1;
    }
}
