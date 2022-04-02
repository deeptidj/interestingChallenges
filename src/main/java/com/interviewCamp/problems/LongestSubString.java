package com.interviewCamp.problems;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        //Given a String, find the longest substring with unique characters.
        String s = "whatwhywhere";
        String res = longestSubString(s);
    }
    public static String longestSubString(String str) {
        int start = 0; int end = 0; int longest = 1;
        int[] res = new int[]{-1,-1};
        HashMap<Character, Integer> map = new HashMap<>();
        while(start < str.length()) {
            end++;
            Character c = str.charAt(end);
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            } else {
                map.put(c,end);
            }

            if (end - start + 1 > longest) {
                longest = end - start + 1;
                res[0] = start;
                res[1] = end;
            }

        }

        return str;
    }
}
