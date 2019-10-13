package com.trackr.codilityPrograms.lyndaJavaEssential;

import java.util.Scanner;

/**
 * Created by deepti on 3/14/18.
 */
public class HelloWorldReadFromUser {
    public static void main(String args[]) {
        int n = 0;
        System.out.println("Hello, world");

        System.out.println("String sent to the program are ");
        for(String s:args) {
            System.out.println(s.toString());
        }

        try {
               n = Integer.parseInt(args[0]);
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("You entered - "+n);
        readInputFromUser();



    }
    public static void readInputFromUser() {
        System.out.println("Pls enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Your name is : " +name
        );
    }
}
