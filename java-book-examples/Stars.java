/*
Stars.java
Demonstrates the use of nested for loops.
Page 161 in AP Java book.
*/

public class Stars
{
    //  Prints a triangle shape using asterisk (star) characters.

    public static void main (String[] args)
    {
        final int MAX_ROWS = 3;

        for(int row = 1; row <= MAX_ROWS; row++)
        {
            for(int star = 1; star <= row; star++)
                System.out.print ("*");

            System.out.println();
        } // end of outter for loop
    } // end of main method
} // End of class
