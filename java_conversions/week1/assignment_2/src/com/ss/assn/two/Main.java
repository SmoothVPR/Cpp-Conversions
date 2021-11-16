package com.ss.assn.two;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *    Given a list of non-negative integers, return an integer list of the rightmost digits
**/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        List<Integer> arr = getUserInput();

        System.out.println("Original:");
        arr.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        System.out.println("Right most digits:");
        Utils.getRightMostDigits(arr).forEach(x -> System.out.print(x + " "));
        System.out.println("\n");

        if (s != null)
        {
            s.close();
        }
    }

    public static List<Integer> getUserInput()
    {
        int length = 0;
        List<Integer> res = new ArrayList<Integer>();
        
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

        return res;
    }
}
