package com.trackr.codilityPrograms.leetChallenges;

import java.util.HashMap;

/**
 * Created by deepti on 3/16/18.
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 Find all unique triplets in the array which gives the sum of zero.
 Note:
 Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 The solution set must not contain duplicate triplets.
 For example, given array S = {-1 0 1 2 -1 -4},
 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)
 */
public class ThreeSum {
    public static void main(String[] args) {
    int[] numbers = {-1, 0, 1, 2, -1, -4};
    threeSum(numbers);
    }

    public static void threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i< nums.length;i++) {
            int c = 0;
            if (map.containsKey(nums[i])) {
                c = map.get(nums[i]);
                map.put(nums[i], ++c);
            } else map.put(nums[i], ++c);

        }
        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j=i+1; j< nums.length-1;j++) {
                int b = nums[j + 1];
                int c = (a + b)* -1;
                int count_a = 0;
                if (map.containsKey(a)) {
                    count_a = map.get(a) - 1 ;
                    map.put(a,count_a);
                }


                int count_b = 0;
                if (map.containsKey(b)) {
                    count_b = map.get(b) - 1 ;
                    map.put(b,count_b);
                }

                int count_c = 0;
                if (map.containsKey(c)) {
                    count_c = map.get(c) - 1 ;
                    map.put(c,count_c);
                }

                if ( (map.get(a) >= 0) && (map.get(b) >= 0) && (map.get(c) >= 0))
                {
                    System.out.println(" i = " +i+" nums[i] = "+ nums[i] +" j = "+ j+ " nums[j] "+j);
                    System.out.println("***** The three are" + a + " " + b + " " + c);

                }

               // map.put(a,count_a);
                // map.put(b,count_b);
                //map.put(c,count_c);
                System.out.println(map);

            }
        }
    }
}
