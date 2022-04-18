package com.timepass.challenges;

public class RecursionExamplesMore {
    public static void main(String[] args) {
        System.out.println("Factorial 4 : 24 == "+factorial(4));
        System.out.println("Reverse String abcd : dcba == "+reverseRecursion("abcd", "abcd".length()-1, new StringBuffer("")));
        reverseNumber(123, 0);
    }
    public static int factorial(int n){
        if (n <= 1 ) return 1;
        return n * factorial(n-1);
    }
    public static String reverseRecursion(String str, int index, StringBuffer sb){
        if(index < 0) return "";
        sb.append(str.charAt(index));
        reverseRecursion(str, index-1, sb);
        return sb.toString();
    }

    public static void reverseNumber(int n, int rev){
        System.out.println("Number = "+n+" Reverse = "+rev);
        if (n <= 0) {
            System.out.println("Reverse is "+rev);
            return;
        }
        int remainder = n % 10;
        rev = rev * 10 + remainder;
        System.out.println("Remainder = "+remainder+" Reverse = "+rev);
        reverseNumber(n/10, rev);
    }
}
