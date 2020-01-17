package com.timepass.challenges;

/**
 * Created by deepti on 1/16/20.
 */
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str = "String reversed is This";
        StringBuffer res= new StringBuffer();
        String[] arrStrings = str.split(" ");

        int size = arrStrings.length;

        if (size == 0 ){
            System.out.println("String empty");
            return;
        }
        for (int j = size-1; j >= 0; j--) {
            res.append(arrStrings[j]);
            res.append(" ");

        }
        System.out.println(res.toString());

    }
}
