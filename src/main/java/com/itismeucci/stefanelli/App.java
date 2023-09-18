package com.itismeucci.stefanelli;

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        String[] colors = {"\u001B[32m", "\u001B[33m", "\u001B[31m"};
        int timer = 300;
        Random rand = new Random();

        while(true) {
            System.out.print( colors[timer >= 100 ? 0 : timer >= 30 ? 1 : 2] + "wa" );
            try {
                Thread.sleep(timer);
            } catch (InterruptedException e) {e.printStackTrace();}
            catch (IllegalArgumentException e) {System.out.println("\nBOOM"); return;}

            if (rand.nextBoolean())
                timer--;
            else if (rand.nextBoolean())
                timer++;
        }
    }
}
