package com.ss.assn.two;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 3, 2021
 *
 * Brief:
 *   Creates a deadlock between two threads
 *   reference: https://www.java2novice.com/java-interview-programs/thread-deadlock/
**/

public class Main
{
    // Global variables
    public  String a = "69";
    public  String b = "420";
    public  Boolean isRunning = true;

    Thread firstThread = new Thread("firstThread")
    {
        @Override
        public void run()
        {
            while (isRunning)
            {
                synchronized (a)
                {
                    synchronized (b)
                    {
                        System.out.println("a concat b -> " + a + b);
                    }
                }
            }
        }
    };

    Thread secondThread = new Thread("secondThread")
    {
        @Override
        public void run()
        {
            while (isRunning)
            {
                synchronized (b)
                {
                    synchronized (a)
                    {
                        System.out.println("b concat a -> " + b + a);
                    }
                }
            }
        }
    };

    public static void main(String[] args)
    {
        // Create a deadlock between two threads
        Main obj = new Main();

        // If successful, the program should halt
        // after the second thread sets 'isRunning' to false
        obj.firstThread.start();
        obj.secondThread.start();

        try
        {
            obj.firstThread.join();
            obj.secondThread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("This line should never be reached");
    }
}
