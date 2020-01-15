package com.trackr.codilityPrograms.leetChallenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by deepti on 11/4/19.
 */
public class Anagrams {
    public static void main(String[] args) {
        boolean re= areAnagrams("abcdabcd", "abddabcd");
        System.out.println(re);
    }
    public static boolean areAnagrams(String s1, String s2) {
        if (s1 == null || s2==null) return false;
        if (s1.length() != s2.length()) return false;
        System.out.println(s1);
        System.out.println(s2);

        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {

            /*if(h.get(s1.charAt(i))==null) {
                h.put(s1.charAt(i), 1);
            }
            else {
                h.put(s1.charAt(i),h.get(s1.charAt(i))+1 );
            }*/
            h.put(s1.charAt(i), h.getOrDefault(s1.charAt(i),0)+1);
        }

        System.out.println(h);

        for (int i = 0; i < s2.length(); i++) {
            if(h.get(s2.charAt(i))==null) {
                    return false;
            }
            else {
                h.put(s2.charAt(i),h.get(s2.charAt(i))-1);
            }

        }

        Collection<Integer> arr =  h.values();
        for (Integer i: arr) {
            System.out.println(i);
            if(i!=0) return false;
        }

        return true;
    }
}
