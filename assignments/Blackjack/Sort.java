/*
 Jason Israilov
 3/24/2017
 3rd Hour, Mrs. Abel
 AP Program 9 - Sort Class
 */

import java.util.ArrayList;
public class Sort 
{
  private ArrayList<Card> deckCards;
  public Sort() 
  {
    deckCards = new ArrayList<Card>();
  }
  public void clear() 
  {
    deckCards.clear();
  }
  
  public void addCard(Card c) 
  {
    if (c != null)
      deckCards.add(c);
  }
  
  public void removeCard(Card c) 
  {
    deckCards.remove(c);
  }
  
  public void removeCard(int position) 
  {
    if (position >= 0 && position < deckCards.size())
      deckCards.remove(position);
  }
  
  public int getCardCount() 
  {
    return deckCards.size();
  }
  
  public Card getCard(int position) 
  {
    if (position >= 0 && position < deckCards.size())
      return (Card)deckCards.get(position);
    else
      return null;
  }
  
  public void sortBySuit() 
  {
    ArrayList<Card> newHand = new ArrayList<Card>();
    while (deckCards.size() > 0) 
    {
      int pos = 0;
      Card c = (Card)deckCards.get(0);
      for (int index = 1; index < deckCards.size(); index++) 
      {
        Card c1 = (Card)deckCards.get(index);
        if (c1.getSuit() < c.getSuit() || (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue())) 
        {
          pos = index;
          c = c1;
        }
      }
      deckCards.remove(pos);
      newHand.add(c);
    }
    deckCards = newHand;
  }
  
  public void sortByValue() 
  {
    ArrayList<Card> newHand = new ArrayList<Card>();
    while (deckCards.size() > 0)
    {
      int pos = 0;
      Card c = (Card)deckCards.get(0);
      for (int index = 1; index < deckCards.size(); index++) 
      {
        Card c1 = (Card)deckCards.get(index);
        if (c1.getValue() < c.getValue() ||
            (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()))
        {
          pos = index;
          c = c1;
        }
      }
      deckCards.remove(pos);
      newHand.add(c);
    }
    deckCards = newHand;
  }
} // end of Sort class