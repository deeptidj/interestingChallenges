package com.interviewCamp.problems;

import java.util.HashMap;

public class PrefixSums {
    public static void main(String[] args) {
        int[] a = {-1, 2, 1,-4,2,3,-1,2};
        int[] res = prefixSumsToZero(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();

        int[] a1 = {-1, 2,4,-2,6,8};
        int[] res1 = prefixSumsToTarget(a1, 6);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i]+" ");
        }
        System.out.println();
    }

    public static int[] prefixSumsToZero(int[] a){
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

            if(sum == 0) {
                return new int[]{0,i};
            }
            if(m.containsKey(sum)) {
                return new int[]{m.get(sum)+1, i};
            } else {
                m.put(sum, i);
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] prefixSumsToTarget(int[] a, int x){
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if(sum == x) {
                return new int[]{0,i};
            }
            if(m.containsKey(x-sum)) {
                return new int[]{m.get(x-sum), i};
            } else {
                m.put(sum, i);
            }
        }

        return new int[]{-1,-1};
    }
}
