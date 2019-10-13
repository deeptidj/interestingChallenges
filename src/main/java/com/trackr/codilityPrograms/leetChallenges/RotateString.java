package com.trackr.codilityPrograms.leetChallenges;

import com.sun.deploy.util.StringUtils;

/**
 * Created by deepti on 3/16/18.
 *
 * We are given two strings, A and B.

 A shift on A consists of taking string A and moving the leftmost character to the rightmost position.
 For example, if A = 'abcde', then it will be 'bcdea' after one shift on A.
 Return True if and only if A can become B after some number of shifts on A.

 Example 1:
 Input: A = 'abcde', B = 'cdeab'
 Output: true

 Example 2:
 Input: A = 'abcde', B = 'abced'
 Output: false
 */
public class RotateString {


    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeab";
        boolean res = rotateString(a,b);
        System.out.println(res);
    }

    public static boolean rotateString(String a,
                                       String b) {
        String temp = a + a;
        if (a.length() != b.length()) return false;
        return temp.toLowerCase().contains(b.toLowerCase());

    }

}
