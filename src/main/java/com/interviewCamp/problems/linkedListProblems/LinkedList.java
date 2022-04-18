package com.interviewCamp.problems.linkedListProblems;

import java.util.ArrayList;

public class LinkedList {
    Node head;
    LinkedList(){
        this.head =null;
    }
    Node build123(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        head = n1;
        return head;
    }

    void printLinkedList() {
        Node curr = this.head;
        while(curr != null) {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
        System.out.println();
    }

    void add(Node n) {
        if (head == null) {
            head = n;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = n;
    }
    void add(int data){
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        Node newNode = new Node(data);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    Node delete(int n){
        if (n==0) {
            head = head.next;
            return head;
        }
        Node curr = head; int count = 0;Node prev = head;

        while(curr != null) {
            if(count == n) {
                prev.next = curr.next; //deleting node curr
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }


    Node getNth(int n) {
        Node curr = this.head;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (curr != null) curr = curr.next;
            else throw new IndexOutOfBoundsException(" no of nodes is less than "+n);
        }
        if (curr == null) throw new IndexOutOfBoundsException("no node at index "+n);
        return curr;
    }


}
