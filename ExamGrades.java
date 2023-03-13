/*
ExamGrades.java
Demonstrates the use of various control structures.
Page 164 in AP Java book.
*/

import java.text.DecimalFormat;
import cs1.Keyboard;

public class ExamGrades
{
    //  Computes the average, minimum, and maximum of a set of exam scores entered by the user.

    public static void main (String[] args)
    {
        int grade, count = 0, sum = 0, max, min;
        double average;

        // Get the first grade and give max and min that initial value
        System.out.print ("Enter the first grade (-1 to quit): ");
        grade = Keyboard.readInt();

        max = min = grade;

        //  Read and process the rest of the grades
        while(grade >= 0)
        {
            count++;
            sum += grade;

            if(grade > max)
                max = grade;
            else
                if(grade < min)
                    min = grade;
            System.out.print ("Enter the next grade (-1 to quit): ");
            grade = Keyboard.readInt ();
        } // end of while loop

        // Produce the final results
        if(count == 0)
            System.out.println ("No valid grades were entered.");
        else
        {
            DecimalFormat fmt = new DecimalFormat ("0.##");
            average = (double)sum / count;
            System.out.println();
            System.out.println ("Total number of students: " + count);
            System.out.println ("Average grade: " + fmt.format(average));
            System.out.println ("Highest grade: " + max);
            System.out.println ("Lowest grade: " + min);
        } // end of else statement

    } // end of main method
} // End of class
