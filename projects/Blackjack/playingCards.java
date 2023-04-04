/*
 Jason Israilov
 3/24/2017
 3rd Hour, Mrs. Abel
 AP Program 9 - playingCards Class
 */
public class playingCards 
{
  private Card[] deck;
  private int fullDeck = 52;
  private int dealt; 
  
  public playingCards() 
  {
    deck = new Card[52];
    int created = 0;
    for (int index = 0; index <= 3; index++) 
    {
      for (int j = 1; j <= 13; j++) 
      {
        deck[created] = new Card(j,index);
        created++;
      } // end of inner for loop
    } // end of outter for loop
    dealt = 0;
  } // end of deck method
  
  public void shuffle() 
  {
    for (int index = 51; index > 0; index--) 
    {
      int rand = (int)(Math.random()*(index+1));
      Card temp = deck[index];
      deck[index] = deck[rand];
      deck[rand] = temp;
    } // end of for loop
    dealt = 0;
  } // end of shuffle method
  
  public int cardsLeft() 
  {
    return fullDeck - dealt;
  } // end of cardsLeft method
  
  public Card dealCard() 
  {
    if (fullDeck == dealt)
      shuffle();
    dealt++;
    return deck[dealt - 1];
  } // end of dealCard method
} // end class playingCards