package com.ss.assn.one;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *     PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even
 *     PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite
 *     PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not
 *
**/

import java.util.Scanner;

public class Main
{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Number of inputs: ");
        int n = s.nextInt();

        while (n-- > 0)
        {
            int operation = s.nextInt();
            int number    = s.nextInt();
            System.out.println(Utils.PerformOperation(operation, number));
        }
        if (s != null)
        {
            s.close();
        }
    }
}
