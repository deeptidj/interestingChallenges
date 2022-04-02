package com.timepass.challenges;

/**
 * Created by Deep on 9/28/19.
 */
public class CyclicRotation {
    public static void main(String[] args) {
        CyclicRotation c = new CyclicRotation();
        int[] A = {1, 2, 3, 4};// 3,4,1,2
        // 0 + 2 % 4 = 2
        // 1 + 2 % 4 = 3
        // 2 + 2 % 4 = 0
        // 3 + 2 % 4 = 1

        // Final after cyclic rotation => 3, 4 ,1 , 2
        int[] B = {3, 4, 1, 2};

        int k = 2;
        int len = A.length;
        for (int i = args.length; i >= 0; i--) {
            // shift by k positions
           int newPos = (i+k) % len; //
            int temp = A[newPos]; //
           A[newPos] = A[i]; //
            A[i] = temp; //
        }

        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] solution(int[] A, int k) {
        int t;
        int swapPos;
        int r = k % A.length;
        System.out.println(" Remainder " + r);
        for (int i = 0; i < A.length; i++) {
            if ((i + r) >= A.length)
                swapPos = r - (A.length - i);
            else swapPos = i + r;

            System.out.println("Swap Position is : " + swapPos);
            t = A[swapPos];
            A[swapPos] = A[i];
            A[i] = t;
        }
        return A;
    }
//    public int solution() {
//        long l = Long.MAX_VALUE;
//        l = Long.MAX_VALUE + Long.MIN_VALUE;
//       // l = Integer.MAX_VALUE + Integer.MAX_VALUE;
//        System.out.println(l);

//        float f1 = Integer.MAX_VALUE; // a constant with the same value
//        float f2 = f1 + 1;
//        float f3 = f2 + 1;
//
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
//        System.out.println(f3 - f1);
//        System.out.println(f1 == f2);
//        System.out.println(f1 == f3);
//        System.out.println(f2 == f3);
    //       return 0;
//
    //  }
//    public void solution(int N) {
//                for (int j = 1; j < N; j++) {
//                    System.out.println("L");
//                }
//                for (int i = 0; i < N; i++) {
//                    System.out.print("L");
//                }
//
//    }

    int solution2(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}


