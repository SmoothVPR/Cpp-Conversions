package com.ss.assn.three;

public class Producer extends Thread
{
    private int index;
    private int rate_ms;
    private Integer[] inventory;

    public Producer(int index, int rate_ms, Integer[] inventory)
    {
        this.index     = index;
        this.rate_ms   = rate_ms;
        this.inventory = inventory;
    }

    private void produce()
    {
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println("Generating item in slot: " + index + "...");
                sleep(rate_ms);
                if (inventory[index] < 5)
                {
                    inventory[index]++;
                    System.out.println("Item in slot: " + index + " generated!");
                }
            }
        }
        catch (InterruptedException e)
        {
        }
    }
}
