package com.trackr.codilityPrograms.java.maps;

import java.util.*;

/**
 * Created by deepti on 9/21/19.
 */
public class HashMapBasics {
    public static void main(String[] args) {
        System.out.println("HashMap is a Map based collection class, unsynchronized and permits nulls - both keys and values");
        System.out.println("Not an ordered collection");
        System.out.println("Must need to import java util HashMap");

        HashMap<Integer, String> h1 = new HashMap<Integer, String>();
        h1.put(1, "Deepti");
        h1.put(2, "a1");
        h1.put(3, "Deepti2");
        h1.put(4, "as2");
        h1.put(5, "as3");
        h1.put(6, "as4");
        h1.put(7, "as5");


        Iterator ite = h1.entrySet().iterator();
        while(ite.hasNext()) {
            Map.Entry me = (Map.Entry)ite.next();
            System.out.println(me.getKey() + " val : "+me.getValue());
        }

        for(Map.Entry me : h1.entrySet()) {
            System.out.println("Key is: "+me.getKey());
            System.out.println("Value is : "+me.getValue());
        }

        System.out.println(h1.containsKey(1));
        System.out.println(h1.containsValue("as3"));

        System.out.println(h1.get(4));
        System.out.println(h1.keySet());
        System.out.println(h1.size());
        System.out.println(h1);


    }
}
