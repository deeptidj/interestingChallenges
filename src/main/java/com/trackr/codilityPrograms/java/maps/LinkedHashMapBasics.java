package com.trackr.codilityPrograms.java.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by deepti on 9/21/19.
 */
public class LinkedHashMapBasics {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(22,"sdaf");
        lhm.put(1,"sdsa");
        lhm.put(499,"SADASW");

        for(Map.Entry me:lhm.entrySet()) {
            System.out.println(me);
        }
        Iterator iterator = lhm.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.println("Next value = "+iterator.next());
        }


    }
}
