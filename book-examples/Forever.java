/*
Forever.java
Demonstrates an INFINATE LOOP. WARNING!!
Page 148 in AP Java book.
*/

public class Forever
{
    // Print ever-decreasing integers in an INFINATE LOOP!
    public static void main (String[] args)
    {
        int count = 1;

        while(count <= 25)
        {
            System.out.println(count);
            count = count - 1;
        } // end of while loop

        System.out.println("Done"); // this statement is never reached
    } // end of main method
} // End of class
