/*
Primes.java
Demonstrates the use of an initializer list for an array.
Page 308 in AP Java book. Listing 6.4.
*/

public class Primes
{
    // Stores some prime numbers in an array and prints them.

    public static void main (String[] args)
    {
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};

        System.out.println ("Array length: " + primeNums.length);

        System.out.println ("The first few prime numbers are:");

        for(int scan = 0; scan < primeNums.length; scan++)
            System.out.print (primeNums[scan] + "  ");

        System.out.println ();
    } // end of main method
} // End of class
