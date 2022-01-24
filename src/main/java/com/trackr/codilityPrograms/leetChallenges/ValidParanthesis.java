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
    public static void main(String args[]) {

        String s = "{}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("true : "+ validPara(s));

        s = " {}()[]{}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("true : "+ validPara(s));

        s = "({";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validPara(s));

        s = "(}";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validPara(s));

        s = ")";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validPara(s));

        s = "{]  ";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validPara(s));

        s = "{][}()";
        System.out.println("Valid Paranthesis for s = "+s);
        System.out.println("false : "+ validPara(s));

    }
    // String input is strictly brackets.
    public static boolean validPara(String str) {
        char[] arr= str.trim().toCharArray();
        System.out.println();
        Stack<Character> stack = new Stack<Character>();
        for (char c : arr) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
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

        if (stack.isEmpty()) return true;
        else return false;
    }

    public static boolean validParanthesis(String str) {
        MyCharStack st = new MyCharStack(10);

        char[] arr_s = str.toCharArray();
        for (int i = 0; i < arr_s.length; i++) {
            char c = arr_s[i];
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
                continue;
            }

            if (c == '}') {
                if (st.peek() != '{' && st.size == 0) {
                    return false;
                }
            }
            if (c == ']') {
                if (st.peek() != '[' && st.size == 0) {
                    return false;
                }
            }
            if (c == ')') {
                if (st.peek() != '(' && st.size == 0) {
                    return false;
                }
            }
            st.pop();
            if (!st.isEmpty()) {
                return false;
            }

        }
        return true;
    }
}

