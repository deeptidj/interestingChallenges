package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 10/14/19.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from string");
        RemoveDuplicates c = new RemoveDuplicates();
        System.out.println(c.removeDups("abcadbc"));
    }
    public String removeDups(String s){
        if (s.equals(null) || s.equals("")) {
            //throw RuntimeException("String passed is empty or null"); DEEP
            System.out.println("String passed is empty");
        }

        char[] str = s.toCharArray();

        boolean[] hit = new boolean[256];
        for (int i = 0; i < str.length; i++) {
            hit[i] = false;
        }

        int tail = 0;

        for (int i = 0; i < str.length; i++) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < tail; k++) {
            sb.append(str[k]);
        }

        return sb.toString();
    }
}
