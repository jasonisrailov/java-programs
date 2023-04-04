/*
PalindromeTester.java
Demonstrates the use of nested while loops.
Page 151 in AP Java book.
*/

import cs1.Keyboard;

public class PalindromeTester
{
    // Tests strings to see if they are palindromes.
    public static void main (String[] args)
    {
        String str, another = "y";
        int left, right;

        while(another.equalsIgnoreCase("y")) // allows y or Y
        { // this loop controls how many string are tested.
            System.out.println("Enter a potential palindrome:");
            str = Keyboard.readString();

            left = 0;
            right = str.length() - 1;
            
            while(str.charAt(left) == str.charAt(right) && left < right) 
            { // this loop scans through each string, character by character, until it determines whether a string is a palindrome.
                left++;
                right--;
            } // end of inner while loop

            System.out.println();

            if(left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string IS a palindrome.");

            System.out.println();
            System.out.println("Test another palindrome (y/n)? ");
            another = Keyboard.readString();

        } // end of outer while loop
    } // end of main method
} // End of class
