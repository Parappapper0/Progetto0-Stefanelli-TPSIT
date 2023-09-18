package com.itismeucci.stefanelli;

import java.io.IOException;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        String[] colors = {"\u001B[32m", "\u001B[33m", "\u001B[31m"};
        int timer = 300;
        Random rand = new Random();

        cls();
        System.out.println("\033[1;35mWAWAWA PARTICLE ACCELERATOR\n");
        
        while(true) {
            System.out.print( colors[timer >= 100 ? 0 : timer >= 30 ? 1 : 2] + "wa" );
            try {
                Thread.sleep(timer);
            } catch (InterruptedException e) {e.printStackTrace();}
            catch (IllegalArgumentException e) {System.out.println("\n\033[1;31mBOOM"); return;}

            if (rand.nextBoolean())
                timer--;
            else if (rand.nextBoolean())
                timer++;
        }
    }

    public static void cls() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else {
            System.out.print("\033\143");
        }
    } catch (IOException | InterruptedException ex) {}
}
}
