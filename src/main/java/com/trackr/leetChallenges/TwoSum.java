package com.trackr.leetChallenges;

import com.sun.tools.javah.Util;

import java.util.HashMap;

/**
 * Created by deepti on 3/14/18.
 */
public class TwoSum {

    public static void main(String args[]) {
            int[] arr = {2, 5, 8, 10};
            int target = 18;
           int[] result = twoSum(arr, target);
           System.out.println(result[0]);
        System.out.println(result[1]);


      }
        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
            for(int i = 0; i< nums.length;i++) {
                map.put(nums[i], i);
            }
            System.out.println(map);

            int[] res = new int[2];
            for(int i = 0 ; i < nums.length; i++) {
                int rem = target - nums[i];
                if ( map.containsKey(rem) && (map.get(rem) != i) ) {
                    res[0] = i;
                    res[1] = map.get(rem);
                    break;
                }
            }
            return res;
        }

    }




