/*
Average.java
Demonstrates the use of a while loop, a sentinel value, and a running sum.
Page 144 in AP Java book.
*/

import java.text.DecimalFormat;
import cs1.Keyboard;
public class Average
{
    // Computes the average of a set of values entered by the user.
    // The running sum is printed as the numbers are entered.
    public static void main (String[] args)
    {
        int sum = 0, value, count = 0;
        double average;

        System.out.print("Enter an integer (0 to quit): ");
        value = Keyboard.readInt();

        while(value != 0) // sentinel value of 0 to terminate loop
        {
            count++;

            sum += value;
            System.out.println("The sum so far is " + sum);

            System.out.println("Enter an integer (0 to quit): ");
            value = Keyboard.readInt();
        } // end of while loop

        System.out.println();
        System.out.println("Number of values entered: " + count);

        average = (double)sum / count;

        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.println("The average is " + fmt.format(average));
    } // end of main method
} // End of class
