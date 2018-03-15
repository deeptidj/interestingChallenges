package com.trackr.leetChallenges;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by deepti on 3/14/18.
 */
public class ExampleSet {
    public  static void main(String args[]) {
        System.out.println("Starting");
        int[] arr = {2,5,10,4};
        int target = 7;

        Set<Integer> set = new HashSet<Integer>();
        try {
            for(int i = 0; i < 4; i++) {
                set.add(arr[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("Sorted Set");
            System.out.println(sortedSet);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }



    }



}
