/*
Counter.java
Demonstrates the use of a while loop.
Page 143 in AP Java book.
*/

public class Counter
{
    // Prints integer values from 1 to a specific limit.
    public static void main (String[] args)
    {
        final int LIMIT = 5;
        int count = 1;

        while(count <= LIMIT)
        {
            System.out.println(count);
            count = count + 1;
        }
        System.out.println("Done");
    } // end of main method
} // End of class
