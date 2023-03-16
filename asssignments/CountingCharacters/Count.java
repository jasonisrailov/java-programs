/*
Jason Israilov
12/2/16
3rd Hour, Mrs. Abel
Counting Characters Number 5
*/
import java.io.*;
import java.util.Scanner;
public class Count
{
  public static void main(String []args)
  {
    String phrase;
    int countA;
    int countE;
    int countS;
    int countT;
    int countBlank;
    int length;
    char ch;

    Scanner s = new Scanner(System.in);

    //Print a program header
    System.out.println();
    System.out.println("Character Counter");
    System.out.println();

    //Read in a string and find its length
    System.out.println("Enter a sentence or phrase: ");
    phrase = s.nextLine();
    length = phrase.length();


    while(!phrase.equalsIgnoreCase("quit"))
    {
        //Initialize counts
        countA = 0;
        countE = 0;
        countS = 0;
        countT = 0;
        countBlank = 0;
        for(int i = 0; i < phrase.length(); i++)
        {
            ch = phrase.charAt(i);
            switch(ch)
            {
                case 'a': case 'A':
                    countA++;
                    break;
                case 'e': case 'E':
                    countE++;
                    break;
                case 's': case 'S':
                    countS++;
                    break;
                case 't': case 'T':
                    countT++;
                    break;
                case ' ':
                    countBlank++;
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        System.out.println("Number of A spaces: " + countA);
        System.out.println("Number of E spaces: " + countE);
        System.out.println("Number of S spaces: " + countS);
        System.out.println("Number of T spaces: " + countT);
        System.out.println("Number of blank spaces: " + countBlank);
        System.out.println();
        System.out.println("Enter a sentence or phrase: ");
        phrase = s.nextLine();
    }

  }//end of main

} //end of Class
