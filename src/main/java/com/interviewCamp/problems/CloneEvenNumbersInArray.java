package com.interviewCamp.problems;

import java.sql.SQLOutput;

public class CloneEvenNumbersInArray {
    public static void main(String[] args) {
        int[] nums = new int[10];

        nums = new int[]{1, 2, 5, 6, 8,-1,-1,-1,-1,-1};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        int[] res = cloneEvenNumber(nums);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }

    public static int[] cloneEvenNumber(int[] num) {
        if (num == null) {
            System.out.println("Input is null");
            //Logging  mesg and return a empty array
            return new int[]{};
        }

        int end = num.length;
        int last = findLastNumber(num);
        System.out.println(last);
        while (last >= 0) {
            if (num[last] % 2 == 0) {
                num[--end] = num[last];
            }
            num[--end] = num[last];
            last--;
        }

        return num;
    }
    public static int findLastNumber(int[] num) {
      for(int i  = num.length-1; i >= 0 ; i--) {
          if (num[i] == -1) continue;
          else return i;
      }
      return -1;
    }
}
