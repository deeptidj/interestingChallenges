package com.trackr.codilityPrograms.java;

/**
 * Created by deepti on 3/9/20.
 */
public class ExceptionExample {
    public static void main(String[] args) throws Exception{
        try {
            ex();
            System.out.println("In main ");
        }
        catch (Exception ex) {
            System.out.println("Exception Handling "+ex.getMessage());
            System.out.println("Exception Handling "+ex.getStackTrace().toString());
        }

    }
    private static void ex() throws Exception {

            throw new Exception("Throwing Exception");

    }
}
