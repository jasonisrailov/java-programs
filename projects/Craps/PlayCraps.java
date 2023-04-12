/*
Jason Israilov
01/04/2017
3rd Hour, Mrs. Abel
Program 8 - PlayCraps
*/
import java.io.*;
import java.util.*;
public class PlayCraps
{
  public static void main (String [] args)
  {
      System.out.println("Initializing the game of Craps with max bet of 500");
      double wallet = 500;
      Craps game = new Craps (wallet);
      String goPlay = "Y";
      double bet = 0;
      Scanner s = new Scanner(System.in);

      while (goPlay.equalsIgnoreCase("Y")) {
        System.out.println("How much do you want to bet");
        bet = s.nextDouble();
        if (bet <= 0) {
          System.out.println("Sorry, you cannot bet negative or zero");
          break;
        }
        if (bet > wallet) {
          System.out.println("Sorry, you cannot bet more than your wallet");
          break;
        }
        bet = game.play(bet);
        wallet += bet;
        System.out.println("You have now " + wallet);

        System.out.println("Keep playing ..... (Y/N)");
        s = new Scanner(System.in);
        goPlay = s.nextLine();

      } // end of while
  } // end of main
} // end of class
