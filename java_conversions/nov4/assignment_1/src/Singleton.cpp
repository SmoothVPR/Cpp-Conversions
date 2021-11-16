package com.ss.assn.one;

public class Singleton implements Runnable
{
    private static Singleton single_instance = null;
 
    // Private constructor emphasizes Singleton nature
    private Singleton()
    {
        System.out.println("New Singleton created.");
    }
 
    public static Singleton getInstance()
    {
        // First check
        if (single_instance == null)
        {
            synchronized (Singleton.class)
            {
                // Second check
                if (single_instance == null)
                {
                    single_instance = new Singleton();
                }
            }
        }
 
        return single_instance;
    }

    @Override
    public void run()
    {
        while (true)
        {
            // Do nothing
        }
    }
}
