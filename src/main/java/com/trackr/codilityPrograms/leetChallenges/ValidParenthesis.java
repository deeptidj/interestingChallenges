package com.trackr.codilityPrograms.leetChallenges;


import java.util.Stack;

/**
 * Created by Deep on 3/14/18.
 */
public class ValidParenthesis {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public static void main(String[] args) {

        String s = "{}";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("true : "+ validParenthesis(s));

        s = " {}()[]{}";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("true : "+ validParenthesis(s));

        s = "({";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("false : "+ validParenthesis(s));

        s = "(}";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("false : "+ validParenthesis(s));

        s = ")";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("false : "+ validParenthesis(s));

        s = "{]  ";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("false : "+ validParenthesis(s));

        s = "{][}()";
        System.out.println("Valid Parenthesis for s = "+s);
        System.out.println("false : "+ validParenthesis(s));

    }
    // String input is strictly brackets.
    public static boolean validParenthesis(String str) {
        char[] arr= str.trim().toCharArray();
        System.out.println();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (stack.peek() == '{' && c != '}'){
                    return false;
                } if (stack.peek() == '(' && c != ')'){
                    return false;
                } if (stack.peek() == '[' && c != ']'){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

}

