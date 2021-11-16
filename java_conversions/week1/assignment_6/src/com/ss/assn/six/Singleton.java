package com.ss.assn.six;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton
{
    private static Singleton instance = null;
    private static Connection conn = null;

    public static Singleton getInstance()
    {
        // First check
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                // Second check
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
 
        return instance;
    }

    public Connection getConnection()
    {
        // First check
        if (conn == null)
        {
            synchronized (Singleton.class)
            {
                // Second check
                if (conn == null)
                {
                    try
                    {
                        String host     = "jdbc:derby://localhost:1527/dbname";
                        String username = "username";
                        String password = "password";
                        conn = DriverManager.getConnection(host, username, password);
                    }
                    catch (SQLException sqle)
                    {
                        sqle.printStackTrace();
                        System.err.println("SQL database connection could not be made.");
                    }
                }
            }
        }

        return conn;
    }
}
