package com.trackr.codilityPrograms.java.lists;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by deepti on 9/21/19.
 */
public class ArrayListsBasics {
    public static void main(String[] args) {

        System.out.println("Basics of Java");

        ArrayList<String> sList = new ArrayList<>();
        sList.add("Deepti1");
        sList.add("Deepti2");
        sList.add("Deepti3");
        sList.add("Deepti4");

        System.out.println(sList);

        //Create an ArrayList of String and print them
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Deepti");
        listOfStrings.add("Deepansh");
        listOfStrings.add("Deepesh");
        for(String s : listOfStrings) {
            System.out.println(s);
        }
        //Can print with the sout and it will handle printing it.
        System.out.println(listOfStrings);

        //Removing a string that does not exist in the ArrayList
        if (listOfStrings.remove("DeeptiDoesNotExists")) {
            System.out.println("Successfully removed the string 'DeeptiDoesNotExists' ");
        } else {
            System.out.println("Failure to remove the string 'DeeptiDoesNotExists' ");
        }

        System.out.println("Printing listOfStrings");
        System.out.println(listOfStrings);

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

        for (String s :listOfStrings) {
            if(s == "Deepti") {
                System.out.println("Deepti is in the listOfStrings " + listOfStrings);
            }
        }

        //Creating a new ArrayList from an array

        ArrayList<String> listOfStringsFromArray = new ArrayList<>(Arrays.asList("FromArray1", "FromArray2", "FromArray3"));
        System.out.println("List of String from Array = "+listOfStringsFromArray);

        ArrayList<String> obj = new ArrayList<>(
                Arrays.asList("Pratap", "Peter", "Harsh"));
        System.out.println("Elements are:"+obj);

        Iterator ite = obj.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next()+" ; ");
        }

        ArrayList<String> cities = new ArrayList<>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
            add("Chennai2");
            add("Chennai3");
            add("Chennai4");
        }};
        System.out.println("Content of Array list cities:"+cities);
        ArrayList<String> al2 = new ArrayList<>(cities.subList(1,5));
        System.out.println(al2);


        ArrayList<Integer> intlist = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("ArrayList items: "+intlist);


        //LOOPING
        Iterator it = intlist.iterator();
        while(it.hasNext()){
            System.out.println("Iterator :"+it.next());
        }


        ArrayList<String> arrayList = new ArrayList<String>(Collections.nCopies(10, "Deepti Jain, you can do it !"));

        // Get the Enumeration object
        Enumeration<String> e = Collections.enumeration(arrayList);

        // Enumerate through the ArrayList elements
        System.out.println("ArrayList elements: Iterating through enumeration :s");
        while(e.hasMoreElements()) System.out.println(e.nextElement());

        listOfStrings.addAll(listOfStringsFromArray);
        listOfStrings.add("zzz");

        Iterator iterator = listOfStrings.iterator();
        while(iterator.hasNext()) System.out.println("First time = "+iterator.next());

        Collections.sort(listOfStrings);
        iterator = listOfStrings.iterator();
        while(iterator.hasNext()) System.out.println("Second time = "+iterator.next());

        Collections.reverse(listOfStrings);
        iterator = listOfStrings.iterator();
        while(iterator.hasNext()) System.out.println("Third time "+iterator.next());

    }

    //Sorting
       /* Sort statement*/
       //Deep
//	   Collections.sort(arrayList);
//	   Collections.reverse(arrayList);


}
