/*
Guessing.java
Demonstrates the use of a block statement in an if-else.
Page 132 in AP Java book.
*/

import cs1.Keyboard;
import java.util.Random;

public class Guessing
{
    public static void main (String[] args)
    {
        final int MAX = 10;
        int answer, guess;

        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;

        System.out.print("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: ");
        guess = Keyboard.readInt();
        
        if(guess == answer)
            System.out.println("You got it! Good guessing!");
        else
        {
            System.out.println("That is not correct, sorry");
            System.out.println("The number was " + answer);
        }
    } // end of main method
} // End of class
