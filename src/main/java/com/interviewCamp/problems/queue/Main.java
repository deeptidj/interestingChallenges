package com.interviewCamp.problems.queue;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.print();

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.print();

    }
}
