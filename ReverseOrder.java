/*
ReverseOrder.java
Demonstrates array index processing.
Page 302 in AP Java book. Listing 6.2.
*/

import cs1.Keyboard;

public class ReverseOrder
{
    // Reads a list of numbers from the user, storing them in an
    //  array, then prints them in the opposite order.

    public static void main (String[] args)
    {
        double[] numbers = new double[10];

        System.out.println ("The size of the array: " + numbers.length);

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.print("Enter the number " + (index + 1) + ": ");
            numbers[index] = Keyboard.readDouble();
        } // end of for loop

        System.out.println ("The number in reverse order:");

        for (int index = numbers.length - 1; index >= 0; index--)
            System.out.print(numbers[index] + " ");

        System.out.println();
    } // end of main method
} // End of class
