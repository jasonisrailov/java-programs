/*
Counter3.java
Demonstrates the use of a for loop.
Page 157 in AP Java book. This is called Counter2 in the AP book and Counter3 in the ONLINE book.
*/

public class Counter3
{
    // Prints integer values from 1 to a specific limit.

    public static void main (String[] args)
    {
        final int LIMIT = 5;
        //count variable is initialized in the first part of the header of the for loop.

        for(int count=1; count <= LIMIT; count++)
            System.out.println(count);

        System.out.println("Done");
    } // end of main method
} // End of class
