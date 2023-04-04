/*
WinPercentage.java
Demonstrates the use of a while loop for input validation.
Page 147 in AP Java book.
*/

import java.text.NumberFormat;
import cs1.Keyboard;

public class WinPercentage
{
    // Computes the percentage of games won by a team.
    public static void main (String[] args)
    {
        final int NUM_GAMES = 12;
        int won;
        double ratio;

        System.out.println("Enter the number of games won (0 to " + NUM_GAMES + "): ");

        won = Keyboard.readInt();

        while(won < 0 || won > NUM_GAMES)
        {
            System.out.println("Invalid input. Please reenter: ");
            won = Keyboard.readInt();
        } // end of while loop

        ratio = (double) won / NUM_GAMES;

        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println();
        System.out.println("Winning percentage: " + fmt.format(ratio));
    } // end of main method
} // End of class
