package com.interviewCamp.problems.linkedListProblems;

public class Node {
    int data;
    Node next;
    Node(){
        data=-1;
        next=null;
    }
    Node (int data) {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node node){
        this.data = data;
        this.next = node;
    }

}

