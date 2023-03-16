/*
ReverseNumber.java
Demonstrates the use of a do loop.
Page 176 in ONLINE AP Java book.
*/

import cs1.Keyboard;

public class ReverseNumber
{
    // Reverses the digits of an integer mathematically.

    public static void main (String[] args)
    {
        int number, lastDigit, reverse = 0;

        System.out.print ("Enter a positive integer: ");
        number = Keyboard.readInt(); // Example: I enterd 234

        do
        {
            lastDigit = number % 10; // (1.) 234 % 10 = 4; (2.) 23 % 10 = 3; (3.) 2 % 10 = 0.2
            reverse = (reverse * 10) + lastDigit; // (1.) 0 + 4 = 4; (2.) 40 + 3 = 43;  (3.) 430 + 2 = 432
            number = number / 10; // (1.) 234 / 10 = 23 (2.) 23 / 10 = 2;  (3.) 2/10 = .02
        }
        while(number > 0); // 0.2 > 0 is false, terminates do statement

        System.out.print ("That number reversed is " + reverse);
    } // end of main method
} // End of class
