/*
Jason Israilov
01/04/2017
3rd Hour, Mrs. Abel
Program 8 - Craps
*/
import java.io.*;
import java.util.*;

public class Craps
{
  public double maxPoints;
  public boolean gameOn = true;

  public Craps(double maxPoints)
  {
    this.maxPoints = maxPoints;
  }

  public double play(double bet)
  {
    PairOfDice pd ;
    pd = new PairOfDice();

    // Toss 1
    pd.rollingTheDice();

    System.out.println("Rolling the dice ");

    int d1 = pd.seeDiceOne();
    int d2 = pd.seeDiceTwo();
    int total = pd.totalOfDice();
    System.out.println("Dice 1: " + d1);
    System.out.println("Dice 2: " + d2);
    System.out.println("Total Roll : " + total);

    if (total == 7 ||  total == 11)
    {
      System.out.println("The Player Wins");
      bet *= 2;
      return bet;
    } else if (total == 2 || total == 3 || total == 12)
    {
      System.out.println("The House Wins");
      return -bet;
    }
    else
    {
      System.out.println("Continuing the game... ");
      int point = total;
      while (this.gameOn)
      {
        pd.rollingTheDice();
        d1 = pd.seeDiceOne();
        d2 = pd.seeDiceTwo();
        total = pd.totalOfDice();
        System.out.println("Dice 1: " + d1);
        System.out.println("Dice 2: " + d2);
        System.out.println("Total Roll in Next Round: " + total);
        if (point == total)
        {
          System.out.println("The Player Wins");
          bet *= 2;
          return bet;
        }
        else if (total == 7)
        {
          System.out.println("The House Wins");
          return -bet;
        }
      } // end while
    } // end else
    return bet;
  } // end play
} // end of class
