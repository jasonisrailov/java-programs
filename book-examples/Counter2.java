/*
Counter2.java
Demonstrates the use of a do loop.
Page 175 in ONLINE AP Java book.
*/

public class Counter2
{
    // Prints integer values from 1 to a specific limit.

    public static void main (String[] args)
    {
        final int LIMIT = 5;
        int count = 0;

        do
        {
            count = count + 1;
            System.out.println(count);
        }
        while(count < LIMIT);

        System.out.println("Done");
    } // end of main method
} // End of class
