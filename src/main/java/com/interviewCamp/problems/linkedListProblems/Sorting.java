package com.interviewCamp.problems.linkedListProblems;

import java.util.ArrayList;

public class Sorting {
    void sort(Node head){
        if(head == null) {
            throw new NullPointerException("Head is null for the linked that needs to be sorted");
        }
        Node curr = head;

        LinkedList l0 = new LinkedList();
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        while(curr != null) {
            switch(curr.data) {
                case 0: l0.add(curr);
                case 1: l1.add(curr);
                case 2: l2.add(curr);
            }
            curr = curr.next;
        }

        LinkedList res = new LinkedList();
        res.add(l0.head);
        res.add(l1.head);
        res.add(l2.head);

        res.printLinkedList();
        }

}
