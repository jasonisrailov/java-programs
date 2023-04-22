/*
 * Trace.java
 * Prelab Excercises
 * Sections 2.3-2.4
 * 10/4/2017
 * PURPOSE: 
 */

import cs1.Keyboard;
public class Trace
{
  public static void main (String[] args)
  {
    int one, two, three;
    double what;
    
    System.out.print("Enter two integers: ");
    one = Keyboard.readInt();
    two = Keyboard.readInt();
    
    System.out.print("Enter a floating point number: ");
    what = Keyboard.readDouble();
    
    three = 4 * one + 5 * two;
    two = 2 * one;
    System.out.println("one " + two + ":" + three);
    
    one = 46 / 5 * 2 + 19 % 4;
    three = one + two;
    what = (what + 2.5) / 2;
    System.out.println(what + " is what!");
    
  } // end of main
} // end of class