/*
Jason Israilov
3/24/2017
3rd Hour, Mrs. Abel
AP Program 9 - Blackjack Class
*/

public class Blackjack extends Sort 
{
  public int getBlackjackValue() 
  {
    boolean ace = false;
    int cards;
    int amount = 0;
    cards = getCardCount();
    
    for (int index = 0; index < cards; index++) 
    {
      Card card;
      int cardCount;
      card = getCard(index);
      cardCount = card.getValue();
      if (cardCount > 10) 
        cardCount = 10;
      if (cardCount == 1) 
        ace = true;
      amount += cardCount;
    } // end of for loop
    if (ace == true && amount + 10 <= 21)
      amount += 10;
    
    return amount;
  } // end of method
} // end class Blackjack
