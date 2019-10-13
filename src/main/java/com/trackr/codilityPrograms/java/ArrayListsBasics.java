package com.trackr.codilityPrograms.java;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by deepti on 9/21/19.
 */
public class ArrayListsBasics {
    public static void main(String[] args) {
        System.out.println("Basics of Java");

        ArrayList<String> sList = new ArrayList<String>();
        sList.add("Deepti1");
        sList.add("Deepti2");
        sList.add("Deepti3");
        sList.add("Deepti4");

        System.out.println(sList);

        sList.remove("Deepti1");
        System.out.println(sList);

        sList.remove(0);
        System.out.println(sList);
        sList.add("Deepti1");
        System.out.println(sList);
        sList.add(0,"Deepti0");
        System.out.println(sList);

        for (String s:sList){
            if(s.equals("Deepti1")) {
                System.out.println("Found Deepti1");
            }
        }

        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("Pratap", "Peter", "Harsh"));
        System.out.println("Elements are:"+obj);


        ArrayList<String> cities = new ArrayList<String>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
            add("Chennai2");
            add("Chennai3");
            add("Chennai4");
        }};
        System.out.println("Content of Array list cities:"+cities);
        ArrayList<String> al2 = new ArrayList<String>(cities.subList(1,5));
        System.out.println(al2);


        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("ArrayList items: "+intlist);


        //LOOPING
        Iterator it = intlist.iterator();
        while(it.hasNext()){
            System.out.println("ITrator :"+it.next());
        }


        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Deepti1");
        arrayList.add("Deepti2");
        arrayList.add("Deepti3");
        arrayList.add("Deepti4");
        arrayList.add("Deepti11");
        arrayList.add("Deepti12");
        arrayList.add("Deepti13");
        arrayList.add("Deepti14");
        // Get the Enumeration object
        Enumeration<String> e = Collections.enumeration(arrayList);

        // Enumerate through the ArrayList elements
        System.out.println("ArrayList elements: Iterating through enumeration :s");
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
    }




    //Sorting
       /* Sort statement*/
       //Deep
//	   Collections.sort(arrayList);
//	   Collections.reverse(arrayList);

}
