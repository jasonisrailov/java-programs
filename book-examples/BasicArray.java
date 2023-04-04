/*
BasicArray.java
Demonstrates basic array declaration and use.
Page 300 in AP Java book.  Listing 6.1.
*/

public class BasicArray
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;

    // Creates an array, fills it with various integer values,
    // modifies one value,, then prints them out.
    
    public static void main (String[] args)
    {
        int[] list = new int[LIMIT]; // this array can hold 15 integers

        //Initialize the array values
        for(int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;

        list[5] = 999; // changes 6th value in the array at index 5

        for(int index = 0; index < LIMIT; index++)
            System.out.print(list[index] + " "); // prints all stored values in the array

        System.out.println();
    } // end of main method
} // End of class
