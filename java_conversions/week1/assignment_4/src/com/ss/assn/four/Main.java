package com.ss.assn.four;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *    Given a list of strings, return a list where all 'x's are removed
**/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        List<String> arr = getUserInput();

        System.out.println("Original:");
        arr.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("With x's Removed:");
        Utils.removeAllX(arr).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
    }

    public static List<String> getUserInput()
    {
        int length = 0;
        List<String> res = new ArrayList<String>();
        
        System.out.print("Length of array: ");
        try
        {
            length = Integer.parseInt(s.nextLine());
        }
        catch (NumberFormatException ne)
        {
            System.err.println("Input is not a properly formatted number.");
            s.close();
            throw ne; // rethrow the exception
        }

        System.out.print("Strings in array: ");
        while (length-- != 0)
        {
            try
            {
                String x = s.next();
                res.add(x);
            }
            catch (Exception e)
            {
                System.err.println("Input is not a properly formatted string.");
                s.close();
                throw e; // rethrow the exception
            }
        }

        return res;
    }
}
