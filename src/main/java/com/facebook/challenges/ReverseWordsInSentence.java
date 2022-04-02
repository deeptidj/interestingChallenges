package com.facebook.challenges;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello Deepti how are you";
        int lenOrig = sentence.length();
        String res = "you are how Deepti Hello";
        String[] words = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = words.length -1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        String res1 = sb.toString().trim();
        int lenReversed  = res1.length();
        System.out.println(res1);
        System.out.println(res);
        System.out.println(lenOrig +" == "+ lenReversed);

    }
}
