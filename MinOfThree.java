/*
MinOfThree.java
Demonstrates the use of nested if statements.
Page 134 in AP Java book.
*/

import cs1.Keyboard;

public class MinOfThree
{
    // Reads three integers from the user and determines the smallest value.
    public static void main (String[] args)
    {
        int num1, num2, num3, min = 0;

        System.out.println("Enter three integers: ");
        num1 = Keyboard.readInt();
        num2 = Keyboard.readInt();
        num3 = Keyboard.readInt();

        if(num1 < num2) // if this is true, it goes to the next if statement
            if(num1 < num3) // This is a nested if statement, if this is true, then the program goes out of the if statment
                min = num1;
            else  // else statement is always matched to the closest unmatched if statment that came before it.
                min = num3;
        else  // else statement is always matched to the closest unmatched if statment that came before it.
            if(num2 < num3)
                min = num2;
            else  // else statement is always matched to the closest unmatched if statment that came before it.
                min = num3;

        System.out.println("Minimum value: " + min);
    } // end of main method
} // End of class
