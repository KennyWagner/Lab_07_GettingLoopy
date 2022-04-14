package com.company;

import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double fTemp;
        double cTemp = 0;
        boolean incorrect = true;

        System.out.println("Enter a temperature in Celsius: ");
        if (console.hasNextDouble())
        {
            cTemp = console.nextDouble();
            incorrect = false;
        }
        while (incorrect)
        {
            System.out.println("invalid input please enter a number. ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble())
            {
                cTemp = in.nextDouble();
                incorrect = false;
            }
        }


        fTemp = (cTemp * 9 / 5 + 32);
        System.out.println(cTemp + " degrees celsius is " + fTemp + " degrees fahrenheit");
        if (fTemp >= 212) {
            System.out.println("At this temperature water is boiling.");
        } else if (fTemp <= 32) {
            System.out.println("At this temperature water is freezing.");
        } else {
            System.out.println("At this temperature water is liquid.");
        }

    }
}
