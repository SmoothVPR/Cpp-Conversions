package com.ss.assn.three;

public class Consumer extends Thread
{
    private int index;
    private int rate_ms;
    private Integer[] inventory;

    public Consumer(int index, int rate_ms, Integer[] inventory)
    {
        this.index     = index;
        this.rate_ms   = rate_ms;
        this.inventory = inventory;
    }

    private void consume()
    {
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                System.out.println("Attempting to buy item in slot: " + index + "...");
                sleep(rate_ms);
                if (inventory[index] > 0)
                {
                    inventory[index]--;
                    System.out.println("Item in slot: " + index + " bought!");
                }
                else
                {
                    System.out.println("Item in slot: " + index + " currently out of stock :(");
                }
            }
        }
        catch (InterruptedException e)
        {
        }
    }
}
