package com.trackr.codilityPrograms.java;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by deepti on 9/21/19.
 */
public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("asdf");
        ll.add("qwert");


        Iterator ite = ll.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        ll.addFirst("1234");
        System.out.println("After adding: ");

        Iterator ite1 = ll.iterator();
        while(ite1.hasNext()){
            System.out.println(ite1.next());
        }

    }
}
