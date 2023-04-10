/*
 Jason Israilov
 10/12/2017
 Program 2 - without checks!!
 Mrs. Abel, 2nd hour
 */

/* Test using these card numbers:
 *  -- ex. on program paper: 378282246310005
 * 
 * Visa:
 * 4716980784505789 (not good)
 * 4532051685171565 (good)
 * 
 * MasterCard
 * 5343680190648571 (not good)
 * 5279057342042846 (good)
 * 
 * AMEX
 * 377863525317802 (good)
 * 342144236856476 (not good)
 * 
 */

// 4532051685171565  -- should be valid visa

import cs1.Keyboard;
public class Program2
{
  public static void main (String[] args)
  {
    String cardNum = "";
    String startingDigit = "";
    String mcCard = "MasterCard";
    String visa = "Visa";
    String aeCard = "American Express Card";
    int cardLength = 0;
    String startingNum = "";
    boolean allNumeric = true;
    int cardNumDoubled = 0;
    int sum1 = 0;
    int ccLastNum = 0;
    int sum2 = 0;
    int total = 0;
    int sec2LastNum = 0;
    int numDoubledChar1 = 0;
    int numDoubledChar2 = 0;
    
    
    System.out.println("Enter the credit card number to confirm whether it is valid or not.");
    cardNum = Keyboard.readString();
    cardLength = cardNum.length();
    startingDigit = cardNum.substring(0,1);
    //first check if the string numeric
    // use charAt check if numbers are from 48-57
    
    if(cardLength == 13 || cardLength == 15 || cardLength == 16)
    {
      if(cardLength == 15)
        startingNum = cardNum.substring(0,2);
      else if (cardLength == 16 && startingDigit.equals("5"))
        startingNum = cardNum.substring(0,2);
      else
        startingNum = cardNum.substring(0,1); // visa cards only start with 4 
      //System.out.println(startingNum);
      for(int i = 0; i < cardLength; i++)
      {
        if(!(cardNum.charAt(i) >= 48 && cardNum.charAt(i) <= 57))
        {
          allNumeric = false;
          break;
        }
      }
      
      if(allNumeric)
      {
        // Now it is time to multiply every other digit by 2 starting with the second to last digit then add those products together.
        for(int j = cardLength-2; j >= 0; j-=2)
        {
          sec2LastNum = cardNum.charAt(j)-48; // -48 changes theunicode character value to the actual number
          cardNumDoubled = (sec2LastNum*2);
          if(cardNumDoubled >= 10)
          { // convert to string --- use charAt 0 and 1
            // now that i know that it is greater than or equal to 10 i need to split it into two. so convert it back
            String ccNumDoubled = Integer.toString(cardNumDoubled);
            // check what the two characters are
            String twoCharacters = ccNumDoubled.substring(0,2);
            numDoubledChar1 = twoCharacters.charAt(0)-48;
            numDoubledChar2 = twoCharacters.charAt(1)-48;
            // add those products digits together
            sum1 += numDoubledChar1 + numDoubledChar2;
          } // end of if statement to see if the card number doubled is >= to 10
          else
          {
            sum1 += cardNumDoubled;
          } // end of else
        } // end of for loop from last two card num digits
        
        // now it is time to make another for loop to find the numbers that were NOT multiplied by 2
        for(int k = cardLength-1; k >= 0; k-=2)
        {
          ccLastNum = cardNum.charAt(k)-48; // -48 changes theunicode character value to the actual number
          sum2 += ccLastNum;
        } // end of second k for loop
        total = sum1 + sum2;
        // now it is time to check if the total is = 0
        if(total % 5 == 0)
        {
          if(startingNum.equals("34") || startingNum.equals("37"))
          {
            System.out.println("The card is an " + aeCard);
          }
          else if(startingNum.equals("51") || startingNum.equals("52") || startingNum.equals("53") || startingNum.equals("54") || startingNum.equals("55"))
          {
            System.out.println("The card is a " + mcCard);
          }
          else if(startingNum.equals("4"))
          {
            System.out.println("The card is a " + visa);
          }
          else
            System.out.println("INVALID!");
        }
        else
          System.out.println("INVALID");
      } // end of ifNumeric if statement
      else
      {
        System.out.println("The string is not all numeric numbers!!");
      }
    } // end of check to see if the card length is > 13, 15, 16
    else
    {
      System.out.println("You entered a " + cardNum.length() + "-digit card number. The length should be equal to 13, 15, or 16-digits.");
      System.out.println("Please try again.");
    }
  } // end of main method
} // end of Program1 class

// 378282246310005


