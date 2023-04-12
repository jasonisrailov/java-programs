/*
Jason Israilov
11/
3rd Hour, Mrs. Abel
Program 5
*/
import java.io.*;
import java.util.Scanner;

public class BoxCars
{
 public static void main(String[] args)
 {
   //contructor
   int NumberOfBoxCars = 0;
   PairOfDice pd = new PairOfDice();
   Scanner scan = new Scanner(System.in);
   System.out.println("How many times would you like to roll?");
   int AmountTimesRolled = scan.nextInt();
   System.out.println("Number Of Rolls : " + AmountTimesRolled);

   for(int i = 0; i < AmountTimesRolled; i++)
   {
     pd.RollingTheDice();
     int d1 = pd.SeeDieOne();
     int d2 = pd.SeeDieTwo();

     if (d1==d2 && d1==6) //this will count the number of BoxCars that occur
     {
       System.out.println("Die 1 : " + d1 + " Die 2 : " + d2); //shows the numbers of both die1 and die2 being a BoxCars
       NumberOfBoxCars++;
     }
   }
   System.out.println("---------------------");
   System.out.println("Number of Box Cars :" + NumberOfBoxCars);
   System.out.println("---------------------");
 }
} // End of Class
