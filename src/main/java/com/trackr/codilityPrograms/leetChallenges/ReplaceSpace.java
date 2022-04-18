package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 11/6/19.
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        ReplaceSpace c = new ReplaceSpace();
        String res = c.replaceString("a b c");
        System.out.println(res);
    }
    String replaceString(String s){
        if (s == null || s.equals("")) return " ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) ==' ') {
                sb.append("%20");
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
