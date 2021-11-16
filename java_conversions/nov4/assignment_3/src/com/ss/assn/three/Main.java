package com.ss.assn.three;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 5, 2021
 *
 * Brief:
 *   Creates a process with one thread (the producer) that produces items  
 *   and another thread (the consumer) consumes items.
**/

public class Main
{
    public static void main(String[] args)
    {
        // Initialize int array for shared use
        Integer[] inventory = new Integer[]{ 4, 4, 4 };

        // Initialize produces and consumers
        Producer prod1 = new Producer(0, 10000, inventory);
        Producer prod2 = new Producer(1, 7500, inventory);
        Producer prod3 = new Producer(2, 5000, inventory);
        Consumer cons1 = new Consumer(0, 2000, inventory);
        Consumer cons2 = new Consumer(1, 3000, inventory);
        Consumer cons3 = new Consumer(2, 4000, inventory);

        // Begin the chaos
        prod1.start();
        prod2.start();
        prod3.start();
        cons1.start();
        cons2.start();
        cons3.start();
    }
}
