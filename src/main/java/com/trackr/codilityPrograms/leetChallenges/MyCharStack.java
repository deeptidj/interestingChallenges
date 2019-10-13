package com.trackr.codilityPrograms.leetChallenges;

/**
 * Created by deepti on 2/6/18.
 */
public class MyCharStack {
    public int size;
    private int top=-1;
    private char[] arr;

    public MyCharStack(int size) {
        this.size = size;
        arr = new char[size];
    }

    public void push(char d) {

        ++top;
        if(top < size) {
            arr[top] = d;

            System.out.println("Pushed" + d);
        }
        else System.out.println("Stack is full");

    }

    public char pop() {
        top--;
        if(top > 0)
        {
            char d = arr[top];
            System.out.println("Poping" + d);
            return d;
        }
        else {
         System.out.println("Stack is empty");
         return '!';
        }
    }
    public char peek() {
        if (top-1 >= 0) return arr[top-1];
        else return '!';
    }
    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }
}
