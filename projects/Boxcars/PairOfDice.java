/*
Jason Israilov
11/14/16
3rd Hour, Mrs. Abel
Program 5
*/
import java.util.Random;

public class PairOfDice
{
  private int die1;
  private int die2;

  // constructor
  public PairOfDice()
  {
    die1 = 0;
    die2 = 0;
  }

  // this method generates two random dice that have values from 1 to 6
  public void RollingTheDice() 
  {
    Random r = new Random();
    die1 = r.nextInt(6)+1;
    die2 = r.nextInt(6)+1;
  }
  // this method find the sum of the pair of dice as an int
  public int TotalofDie()
  {
    return die1 + die2;
  }

  // this method shows the random value of die1
  public int SeeDieOne()
  {
    return die1;
  }

  // this method shows the random value of die2
  public int SeeDieTwo()
  {
    return die2;
  }

} // End of Class
