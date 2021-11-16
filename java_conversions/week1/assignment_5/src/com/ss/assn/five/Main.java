package com.ss.assn.five;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *    Given an array of ints, is it possible to choose a group of some of the ints,  
 *    such that the group sums to the given target, with this additional constraint:  
 *       if there are numbers in the array that are adjacent and the identical value,  
 *       they must either all be chosen, or none of them chosen
**/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class UserInput
{
    int start  = 0;
    int target = 0;
}

public class Main
{
    static Scanner s = new Scanner(System.in);
    static UserInput userInput = new UserInput();

    public static void main(String[] args)
    {
        List<Integer> arr = getUserInput();

        System.out.println("Original:");
        arr.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.print("Group clump sum possible: ");
        System.out.println((Utils.groupClumpSum(userInput.start, arr, userInput.target) ? "True" : "False"));
        System.out.println("\n");

        if (s != null)
        {
            s.close();
        }
    }

    public static List<Integer> getUserInput()
    {
        List<Integer> res = new ArrayList<Integer>();

        System.out.print("starting index: ");
        try
        {
            userInput.start = Integer.parseInt(s.nextLine());
        }
        catch (NumberFormatException ne)
        {
            System.err.println("Input is not a properly formatted number.");
            s.close();
            throw ne; // rethrow the exception
        }

        int length = 0;
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

        System.out.print("Numbers in array: ");
        int x = 0;
        while (length-- != 0)
        {
            try
            {
                x = Integer.parseInt(s.next());
            }
            catch (NumberFormatException ne)
            {
                System.err.println("Input is not a properly formatted number.");
                s.close();
                throw ne; // rethrow the exception
            }

            res.add(x);
        }

        System.out.print("target sum: ");
        try
        {
            userInput.target = s.nextInt();
        }
        catch (NumberFormatException ne)
        {
            System.err.println("Input is not a properly formatted number.");
            s.close();
            throw ne; // rethrow the exception
        }

        return res;
    }
}
