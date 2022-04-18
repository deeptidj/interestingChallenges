package com.trackr.codilityPrograms.java;

/**
 * Created by deepti on 3/9/20.
 */
public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        try {
            //method2();
            method1();
            //ex();
            System.out.println("In main ");
        } finally {
            System.out.println("Finally here");
        }
//        catch (Exception ex) {
//            System.out.println("Exception Handling "+ex.getMessage());
//            System.out.println("Exception Handling "+ex.getStackTrace().toString());
//        }
        System.out.println("See what prints this after the finally block");

    }
    private static void ex() throws Exception {

            throw new Exception("Throwing Exception");

    }
    //Try catch method within the method itself.
    public static void method1(){
        try {
            throw new Exception("Some user exception");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Remainder code in the method1 after an exception occurs");

    }
    public static void method2() throws Exception {
        throw new Exception("User exception from method 2");
    }
}
