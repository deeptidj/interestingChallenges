package com.trackr.codilityPrograms.leetChallenges;


import java.util.Stack;

/**
 * Created by deepti on 3/14/18.
 */
public class ValidParanthesis {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public static void main(String[] args) {

        String s = "{}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("true : "+ validParanthesis(s));

        s = " {}()[]{}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("true : "+ validParanthesis(s));

        s = "({";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validParanthesis(s));

        s = "(}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validParanthesis(s));

        s = ")";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validParanthesis(s));

        s = "{]  ";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validParanthesis(s));

        s = "{][}()";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validParanthesis(s));

    }
    // String input is strictly brackets.
    public static boolean validParanthesis(String str) {
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

