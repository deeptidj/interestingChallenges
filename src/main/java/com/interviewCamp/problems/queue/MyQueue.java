package com.interviewCamp.problems.queue;

public class MyQueue {
    int capacity = 10;
    int[] arr;
    int front, back;
    int length;

    MyQueue() {
        arr = new int[capacity];
        front = 0; back = 0; length = 0;
    }

    MyQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0; back = 0; length = 0;
    }

    public boolean isEmpty(){
        if (back == 0) return true;
        else return false;
    }

    public boolean isFull(){
        if (back == capacity) return true;
        else return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(int element){
        if (!this.isFull()) {
            length++;
            arr[back++] = element;
        }
    }

    public int remove() {
        if(!this.isEmpty()){
            length--;
            return arr[front++];
        }
        else return -1;
    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.println(" "+arr[i] +" " );
        }
        System.out.println();
        System.out.println("Length of the list = "+length);
    }

}
