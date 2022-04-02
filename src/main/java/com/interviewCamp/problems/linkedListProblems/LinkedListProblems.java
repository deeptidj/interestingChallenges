package com.interviewCamp.problems.linkedListProblems;

public class LinkedListProblems {

    public static void main(String[] args) {
        System.out.println("Linked List problems");
        //System.out.println(args[0]);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l2.add(33);
        l2.printLinkedList();

        l1.build123();
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.printLinkedList();

        //get Nth from the Linked List
        Node second = l1.getNth(2);
        System.out.println(second.data);

        Node tenth = l1.getNth(8);
        System.out.println(tenth.data);
        try {
        Node outOfBounds = l1.getNth(100);
        System.out.println(outOfBounds.data);
        } catch (ArrayIndexOutOfBoundsException Ex) {
            System.out.println("Array out of bounds exception = "+Ex.getMessage());
        } catch (IndexOutOfBoundsException indexEx) {
            System.out.println("Index out of bounds Exceptions = "+indexEx.getMessage());
        }
        System.out.println("out of catch - could not get 100th node");

        //SORTING by re-linking
        LinkedList sortThis = new LinkedList();
        sortThis.add(2);
        sortThis.add(0);
        sortThis.add(1);
        sortThis.printLinkedList();

        Sorting s = new Sorting();
        s.sort(sortThis.head);
    }

}
