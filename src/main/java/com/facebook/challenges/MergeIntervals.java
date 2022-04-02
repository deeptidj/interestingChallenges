package com.facebook.challenges;

import com.trackr.codilityPrograms.java.ArrayListsBasics;

import java.util.*;

public class MergeIntervals {
    public static class Interval{
        int x;
        int y;

        Interval(int x, int y){
            this.x = x;
            this.y = y;
        }
        void print() {
            System.out.print("( "+x + " , "+y+" ) ");
        }

    }
    public static void main(String[] args) {
        Interval[] arr = new Interval[4];

        arr[0] = new Interval(2,4);
        arr[1] = new Interval(1, 3);
        arr[2] = new Interval(5,8);
        arr[3] = new Interval(9,10);
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
        System.out.println();
        mergeIntervals(arr);
        System.out.println();
    }

    public static void mergeIntervals(Interval[] arr){
        Stack<Interval> stack = new Stack<>();
        //sort the intervals
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.x - o2.x;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
        System.out.println("After Sorting");
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval top = stack.peek();
            System.out.println();
            if (arr[i].x < top.y ){
                Interval tmp = stack.pop();
                tmp.y = arr[i].y ;
                stack.push(tmp);
            }
            else {
                stack.push(arr[i]);
            }

        }

        while(!stack.isEmpty()) {
            Interval t = stack.pop();
            System.out.println(" ( " +t.x +" , "+t.y+ " ) ");
        }
        return;

    }
}
