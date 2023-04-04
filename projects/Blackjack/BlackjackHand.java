/*
Jason Israilov
3/24/2017
3rd Hour, Mrs. Abel
AP Program 9 - Black Jack Hand Class
*/

public class BlackjackHand extends Hand 
{
     public int getBlackjackValue() 
     {
         int val = 0;
         boolean ace = false;
         int cards;
         cards = getCardCount();

         for (int index = 0; index < cards; index++) 
         {
             Card card;
             int cardVal;
             card = getCard(index);
             cardVal = card.getValue();
             if (cardVal > 10) 
                 cardVal = 10;
             if (cardVal == 1) 
                 ace = true;
             val += cardVal;
          } // end of for loop
          if (ace == true && val + 10 <= 21)
              val += 10;
          
          return val;

     } // end getBlackjackValue()
} // end class BlackjackHand
