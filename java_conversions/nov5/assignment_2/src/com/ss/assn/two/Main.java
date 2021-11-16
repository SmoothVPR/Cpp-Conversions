package com.ss.assn.two;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *  Demonstrates ability to use DateTime objects effectively
**/

import java.time.Year;
import java.time.Month;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Number of days per month of given year
        int yyyy = getUserInputYear();
        System.out.println("Days in the months of " + yyyy + ":");
        Utils.getYearMonths(yyyy).forEach((month, n_days) ->
        {
            System.out.println(month +
                               ((month + ":").length() < 8 ? ":\t\t" : ":\t") +
                               n_days + " days");
        });
        System.out.println("");

        // Dates of each Monday in given month
        int mm = getUserInputMonth();
        System.out.println("Dates of each Monday for the month of " + Month.of(mm).name());
        Utils.getMondaysOfMonth(mm).forEach(System.out::println);
        System.out.println("");

        // Spooky Date Algorithm
        LocalDate spookyDate = getUserInputSpookyDate();
        System.out.println("Day falls on Friday the 13th?");
        System.out.println(Utils.isSpooky(spookyDate) ? "True" : "False");

        if (sc != null)
        {
            sc.close();
        }
    }

    public static int getUserInputYear()
    {
        int yyyy = 0;

        System.out.print("Enter a year (int): ");
	try
        {
            yyyy = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException ne)
        {
            System.err.println("Input is not a properly formatted number.");
            sc.close();
            throw ne; // rethrow the exception
        }

        try
        {
            Year test = Year.of(yyyy);
            test.length(); // remove unused variable warning
        } 
        catch (DateTimeException e)
        {
            System.err.println("Input is not a valid year.");
            sc.close();
            throw e; // rethrow the exception
        }

        return yyyy;
    }

    public static int getUserInputMonth()
    {
        Month mm;

        System.out.print("Enter a month (name): ");
	try
        {
            mm = Month.valueOf(sc.nextLine().toUpperCase());
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Input is not a valid month.");
            sc.close();
            throw e; // rethrow the exception
        }

        return mm.getValue();
    }

    public static LocalDate getUserInputSpookyDate()
    {
        Month mm;

        System.out.print("Enter a month (name): ");
	try
        {
            mm = Month.valueOf(sc.nextLine().toUpperCase());
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Input is not a valid month.");
            sc.close();
            throw e; // rethrow the exception
        }

        int day;

        System.out.print("Enter a day (int): ");
        try
        {
            LocalDate date = Year.now().atMonth(mm).atDay(sc.nextInt());
            day = date.getDayOfMonth();
        }
        catch (DateTimeException e)
        {
            System.err.println("Input is not a valid day.");
            throw e; // rethrow the exception
        }

        LocalDate spookyDate = Year.now().atMonth(mm).atDay(day);
        return spookyDate;
    }
}
