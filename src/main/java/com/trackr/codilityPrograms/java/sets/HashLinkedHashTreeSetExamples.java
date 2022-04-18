package com.trackr.codilityPrograms.java.sets;

import java.util.*;

public class HashLinkedHashTreeSetExamples {
    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('A');
        hs.add('B');
        hs.add('Z');
        hs.add('C');
        for(Character c : hs) {
            System.out.println("char = "+ c);
        }

        Set<Character> sortedSet = new TreeSet<>(hs);
        sortedSet.add('W');
        System.out.println(sortedSet);
        System.out.println(sortedSet.stream().findFirst());


        Set<Character> linkedSet = new LinkedHashSet<>(hs);
        linkedSet.add('W');
        System.out.println("Linked set = "+linkedSet);

    }
}
