package com.interviewCamp.problems;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s = "I live in a house";
        String r = "house a in live I";

        String res = reverse(s);
        System.out.println(res);

    }
    public static String reverse(String s){
        if (s == null | s.length() ==0 ) return s;
        StringBuffer sb = new StringBuffer();
        String[] words = s.split(" ");
        for(int i = words.length-1; i >=0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

