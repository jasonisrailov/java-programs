/*
Jason Israilov
11/26/16
3rd Hour, Mrs. Abel
Bookwork S/A 4.1 - 4.18, 4.20 - 4.21
*/

import java.io.*;
import java.util.*;

public class Chap4SA
{
    int x = 200;
    double sum = 0;
    public Chap4SA ()
    {
        this.sum = 0.0;
    }
    public Chap4SA (double d)
    {
        this.sum = d;
    }

    public static void main (String[] args)
    {
        Chap4SA c4 = new Chap4SA();
        int x = 10;
        double d = c4.translate(x);
        System.out.println("The return value of translate: " + d);
        System.out.println("Print the value of x: " + x);
        System.out.println("Print the value of x: " + c4.x);
        int i  = c4.find("Hello",10.2);
        System.out.println("Print the value of i: " + i);

        System.out.println("Print the value od sum: " + c4.sum);
        c4.printAnswer(10.5,11.2,12.7);
        System.out.println("Print the value of sum: " + c4.sum);

        Chap4SA c41 = new Chap4SA(10.0);
        System.out.println("Print the value od sum: " + c41.sum);
        c41.printAnswer(10.5,11.2,12.7);
        System.out.println("Print the value of sum: " + c41.sum);

        // # 4.4 -- refer below
        String s = c4.welcomMessage("Jason", 24);
        System.out.println(s);

        // # 4.5 -- refer below
        c4.powersOfTwo();

        // # 4.6 -- refer below
        c4.alarm(5);

        // # 4.7 -- refer below (this calls the method)
        int sum = c4.sum100();
        System.out.println(sum);

        // # 4.8 -- refer below (this calls the method)
        int max = c4.maxOfTwo(10,10);
        System.out.println(max);


    }

    //S/A pg. 241 # 4.1
    public double translate(int x)
    {
        double d = 10;
        return d;
    }

    //S/A pg. 241 # 4.2
    public int find(String s, double d)
    {
        int i = 10;
        return i;
    }

    //S/A pg. 241 # 4.3
    public void printAnswer(double d1, double d2, double d3)
    {
        this.sum = this.sum + d1 + d2 + d3;
    }

    //S/A pg. 241 # 4.4
    public String welcomMessage(String name, int visitorNum)
    {
        return "Welcome " + name + "! You  are visitor number " + visitorNum + ".";
    }

    //S/A pg. 241 # 4.5
    public void powersOfTwo()
    {
        int base = 2;
        for(int i = 1; i <= 10;  i++)
        {
            double num = java.lang.Math.pow(base, i);
            System.out.println("The 2 powers are base: " + base + " and Power " + i + " this gives Number : " +  num);
        }
    }

    //S/A pg. 241 # 4.6
    public boolean alarm(int i)
    {
        if(i<1)
        {
            System.out.println("Error number of alarms is less than 1");
            return false;
        }

        for(int j = 0; j <= i; j++)
            System.out.println("alarm");
         return true;
    }

    //S/A pg. 241 # 4.7
    public int sum100()
    {
        int sum = 0;
        for(int i=0; i<=100; i++)
            sum = sum + i;
        return sum;
    }

    //S/A pg. 241 # 4.8
    public int maxOfTwo(int n1, int n2)
    {
        if(n1 > n2)
            return n1;
        else if (n1 < n2)
            return n2;
        else if (n1 == n2)
            return n1;
        else
            return n1;
    }

    public int sumRange(int n1, int n2)
    {
        n1 = 50;
        n2 = 75;

    }
} // End of Class
