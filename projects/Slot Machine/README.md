# A Blackjack Game
The Program 3 project for APCS  was to create a Slot Machine game.

### Description
Write a complete program that simulates a simple slot machine.
The first mechanical slot machine was the Liberty Bell, invented in 1895 by car mechanic, Charles Fey (1862-1944) of San Francisco.

The Liberty Bell slot machine had three spinning reels. Diamond, spade, and heart symbols were painted around each reel, plus the image of a cracked Liberty Bell. A spin resulting in three Liberty Bells in a row gave the biggest payoff, a grand total of fifty cents or ten nickels.

The original Liberty Bell slot machine can still be seen be at the Liberty Belle Saloon & Restaurant in Reno, Nevada. Other Charles Fey machines include the Draw Power, and Three Spindle and the Klondike. In 1901, Charles Fey invented the first draw poker machine. Charles Fey was also the inventor of the trade check separator, which was used in the Liberty Bell. The hole in the middle of the trade check allowed a detecting pin to distinguish fake nickels or slugs from real nickels.
Fey rented his machines to saloons and bars based on a 50/50 split of the profits.

Your programmed machine will have 5 slots that will show a Lemon, Grape, Cherry, Orange, or an Apple. The five slots will be randomly selected and they will be printed side by side on the screen. You don't actually have to show a picture of the fruit, just the word. The payout will occur if they get the following combinations and this will be the payout. So a dollar bet, will get this amount of a payout.

3 Grapes (anywhere) - 5 Free Spins

4 Grapes (anywhere) - 10 Free Spins


3 lemons- 15

4 Lemons - 50

5 Lemons - 120


3 Cherries - 5

4 Cherries - 20

5 Cherries - 50


2 Apples - 7

3 Apples - 50

4 Apples - 200

5 Apples - 1200


2 Oranges - 5

3 Oranges - 30

4 Oranges - 100

5 Oranges - 400



### Algorithm

1. First ask the user how much they would like to gamble with today and have the user enter in a desired amount.
2. Create a check to make sure that the dollar amount the user input is greater than zero
3. Have the user place their bet for that spin. Create a check to make sure the bet doesn't go over the amount of money the player has remaining.
4. Then, take the gamble amount and subtract the bet.
5. Randomly generate 5 slots for each fruit. Assign the random number 1 to lemons, random number 2 to apples, random number 3 to oranges, random number 4 to cherries, and random number 5 to grapes.
6. Check the slots that were generated. Since the slots are randomly selected, certain combinations receive payouts. If a certain combination is achieved, the bet is multiplied by the combination payout and finally added to the user's gambling amount. If the user receives a payout combination, a message with the current gambling amount is displayed as well as a good luck message to the user. If the user does not receive a payout combination, the program displays a message with the current gambling amount telling the user to try again because they might be lucky the next round.
    The payouts are as follows:
    * 3 Lemons in a row gives a payout of 15 times the user's bet.
    * 4 Lemons in a row gives a payout of 50 times the user's bet.
    * 5 Lemons in a row gives a payout of 120 times the user's bet.
    * 2 Apples in a row gives a payout of 7 times the user's bet.
    * 3 Apples in a row gives a payout of 50 times the user's bet.
    * 4 Apples in a row gives a payout of 200 times the user's bet.
    * 5 Apples in a row gives a payout of 1200 times the user's bet.
    * 2 Oranges in a row gives a payout of 5 times the user's bet.
    * 3 Oranges in a row gives a payout of 30 times the user's bet.
    * 4 Oranges in a row gives a payout of 100 times the user's bet.
    * 5 Oranges in a row gives a payout of 400 times the user's bet.
    * 3 Cherries in a row gives a payout of 5 times the user's bet.
    * 4 Cherries in a row gives a payout of 20 times the user's bet.
    * 5 Cherries in a row gives a payout of 50 times the user's bet.
    * 3 Grapes *anywhere on the board*, the user receives 5 free spins and uses the last bet the user input before receiving a Grape combination.
    * 4 Grapes *anywhere on the board*, the user receives 10 free spins and uses the last bet the user input before receiving a Grape combination.

7. Ask if the user wants to spin again or walk away from the game with their winnings. If the user decides to play again, repeat steps 3-7 until the user would like to walk away from the game with their winnings. 