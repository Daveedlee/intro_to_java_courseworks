/**
 * Following class takes in a deck and disperses them to different piles in the
 * game according to the rules.
 * 
 * @author jonghoonlee
 *
 */
public class Deal
{
   // declaring objects
   Pile pileOne, pileTwo, pileThree, pileFour, pileFive, pileSix, pileSeven,
         extraPile;

   // the dealing method takes in Deck class and serves different piles.
   public void dealing(Deck deck)
   {
      // defines objects
      pileOne = new Pile(1);
      pileTwo = new Pile(2);
      pileThree = new Pile(3);
      pileFour = new Pile(4);
      pileFive = new Pile(5);
      pileSix = new Pile(6);
      pileSeven = new Pile(7);
      extraPile = new Pile(8); // for extra that are initially left out from the game

      // declare and initialize the currentCard
      Card currentCard = deck.head;

      // error handling
      if (currentCard == null)
      {
         System.out.println("Error. Please check the deck.");

      } else
      {
         // for-loop iterates 52 times dispersing the cards to each pile
         for (int i = 0; i < 52; i++)
         {
            // if i < 49, since those are the card that will be "in-play"
            if (i < 49)
            {
               // condition for cards going into the first pile
               if ((i % 7) == 0)
               {
                  // defining the conditions for cards that are hidden.
                  if ((i / 7) < 3)
                  {
                     pileOne.addCard(currentCard.suit, currentCard.rank,
                           true);

                  } else
                  {
                     pileOne.addCard(currentCard.suit, currentCard.rank,
                           false);
                  }

               }
               // condition for cards going into the second
               if ((i % 7) == 1)
               {
                  // defining the conditions for cards that are hidden.
                  if ((i / 7) < 3)
                  {
                     pileTwo.addCard(currentCard.suit, currentCard.rank,
                           true);
                  } else
                  {
                     pileTwo.addCard(currentCard.suit, currentCard.rank,
                           false);
                  }
               }
               // condition for cards going into the third
               if ((i % 7) == 2)
               {
                  // defining the conditions for cards that are hidden.
                  if ((i / 7) < 3)
                  {
                     pileThree.addCard(currentCard.suit, currentCard.rank,
                           true);
                  } else
                  {
                     pileThree.addCard(currentCard.suit, currentCard.rank,
                           false);
                  }
               }
               // condition for cards going into the fourth
               if ((i % 7) == 3)
               {
                  // defining the conditions for cards that are hidden.
                  if ((i / 7) < 3)
                  {
                     pileFour.addCard(currentCard.suit, currentCard.rank,
                           true);
                  } else
                  {
                     pileFour.addCard(currentCard.suit, currentCard.rank,
                           false);
                  }
               }
               // condition for cards going into the fifth
               if ((i % 7) == 4)
               {
                  pileFive.addCard(currentCard.suit, currentCard.rank, false);
               }
               // condition for cards going into the sixth
               if ((i % 7) == 5)
               {
                  pileSix.addCard(currentCard.suit, currentCard.rank, false);
               }
               // condition for cards going into the seventh
               if ((i % 7) == 6)
               {
                  pileSeven.addCard(currentCard.suit, currentCard.rank,
                        false);
               }

            } else
            {
               // when all in-play cards are filled, add the rest to the extra

               extraPile.addCard(currentCard.suit, currentCard.rank, true);

            }

            // to the next card
            currentCard = currentCard.next;
         }

      }
   } // end dealing

   // the useExtra method uses the cards in the extraPile and adds them to the pile
   // one, two, and three.
   public void useExtra()
   {
      // declare and initialize
      Card currentCard = extraPile.head;

      // when the pile hasn't been used
      if (currentCard != null)
      {
         pileOne.addCard(currentCard.suit, currentCard.suit, false);
         currentCard = currentCard.next;
         pileTwo.addCard(currentCard.suit, currentCard.suit, false);
         currentCard = currentCard.next;
         pileThree.addCard(currentCard.suit, currentCard.suit, false);
         currentCard = null;
      } else
      {
         System.out.println("Pile already used.");
      }

   } // end useExtra

} // end Deal

