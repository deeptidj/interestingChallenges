package com.trackr.codilityPrograms.leetChallenges;


/**
 * Created by deepti on 3/14/18.
 */
public class ValidParanthesis {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */
    public static void main(String args[]) {

        System.out.println("Valid Paranthesis");
        boolean res = validParanthesis("(({}))");
        System.out.println(res);

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

