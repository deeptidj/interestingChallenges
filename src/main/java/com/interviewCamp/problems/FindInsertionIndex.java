package com.interviewCamp.problems;

public class FindInsertionIndex {
    //You are given a sorted array A and a target T. Return the index where T would be placed if inserted in order. For example,
    //
    //A = [1,2,4,5,6,8] and T = 3, return index 2
    //A = [1,2,4,5,6,8] and T = 0, return index 0
    //A = [1,2,4,5,6,8] and T = 4, return index 3.
    //A = [1,2,3,4,5,10,11] and T = 6, return index 5
    //A = [1,5,6,7,10] and T = 2, return index 1
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5,10,11};//3
//        int target = 6;
//        System.out.println("5 == "+findInsertionIndex(a,target));

        int[] a = new int[] {1,5,6,7,8};
        int target = 2;
        System.out.println("1 == "+findInsertionIndex(a,target));

//        a = new int[] {1,2,4,5,6,8};
//        target = 3;
//        System.out.println("2 == "+findInsertionIndex(a,target));
//
//        a = new int[] {1,2,4,5,6,8};
//        target = 0;
//        System.out.println("0 == "+findInsertionIndex(a,target));
//
//        a = new int[] {1,2,4,5,6,8};
//        target = 2;
//        System.out.println("1 == "+findInsertionIndex(a,target));

    }

    public static int findInsertionIndex(int[] a, int target) {
        int start = 0 ; int end = a.length-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            System.out.println("mid = " +mid);
            //1,5 target = 2
                if (target >= a[mid]) {
                    if (mid == a.length-1) return a.length;
                    start = mid + 1;
                } else { //1,5,6,7,10 target = 2
                     if (mid == 0 || a[mid-1] <= target){
                        return mid;
                    }
                     end = mid - 1;
                }
        }
        return -1;
    }
}
