package com.ss.assn.one;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 4, 2021
 *
 * Brief:
 *   Instantiates a set of Singleton instances { a, b, c }
 *   then prints their hash code to stdout
**/

import java.lang.Thread;

public class Main
{
    public static void main(String[] args)
    {
        // Instantiating Singleton classes
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
 
        s1.run();
        s2.run();

        System.out.println("First thread hash code: "  + s1.hashCode());
        System.out.println("Second thread hash code: " + s2.hashCode());
    }
}
