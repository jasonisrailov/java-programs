/*
 Jason Israilov
 10/23/17
 3rd Hour
 Program 3 Without Checks
 */
import java.util.Random;
import cs1.Keyboard;
public class Program3
{
  public static void main (String[] args)
  {
    double gambleAmount = 0.0;
    double bet = 0.0;
    double currentGambleAmount = 0.0;
    String spinAgain = "y";
    boolean hasMoney = true;
    int ranNum1 = 0, ranNum2, ranNum3, ranNum4, ranNum5;
    int grapesCount;
    int spinNum = 1;
    // create a spinNum variable that counts the number of spins
    Random generator = new Random(); // random generator that prints 5 randoms
    System.out.println("How much would you like to gamble with today?");
    gambleAmount = Keyboard.readDouble();
    while(hasMoney == true && spinAgain.equalsIgnoreCase("y"))
    {
      System.out.println("How much would you like to bet during this spin?");
      bet = Keyboard.readDouble();
      gambleAmount = gambleAmount - bet;
      spinNum = 1;
      while(spinNum != 0)
      {
        spinNum -= 1;
        if(gambleAmount >= bet && gambleAmount > 0)
        {
          //System.out.println("bet <= gambleAmount && gambleAmount > 0");
          hasMoney = true;
          System.out.println("Your current gambling amount is now $" + gambleAmount + ". Good luck!\n");
          System.out.println("Your five random numbers are");
          ranNum1 = generator.nextInt(5)+1;
          System.out.println(ranNum1);
          ranNum2 = generator.nextInt(5)+1;
          System.out.println(ranNum2);
          ranNum3 = generator.nextInt(5)+1;
          System.out.println(ranNum3);
          ranNum4 = generator.nextInt(5)+1;
          System.out.println(ranNum4);
          ranNum5 = generator.nextInt(5)+1;
          System.out.println(ranNum5);
          // ranNum1 (Lemons) Position check
          if(ranNum1 == 1)
            System.out.print("Lemons\t\t");
          else if(ranNum1 == 2)
            System.out.print("Apples\t\t");
          else if(ranNum1 == 3)
            System.out.print("Oranges\t\t");
          else if(ranNum1 == 4)
            System.out.print("Cherries\t\t");
          else
            System.out.print("Grapes\t\t");
          // ranNum2 (Apples) Position check
          if(ranNum2 == 1)
            System.out.print("Lemons\t\t");
          else if(ranNum2 == 2)
            System.out.print("Apples\t\t");
          else if(ranNum2 == 3)
            System.out.print("Oranges\t\t");
          else if(ranNum2 == 4)
            System.out.print("Cherries\t\t");
          else
            System.out.print("Grapes\t\t");
          // ranNum3 (Oranges) Position check
          if(ranNum3 == 1)
            System.out.print("Lemons\t\t");
          else if(ranNum3 == 2)
            System.out.print("Apples\t\t");
          else if(ranNum3 == 3)
            System.out.print("Oranges\t\t");
          else if(ranNum3 == 4)
            System.out.print("Cherries\t\t");
          else
            System.out.print("Grapes\t\t");
          // ranNum4 (Cherries) Position check
          if(ranNum4 == 1)
            System.out.print("Lemons\t\t");
          else if(ranNum4 == 2)
            System.out.print("Apples\t\t");
          else if(ranNum4 == 3)
            System.out.print("Oranges\t\t");
          else if(ranNum4 == 4)
            System.out.print("Cherries\t\t");
          else
            System.out.print("Grapes\t\t");
          // ranNum5 (Grapes) Position check
          if(ranNum5 == 1)
            System.out.print("Lemons\t\t");
          else if(ranNum5 == 2)
            System.out.print("Apples\t\t");
          else if(ranNum5 == 3)
            System.out.print("Oranges\t\t");
          else if(ranNum5 == 4)
            System.out.print("Cherries\t\t");
          else
            System.out.print("Grapes\t\t");
          System.out.println();
          // Lemons (ranNum == 1) in a row check
          if(ranNum1 == 1 && ranNum2 == 1 && ranNum3 == 1 && ranNum4 == 1 && ranNum5 == 1) // 5 in a row
            gambleAmount += bet * 120;
          else if(ranNum1 == 1 && ranNum2 == 1 && ranNum3 == 1 && ranNum4 == 1 || ranNum2 == 1 && ranNum3 == 1 && ranNum4 == 1 && ranNum5 == 1) // 4 in a row
            gambleAmount += bet * 50;
          else if(ranNum1 == 1 && ranNum2 == 1 && ranNum3 == 1 || ranNum2 == 1 && ranNum3 == 1 && ranNum4 == 1 || ranNum3 == 1 && ranNum4 == 1 && ranNum5 == 1) // 3 in a row
            gambleAmount += bet * 15;
          else
            gambleAmount = gambleAmount;
          // Apples (ranNum == 2) in a row check
          if(ranNum1 == 2 && ranNum2 == 2 && ranNum3 == 2 && ranNum4 == 2 && ranNum5 == 2) // 5 in a row
            gambleAmount += bet * 1200;
          else if(ranNum1 == 2 && ranNum2 == 2 && ranNum3 == 2 && ranNum4 == 2 || ranNum2 == 2 && ranNum3 == 2 && ranNum4 == 2 && ranNum5 == 2) // 4 in a row
            gambleAmount += bet * 200;
          else if(ranNum1 == 2 && ranNum2 == 2 && ranNum3 == 2 || ranNum2 == 2 && ranNum3 == 2 && ranNum4 == 2 || ranNum3 == 2 && ranNum4 == 2 && ranNum5 == 2) // 3 in a row
            gambleAmount += bet * 50;
          else if(ranNum1 == 2 && ranNum2 == 2 || ranNum2 == 2 && ranNum3 == 2 || ranNum3 == 2 && ranNum4 == 2 || ranNum4 == 2 && ranNum5 == 2) // 2 in a row
            gambleAmount += bet * 7;
          else
            gambleAmount = gambleAmount;
          // Oranges (ranNum == 3) in a row check
          if(ranNum1 == 3 && ranNum2 == 3 && ranNum3 == 3 && ranNum4 == 3 && ranNum5 == 3) // 5 in a row
            gambleAmount += bet * 400;
          else if(ranNum1 == 3 && ranNum2 == 3 && ranNum3 == 3 && ranNum4 == 3 || ranNum2 == 3 && ranNum3 == 3 && ranNum4 == 3 && ranNum5 == 3) // 4 in a row
            gambleAmount += bet * 100;
          else if(ranNum1 == 3 && ranNum2 == 3 && ranNum3 == 3 || ranNum2 == 3 && ranNum3 == 3 && ranNum4 == 3 || ranNum3 == 3 && ranNum4 == 3 && ranNum5 == 3) // 3 in a row
            gambleAmount += bet * 30;
          else if(ranNum1 == 3 && ranNum2 == 3 || ranNum2 == 3 && ranNum3 == 3 || ranNum3 == 3 && ranNum4 == 3 || ranNum4 == 3 && ranNum5 == 3) // 2 in a row
            gambleAmount += bet * 5;
          else
            gambleAmount = gambleAmount;
          // Cherries (ranNum == 4) in a row check
          if(ranNum1 == 4 && ranNum2 == 4 && ranNum3 == 4 && ranNum4 == 4 && ranNum5 == 4) // 5 in a row
            gambleAmount += bet * 50;
          else if(ranNum1 == 4 && ranNum2 == 4 && ranNum3 == 4 && ranNum4 == 4 || ranNum2 == 4 && ranNum3 == 4 && ranNum4 == 4 && ranNum5 == 4) // 4 in a row
            gambleAmount += bet * 20;
          else if(ranNum1 == 4 && ranNum2 == 4 && ranNum3 == 4 || ranNum2 == 4 && ranNum3 == 4 && ranNum4 == 4 || ranNum3 == 4 && ranNum4 == 4 && ranNum5 == 4) // 3 in a row
            gambleAmount += bet * 5;
          else
            gambleAmount = gambleAmount;
          // Grapes (ranNum == 5) -- to get this you need a 3 or 4 anywhere on the board (check)
          grapesCount = 0;
          if(ranNum1 == 5)
            grapesCount++;
          if(ranNum2 == 5)
            grapesCount++;
          if(ranNum3 == 5)
            grapesCount++;
          if(ranNum4 == 5)
            grapesCount++;
          if(ranNum5 == 5)
            grapesCount++;
          if(grapesCount == 4)
          {
            System.out.println("!!You get 10 free spins!!");
            spinNum += 10;
          }
          else if(grapesCount == 3)
          {
            System.out.println("!!You get 5 free spins!!");
            spinNum += 5;
          }
          else if (grapesCount > 0 && grapesCount < 3)
          {
            //System.out.println("\ngrapesCount > 0 && grapesCount < 3");
          }
          else
          {
            //System.out.println("\ngrapesCount != 4 && grapesCount != 3");
          }
          System.out.println("\nYour grapesCount is " + grapesCount + ".\n");
          System.out.println("Your current gambling amount is now $" + gambleAmount + ". Good luck!\n");
          if(spinNum == 0)
          {
            System.out.println("Would you like to spin again? (y/n)");
            spinAgain = Keyboard.readString();
          }
        } // end of big if statement
        else
        {
          //System.out.println("ERROR!! bet > gambleAmount or gambleAmount < 0 and...");
          hasMoney = false;
          spinAgain = "n";
        }
      } // end of inner while loop
    } // end of big while loop.
    System.out.println("User does not want to play again or does not have money to play again.");
  } // end of main method
} // end of class
