package com.ss.assn.one;

/**
 * Author:   Malik R Booker
 * Created:  November 5, 2021
 * Modified: November 5, 2021
 *
 * Brief:
 *   Creates two line classes and compares the slopes as well as calculates
 *   the distance between the two lines.
**/

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Initialize array list;
        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add("A");
        strArray.add("list");
        strArray.add("of");
        strArray.add("varying");
        strArray.add("string");
        strArray.add("sizes");

        // Original for reference
        System.out.println("Original array:");
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by length
        System.out.println("Sorted by length:");
        strArray.sort((a, b) -> (a.length() < b.length() ? -1 : (a.length() > b.length() ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by reversed length
        System.out.println("Sorted by reversed length:");
        strArray.sort((a, b) -> (a.length() > b.length() ? -1 : (a.length() < b.length() ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Alphabetically by the first character only
        System.out.println("Sorted by first character:");
        strArray.sort((a, b) -> (a.charAt(0) < b.charAt(0) ? -1 : (a.charAt(0) > b.charAt(0) ? 1 : 0)));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Sorted by presence of 'e', then alphabetically sorted
        System.out.println("Sorted by presence of 'e', then first character:");
        strArray.sort((a, b) -> 
        {
            if ((a.indexOf('e') >= 0) && !(b.indexOf('e') >= 0))
            {
                return -1;
            }
            else if (!(a.indexOf('e') >= 0) && (b.indexOf('e') >= 0))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        // Alphabetically by the first character only but with my own comparator
        System.out.println("Sorted by presence of 'e', then first character");
        System.out.println("using my own user-defined static method:");
        strArray.sort((a, b) -> Utils.sort(a, b));
        for (String a : strArray)
        {
            System.out.println(a);
        }
        System.out.println("");

        System.out.println("Formatted array using Java 8 features:");
        List<Integer> arr = new ArrayList<Integer>(); // { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 10, 2 };
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(11);
        arr.add(10);
        arr.add(2);
        System.out.println(Utils.intArrToString(arr));
        System.out.println("");

        List<String> arrOfStrings = new ArrayList<String>();
        arrOfStrings.add("Never");
        arrOfStrings.add("gonna");
        arrOfStrings.add("give");
        arrOfStrings.add("you");
        arrOfStrings.add("up");
        arrOfStrings.add("Never");
        arrOfStrings.add("gonna");
        arrOfStrings.add("let");
        arrOfStrings.add("you");
        arrOfStrings.add("down");
        arrOfStrings.add("Never");
        arrOfStrings.add("gonna");
        arrOfStrings.add("turn");
        arrOfStrings.add("around");
        arrOfStrings.add("and");
        arrOfStrings.add("desert");
        arrOfStrings.add("you");

        System.out.println("Parse list of strings and return letters that start with 'a'");
        System.out.println("and have exactly 3 letters:");
        Utils.parseSpecialStrFormat(arrOfStrings).forEach(System.out::println);
        System.out.println("");
    }
}
