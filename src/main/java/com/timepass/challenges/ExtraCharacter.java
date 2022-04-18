package com.timepass.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by deepti on 1/16/20.
 */
public class ExtraCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1");
        String s1 = sc.nextLine();
        System.out.println("Enter s2");
        String s2 = sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);

        HashMap<Character, Integer> h = new HashMap<Character, Integer>();


        Character c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            h.put(c, h.getOrDefault(c,0)+1);

        }

        for (int i = 0; i < s2.length(); i++) {
            c = s2.charAt(i);
            if (!h.containsKey(c)) h.put(c, 1);
            else h.put(c, h.get(c) - 1);
        }

        for (Map.Entry<Character, Integer> entry :
                h.entrySet()) {
            if (entry.getValue() > 0) System.out.println(entry.getKey());
        }

        //System.out.println(h);


    }
}
