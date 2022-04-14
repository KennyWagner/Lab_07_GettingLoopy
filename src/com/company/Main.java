package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //from 0 to 30
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);
        }
        System.out.println();

        //from 30 to 0
        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);
        }
        System.out.println();

        // from 0 to 18 by 3
        for (int i = 0; i <= 18; i += 3)
        {
            System.out.println(i);
        }
        System.out.println();

        // from 10 to 0 by 2
        for (int i = 10; i >= 0; i -= 2)
        {
            System.out.println(i);
        }
        System.out.println();

        //more stars per line
        for (int i = 0; i <= 4; i++)
        {
            for (int x = 0; x <= i; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        //fewer stars per line
        for (int i = 4; i >= 0; i--)
        {
            for (int x = 0; i >= x; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        //Same number of stars per line
        for (int i = 0; i <= 5; i++)
        {
            for (int x = 0; x <= 5; x++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
    }
}
