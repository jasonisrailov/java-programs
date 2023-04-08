/*
 Jason Israilov
 10/6/2017
 Program 1
 Mrs. Abel, 2nd hour
 */

import cs1.Keyboard;
public class Program1
{
  public static void main (String[] args)
  {
    int showerTime = 0;
    int numOfBottles = 0;
    int ozInWaterBottle = 16;
    System.out.println("How many minutes do you shower for?");
    showerTime = Keyboard.readInt();
    
    numOfBottles = ((192/ozInWaterBottle) * showerTime);
    
    System.out.println("By showering for a total of " + Math.abs(showerTime) + " minutes.... \nYou used " + (numOfBottles) + " bottles of water!!");
    System.out.println("Be mindful of how long you shower for and how much water you waste!");
    
    
  } // end of main method
} // end of Program1 class


