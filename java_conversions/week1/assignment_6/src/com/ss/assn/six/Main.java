package com.ss.assn.six;

/**
 * Author:   Malik R Booker
 * Created:  November 7, 2021
 * Modified: November 7, 2021
 *
 * Brief:
 *    Given a list of integers, return a list where each integer is multiplied by 2.
**/

import java.sql.Connection;

public class Main
{
    static Connection conn = null;

    public static void main(String[] args)
    {
        System.out.println("Getting Connection...");
        conn = Singleton.getInstance().getConnection();

        System.out.println("Connection " + (conn != null ? "" : "not") + " made!");

    }
}
