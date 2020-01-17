package com.timepass.challenges;

/**
 * Created by deepti on 1/16/20.
 */
public class ReverseLetterInWordsInSentence {
    public static void main(String[] args) {
        String str = "I ma a doog lrig";
        String reversedWord;

        StringBuffer res = new StringBuffer();
        String[] arrWords = str.split(" ");
        for (String s :
                arrWords) {

            reversedWord = reverse(s);

            res = res.append(reversedWord);
            res = res.append(" ");
        }
        System.out.println(res);

    }
    private static String reverse(String s) {
        char[] arrChar = s.toCharArray();
        int tail = arrChar.length-1;
        for (int i = 0; i < arrChar.length/2 ; i++) {
            char tmp = arrChar[tail];
            arrChar[tail] = arrChar[i];
            arrChar[i] = tmp;
            tail--;
        }
        return String.valueOf(arrChar);

    }
}
