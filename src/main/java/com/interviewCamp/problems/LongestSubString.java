package com.interviewCamp.problems;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        //Given a String, find the longest substring with unique characters.
        String s = "ababqwe";
        System.out.println(s+" 5 == "+ longestUniqueSubString(s));
        s = "whatwhywhere";
        System.out.println(s+" 5 == "+ longestUniqueSubString(s));
        s = "abcd";
        System.out.println(s+" 4 == "+ longestUniqueSubString(s));

        /*
        whatwhywhere
        w 4
        h 1
        a 2
        t 3
        y 6
        maxLengthTillNow = 4
        i = 4, 5 
        maxLengthTillNow = 5 - 1 = 4 
        i = 6 
        start = i || map.get(arr[i]) 
        maxLengthTillNow = i - start 

         */


    }
    public static int longestUniqueSubString(String str) {
        int start = 0; int maxLength = 0;int length=0;
        HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                Character c = str.charAt(j);
                if(!map.containsKey(c)) {
                    length++;
                }
                else {
                    start = map.get(c);
                    length= j - start;
                }
                maxLength = Math.max(maxLength, length);
                map.put(c,j);
            }

        return maxLength;
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
