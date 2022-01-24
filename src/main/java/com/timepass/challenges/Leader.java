package com.timepass.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepti on 9/28/19.
 */
public class Leader {
    public static void main(String[] args) {
        Leader c = new Leader();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(c.solution(A));
    }

    public int solution(int[] A) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int k : A) {
            if (h.containsKey(k)) {
                sum = h.get(k) + 1;
                h.put(k, sum);
            } else {
                h.put(k, 1);
            }

        }
        int max = 0, rs = -1;
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            if (max < e.getValue()) max = e.getValue();
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            if (e.getValue() == max) {
                rs = e.getKey();
            }
        }

        return rs;
    }
}
