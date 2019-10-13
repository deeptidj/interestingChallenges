package com.trackr.codilityPrograms.lyndaJavaEssential;

import java.math.BigDecimal;

/**
 * Created by deepti on 3/15/18.
 */
public class DefaultsPrimitiveDataTypes {
    public static void main(String[] args) {
        int myInt =1;
        System.out.println(myInt);

        byte b = 127;
        short s = 1;
        int i = 1;
        long l = 1L; //upper care fo it is not confused with 1.
        float f = 1f;
        double d = 1d;
        System.out.println("Byte "+b);
        if (b < Byte.MAX_VALUE) b++;
        System.out.println("Byte "+b);
        System.out.println("short "+s);
        System.out.println("Int "+i);
        System.out.println("Long "+l);
        System.out.println("Float "+f);
        System.out.println("Double "+d);

        double val = .012;
        double pSum = val + val + val;
        System.out.println("pSum "+pSum);

        String strValue = Double.toString(val);
        System.out.println("Str Value "+strValue);

        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue).add(bigValue);
        System.out.println(" bSum "+bSum.toString());

        //Non-Compatible
        int intVal = 1024;
        byte bVal = (byte) intVal;
        System.out.println("Converted value from int to byte "+bVal);

        //Compatible
        int intVal1 = 1024;
        short sVal = (short) intVal;
        System.out.println("Converted value from int to byte "+sVal);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
