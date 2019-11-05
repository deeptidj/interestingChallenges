package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 10/14/19.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse a string");
        ReverseString c = new ReverseString();
        System.out.println(c.reverse("abcd"));

    }
    public String reverse(String str) {
        if (str.equals(null) || str.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
