package com.trackr.codilityPrograms.leetChallenges;

import java.util.SimpleTimeZone;

/**
 * Created by deepti on 10/15/19.
 */
public class StackSimple {
    private int top;
    private int capacity;
    private int arr[];

    public StackSimple(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
        this.capacity = 10;
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
    public boolean isFull() {
        if (top == capacity) return true;
        else return false;
    }
    public void push(int t){
        if(!isFull()) {
            arr[++top] = t;
        }
    }
    public int pop(){
        if(!isEmpty())
        return arr[top--];
        else {
            System.out.println("Stack empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        if (top == -1) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Simple stack");
        //StackSimple c = new StackSimple(10);
        StackSimple c = new StackSimple(10);
        c.push(0);
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.push(5);
        c.printStack();

        c.pop();c.pop();c.pop();

        c.printStack();
        c.push(6);
        c.push(7);
        c.push(8);
        c.push(9);

        c.printStack();
    }

}
