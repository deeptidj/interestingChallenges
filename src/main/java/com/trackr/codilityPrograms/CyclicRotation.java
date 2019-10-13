package com.trackr.codilityPrograms;

/**
 * Created by deepti on 9/28/19.
 */
public class CyclicRotation {
    public static void main(String[] args) {
       // int[] A = {3,8,9,7,6};

        int[] A = {0,3,3,7,5,3,11,1};

        CyclicRotation c = new CyclicRotation();
       // System.out.println(c.solution(4));
        c.solution();
        //c.solution(4);
       // c.solution(1);
      //  c.solution(2);
//
       // c.solution(100);
//
//        c.solution(0);
      //  c.solution2(A);
    }
    public int solution() {
        long l = Long.MAX_VALUE;
        l = Long.MAX_VALUE + Long.MIN_VALUE;
       // l = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(l);

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
        return 0;

    }
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


