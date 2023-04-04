/*
SortGrades.java
Driver for testing a numeric selection sort.
Page 323 in AP Java book. Listing 6.13.
*/

public class SortGrades
{
    // Creates an array of grades, sorts them, then prints them.

    public static void main (String[] args)
    {
        int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};

        Sorts.selectionSort(grades);

        for(int index = 0; index < grades.length; index++)
            System.out.print(grades[index] + " ");
    } // end of main method
} // End of class
