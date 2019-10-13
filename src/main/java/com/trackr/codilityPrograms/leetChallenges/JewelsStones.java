package com.trackr.codilityPrograms.leetChallenges;

import java.util.HashSet;

/**
 * Created by deepti on 3/14/18.
 */
public class JewelsStones {
    public static void main(String args[]) {
    int result = jewelsStones("zZ", "ZZZ");
    System.out.println(result);
    }

    public static int jewelsStones(String J, String S) {
        char[] arr_j = J.toCharArray();
        char[] arr_s = S.toCharArray();

        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i <arr_j.length; i++) {
            set.add(arr_j[i]);
        }
        int count = 0;

        for(int i = 0; i < S.length(); i++) {
            if(set.contains(arr_s[i])) {
                count++;
            }
        }
        return count;
    }
}
