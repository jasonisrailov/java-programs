/*
Jason Israilov
3/24/2017
3rd Hour, Mrs. Abel
AP Program 9 - Black Jack Main Class - run program on here
*/
   import cs1.Keyboard;
    public class BlackjackMain 
    {
       public static void main(String[] args) 
       {
          int playerScore = 0;
          int computerScore = 0;
          int gameTie = 0;
          String again = "";
          boolean catsGame = false;
          boolean playerWinner = false;
          System.out.println("***************************");
          System.out.println("**WELCOME TO BLACKJACK!!!**");
          System.out.println("***************************");
          
           System.out.println("Would you like to play Blackjack? (Yes/No)");
                again = Keyboard.readString();

          while (again.equalsIgnoreCase("Yes")) 
          {
                 playerWinner = playBlackjack();
                 if (playerWinner)
                 playerScore = playerScore + 1;
              else
                 computerScore = computerScore + 1;
              if(catsGame)
                gameTie = gameTie + 1;
              System.out.println("Your score is: " + playerScore);
              System.out.println("Computer Score is: " + computerScore);
              System.out.println("Cats games: " + gameTie);
              System.out.println("-----------------------------------------");
              System.out.println("Would you like to play another round? (Yes/No)");
                again = Keyboard.readString();
          } // end of while loop
          if(again.equalsIgnoreCase("No"));
            System.out.println("Thanks for playing.");
         } // end of main

       static boolean playBlackjack() 
       {
          Deck deck;
          BlackjackHand computerHand;
          boolean catsGame = false;
          BlackjackHand playerCards;
          deck = new Deck();
          computerHand = new BlackjackHand();
          playerCards = new BlackjackHand();
          
          deck.shuffle();
          computerHand.addCard(deck.dealCard());
          computerHand.addCard(deck.dealCard());
          playerCards.addCard(deck.dealCard());
          playerCards.addCard(deck.dealCard());

          if (computerHand.getBlackjackValue() == 21) 
          {
               System.out.println("Computer has the " + computerHand.getCard(0) + " and the " + computerHand.getCard(1) + ".");
               System.out.println("User has the " + playerCards.getCard(0) + " and the " + playerCards.getCard(1) + ".");
               System.out.println("Computer has Blackjack. COMPUTER WINS.");
               return false;
          } // end of if
          
          if (playerCards.getBlackjackValue() == 21) 
          {
               System.out.println("Computer has the " + computerHand.getCard(0)+ " and the " + computerHand.getCard(1) + ".");
               System.out.println("User has the " + playerCards.getCard(0)+ " and the " + playerCards.getCard(1) + ".");
               System.out.println("You have Blackjack. YOU WIN!!.");
               return true;
          } // end of if
          
          while (true) 
          {
               System.out.println("Your cards are:");
               for (int index = 0; index < playerCards.getCardCount(); index++)
                  System.out.println("    " + playerCards.getCard(index));
               System.out.println("Your total is " + playerCards.getBlackjackValue());
               System.out.println();
               System.out.println("Computer is showing the " + computerHand.getCard(0));
               System.out.println("Would you like another card? Type (H) for Hit or (S) to Stay? ");
               char playerChoice;
               do 
               {
                  playerChoice = Character.toUpperCase(Keyboard.readChar());
                  if (playerChoice != 'H' && playerChoice != 'S')
                     System.out.println("you must say Hit (H) or Stay (S): ");
               } while (playerChoice != 'H' && playerChoice != 'S'); // end of do while loop
               if (playerChoice == 'S') 
                   break;
               else 
               {
                   Card newCard = deck.dealCard();
                   playerCards.addCard(newCard);
                   System.out.println();
                   System.out.println("You chose to hit. Your card is the " + newCard);
                   System.out.println("Your total is now " + playerCards.getBlackjackValue());
                   if (playerCards.getBlackjackValue() > 21) 
                   {
                       System.out.println("You lost by going over 21. The computer won this round.");
                       System.out.println("Computer's other card was the " + computerHand.getCard(1));
                       return false;
                   } // end of if
               } // end of else
               
          } // end of while loop
    
          System.out.println();
          System.out.println("You chose to Stay.");
          System.out.println("Computer's cards are");
          System.out.println("    " + computerHand.getCard(0));
          System.out.println("    " + computerHand.getCard(1));
          while (computerHand.getBlackjackValue() <= 16) 
          {
             Card newCard = deck.dealCard();
             System.out.println("Computer hits and gets the " + newCard);
             computerHand.addCard(newCard);
             if (computerHand.getBlackjackValue() > 21) 
             {
                System.out.println("Computer lost by going over 21. You won this round.");
                return true;
             }
          }
          System.out.println("Computer's total is " + computerHand.getBlackjackValue());
          
          System.out.println();
          if (computerHand.getBlackjackValue() == playerCards.getBlackjackValue()) 
          {
             System.out.println("Cats game. It is a tie.");
             return catsGame;
          }
          else if (computerHand.getBlackjackValue() > playerCards.getBlackjackValue()) 
          {
             System.out.println("Computer wins, from " + computerHand.getBlackjackValue() + " points to " + playerCards.getBlackjackValue() + ".");
             return false;
          }
          else 
          {
             System.out.println("You win, " + playerCards.getBlackjackValue() + " points to " + computerHand.getBlackjackValue() + ".");
             return true;
          }
       } // end of playBlackjack method
    } // end class BlackjackMain