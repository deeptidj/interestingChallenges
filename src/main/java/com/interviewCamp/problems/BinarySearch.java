package com.interviewCamp.problems;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ResourceBundle;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        binarySearchWithUnknownLength(arr, 4);
        System.out.println("DONE");
        System.exit(1);

        int[] a = new int[]{1,2,2,2,3,3,3,4,4,5};
        int ele = 2;
        Arrays.sort(a);
        int foundAt = binarySearch(a, ele);
        System.out.println("found at "+foundAt);

        int[] dupArray = new int[]{2,3,3,4,4,5,6,6,7};
        int ele2 = 4;
        Arrays.sort(dupArray);
        int foundAt2 = binarySearchWithDuplicates(dupArray, ele2);
        System.out.println("Found at "+foundAt2);


        int[] closestArray = {10, 20, 30, 40, 50};
        int eleClosestTo = 31;
        int resClosest = binarySearchClosest(closestArray, eleClosestTo);
        System.out.println("Closest to "+eleClosestTo + " is = "+resClosest);


        int[] cyclickRotatedarray = {10,20,30,40,50};
        int result = binarySearchInCyclicRotatedArray(cyclickRotatedarray);
        System.out.println("Start is at position = "+ result);

        cyclickRotatedarray = new int[] {40,50,10,20,30};
        result = binarySearchInCyclicRotatedArray(cyclickRotatedarray);
        System.out.println("Start is at position = "+ result);

        cyclickRotatedarray = new int[] {20,30,40,50,10};
        result = binarySearchInCyclicRotatedArray(cyclickRotatedarray);
        System.out.println("Start is at position = "+ result);

    }

    public static Integer binarySearch(int[] a, int target) {
        int start = 0 ; int end = a.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < a[mid]) {
                end = mid-1;
            } else if (target > a[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static Integer binarySearchWithDuplicates(int[] a, int ele) {
        int start = 0 ; int end = a.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (ele < a[mid] || (ele == a[mid] && mid>0 && ele == a[mid-1]) ) {
                end = mid-1;
            } else if (ele > a[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static Integer binarySearchInCyclicRotatedArray(int[] a) {
        if (a == null || a.length == 0) return -1;
        int start = 0; int end = a.length-1; int rightMostElement = a[a.length-1];
        while(start <= end) {
            int mid = start + (end-start)/2;
            if (a[mid] <= rightMostElement && (mid == 0 || a[mid-1] > a[mid])) {
                return mid;
            } else if (a[mid] > rightMostElement) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static Integer binarySearchWithUnknownLength(int[] a, int target) {
        int hi = 1; int lastIndex = -1;
        while(true) {
            try {
                int tmp = a[hi];
            } catch(ArrayIndexOutOfBoundsException Ex) {
                lastIndex = binarySearchForLastIndex(a, hi/2, hi);
                break;
            }
            hi = hi * 2; //double hi
        }
        return binarySearchOverRange(a, target, 0, lastIndex);
    }

    public static Integer binarySearchOverRange(int[] a, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < a[mid]) {
                end = mid-1;
            } else if (target > a[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    public static Integer binarySearchForLastIndex(int[] a, int low, int hi){
        while (low <= hi) {
            int mid = low + (hi -low)/2;

            try {
                int tmp = a[mid];
            } catch (ArrayIndexOutOfBoundsException ex) {
                hi = mid -1;
                continue;
            }

            try {
                int tmp = a[mid+1];
            } catch (ArrayIndexOutOfBoundsException ex) {
                return mid;
            }
            low = mid + 1;
        }

        return -1;
    }
    public static Integer binarySearchClosest(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        int mid; int closestIndex = -1;
        while(start <= end) {
            mid = start + (end-start)/2;
            closestIndex = record(a, mid, closestIndex, target);
            if(target < a[mid]) {
                end = mid-1;
            } else if (target > a[mid]) {
                start = mid+1;
            }
             else {
                 return mid;
            }
            }
        return a[closestIndex];
        }

    public static Integer record(int[] a, int mid, int closestIndex, int target) {
        if (closestIndex == -1 || Math.abs(a[mid] - target) <  Math.abs(a[closestIndex] - target)) {
            return mid;
        }
        return closestIndex;
    }

}
