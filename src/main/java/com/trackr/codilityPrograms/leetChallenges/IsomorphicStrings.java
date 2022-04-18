package com.trackr.codilityPrograms.leetChallenges;

import java.util.HashMap;

/**
 * Created by deepti on 11/6/19.
 */
public class IsomorphicStrings {
    //Two strings str1 and str2 are called isomorphic
    // if there is a one to one mapping possible for every character of str1 to every character of str2.
    // And all occurrences of every character in ‘str1’ map to same character in ‘str2’
    //str1 = "abcda"
    //str2 = "zyxwz"

    //  Input:  str1 = "aab", str2 = "xxy"
    //  Output: True
    //  'a' is mapped to 'x' and 'b' is mapped to 'y'.
    //
    //    Input:  str1 = "aab", str2 = "xyz"
    //    Output: False
    //    One occurrence of 'a' in str1 has 'x' in str2 and
    //    other occurrence of 'a' has 'y'.
    public static void main(String[] args) {
        IsomorphicStrings c = new IsomorphicStrings();
       boolean res =  //c.isIsomorphicStrings("1234", "12");
        c.isIsomorphicStrings("aabcdabcd","xxyzwxyzw");
       // c.isIsomorphicStrings("aab","xyz");
        //c.isIsomorphicStrings("aabbc","xxzzz");
        //c.isIsomorphicStrings("aab","xxy");
        //c.isIsomorphicStrings("aba","xxy");
        //c.isIsomorphicStrings("aab","xyz");
        System.out.println(res);
    }
    boolean isIsomorphicStrings(String str1, String str2) {
        if(str1.equals(null) || str1.equals("")) {
            throw new RuntimeException("Blank or null string is not expected");
        }
        if (str1.length()!= str2.length()) return false;

        HashMap<Character, Character> h = new HashMap<Character, Character>();

        for (int i = 0; i < str1.length(); i++) {
            char c2 = str2.charAt(i);
            char c = str1.charAt(i);

            if (h.get(c) == null) {
                if (h.containsValue(c2)) return false;
                h.put(c,c2);
            } else {
                char t = h.get(c);
                if (t != c2) return false;
            }
        }
        return true;
    }




}
