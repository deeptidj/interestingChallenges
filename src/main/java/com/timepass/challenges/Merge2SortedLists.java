package com.timepass.challenges;

import java.util.*;

/**
 * Created by deepti on 1/16/20.
 */
public class Merge2SortedLists {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,3,5));
        List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(2));
        List<Integer> res = new ArrayList<Integer>();
//        res.addAll(arr1);
//        res.addAll(arr2);
//
        int i=0,j = 0;
        while(i < arr1.size() || j < arr2.size()) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    res.add(arr1.get(i));
                    i++;
                } else {
                    res.add(arr2.get(j));
                    j++;
                }
            }
            else if (i < arr1.size()) {
                while(i < arr1.size()) {res.add(arr1.get(i));i++;}
            } else if (j < arr2.size()) {
                while(j < arr2.size()) {res.add(arr2.get(j));j++;}
            }
        }

        System.out.println(res);
    }
}
