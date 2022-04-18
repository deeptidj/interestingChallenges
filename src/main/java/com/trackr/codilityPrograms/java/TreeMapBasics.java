package com.trackr.codilityPrograms.java;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by deepti on 9/21/19.
 */
public class TreeMapBasics {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());
        tm.put(100,"zzzzd");
        tm.put(45,"for");
        tm.put(102,"asdf");
        tm.put(34,"dasd");


        for(Map.Entry me: tm.entrySet()){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }

    }
}
