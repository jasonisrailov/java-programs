# A Blackjack Game
The Program 9 project for APCS  was to create a Blackjack game. As required for every program project, we needed to create a project description and algorithm.

## Description
In this program, it will simulate a card game of Blackjack with a computer vs a player. In order to do this, the program will deal two cards for the player face up and two cards for the computer one face down. Each card value is the number of points it contains, for example the 5 of hearts or 5 of spades are 5 points. Face values cards such as Jack, Queen, or King are worth 10 points. The Ace card can be interchanged between 1 or 11 points depending on the situation. The objective of the game is to get a total of 21 points or less. If the total points from the first two cards of the player is less than 16 the player has two options. One option is to get another card called a hit, the other option is that the player can choose to stay. On the computers turn, if the total of the first two cards are less than 16 then the computer is required to take another card until they are 16 or over. If the player receives over 21 points then the computer wins. If they player receives less than 21 points then chooses to stay for the computer to go and the computer get over 21 points, then the player wins. If both the player and the computer both get the same number of total points then it is a cats game. After there is a winner the total score is printed and the round ends. The player is then given the option to play another round.


## Algorithm
1. First, the program welcomes the player and asks the player if they would like to play.
2. The player uses the keyboard to type ‘yes’ or ‘no’
3. If player responds with 'no', then the program prints Thanks for playing.'
4. If the player responds with 'yes', then the program prints the first two cards of the player printing as the name/number of the card and the suit of the card.
5. The cards are added together to get the total points of those cards.
6. Then the program prints the first card drawn card for the computer with the name/number of the card and the suit of the card.
7. Then the program asks the player if the player would like to hit or stay
8. The player uses the keyboard to type ‘H’ for hit or ’S’ for stay.
9. If the player choses to hit by typing ‘H’ then the computer draws a card for the player and prints the new card with the name number of the card and the suit of the card.
10. The player's total points are printed
11. If the player's total points are greater than 21 then the program prints player went over 21 and the computer wins this round
12. Then the player's score, the computer's score, and the number of cats games are totaled from each round and printed.
13. If the total points are less than 21 then the program prints all the player's cards as the name/number of the card and the suit of the card and repeats steps 5-8 unless total points are greater than 21
14. If the player chooses to stay by typing S then both the computers cards are printed as well as the total points of the cards
15. If the total points of the two cards from the computer are less than 16 then the computer hits and prints the new card it hits
16. Computer continues to draw cards by hitting until the total points are greater than or equal to 16
17. If computers total is 21 then the computer prints computer won because computer got blackjack
18. If the computer has higher total points than the player of the round and player has less total points then the computer then the computer wins the round and a point is added to the computer's score. Else the player wins the round and a point is added to the player's score.
19. If the player and the computer have the same number of total points then it is a cats game and one point is added to cats game variable at the end of round when scores are printed.
20. Next the program asks the player if the player would like to play another game, it prints type yes to play again type no to stop
21. If the player types yes repeat steps 4-19.
22. If player responds with 'no', then the program prints 'Thanks for playing.'

