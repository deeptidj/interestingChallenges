package com.trackr.codilityPrograms.leetChallenges;

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
        int[] arr = {2,5,3,4,2,5,4,3,8,8,9,9,9};
        int res = singleNumber(arr);
        //int result = singleNumberAscii(arr);
        System.out.println(res);
        //System.out.println(result);
    }

    public static int singleNumberAscii(int[] nums) {
        char ch = 'a';
        int ascii = (int) ch;
        System.out.println(ascii);
        return ascii;
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
