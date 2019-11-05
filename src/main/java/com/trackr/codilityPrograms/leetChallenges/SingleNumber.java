package com.trackr.codilityPrograms.leetChallenges;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by deepti on 3/14/18.
 */
public class SingleNumber {
    /*
    Given an array of integers, every element appears twice except for one. Find that single one.
    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
    */
    public  static void main(String args[]) {
       // int[] arr = {1,1,2,2,4,4,5};
        //int[] arr = {1,4,4,5,5};
        //int[] arr = {1};
      // int[] arr = {1,1,2,2,4,4};
        int[] arr = {};

        //int[] arr = {2,2,3,3,1,1,4};

        int res = singleNumber2(arr);
       // int res = singleNumber(arr);
        //int result = singleNumberAscii(arr);
        System.out.println(res);
        //System.out.println(result);
    }

    public static int singleNumberAscii(int[] nums) {
        char ch = 'a';
        int ascii = (int) ch;
        System.out.println(ascii);
        ch = 'z';
        ascii = (int) ch;
        System.out.println(ascii);
        return ascii;
    }
    public static int singleNumber2(int[] nums) {

        if (nums.length == 0) return -1;
        if (nums.length < 2) return nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1]){
             return nums[i];
            }
            i++;
        }

        if(nums[nums.length -1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

       return -1;
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            if (map.containsKey(nums[i])) c = map.get(nums[i]);
            map.put(nums[i], ++c);
        }
        for (Integer k: map.keySet()) {
            System.out.println("key: " + k + " value: " + map.get(k));
              if(map.get(k) == 1) return k;
        }
        return 0;
    }
}
