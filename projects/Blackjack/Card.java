/*
 Jason Israilov
 3/24/2017
 3rd Hour, Mrs. Abel
 AP Program 9 - Card Class
 */

public class Card
{
  public final static int SPADES = 0, // Codes for the 4 suits.
    HEARTS = 1,
    DIAMONDS = 2, 
    CLUBS = 3; 
  
  public final static int ACE = 1, // codes for the non-numeric 
    JACK = 11, // cards 2 through 10 have their
    QUEEN = 12, // numerical values for their 
    KING = 13; 
  
  
  public final int suit; // the suit of this card, one of the constatns 
  // SPADES, HEARTS, DIAMONDS, CLUBS.
  
  public final int value; // the value of this card from 1 to 11
  
  
  public Card(int theValue, int theSuit)
  {
    // contruct a card with the specigic value and suit. Value must be be tween 1 and 13. 
    // Suit must be between 0 and 3.
    // If the parameters are outside these ranges, the contructed card object will be invalid
    value = theValue;
    suit = theSuit;
  }
  
  public int getSuit()
  {
    return suit; // Return the int that codes for this card's suit.
  }
  
  public int getValue()
  {
    return value; // return the int that codes for this card's value. 
  }
  
  public String getSuitAsString()
  { // returns a string representing the card's suit.
    // (if the car's suit is invalid, "??" is returned.)
    switch(suit)
    {
      case SPADES:  return "SPADES";
      case HEARTS:  return "HEARTS";
      case DIAMONDS:  return "DIAMONDS";
      case CLUBS:  return "CLUBS";
      default:   return "??";
    }
  } // end of getSuitAsString
  
  public String getValueAsString()
  { // return a string representing the card's value
    // if the card's valie is invalid,  "??" is returned
    switch(value)
    {
      case 1:  return "Ace";
      case 2:  return "2";
      case 3:  return "3";
      case 4:  return "4";
      case 5:  return "5";
      case 6:  return "6";
      case 7:  return "7";
      case 8:  return "8";
      case 9:  return "9";
      case 10: return "10";
      case 11: return "Jack";
      case 12: return "Queen";
      case 13: return "King";
      default:  return "??";
    }
  } // end of getValueAsString method
  
  public String toString()
  { // return a string representation of this card, 
    // such as "10 of Hearts" or "Queen of Spades".
    return getValueAsString() + " of " + getSuitAsString();
  }
} // end of Card Class