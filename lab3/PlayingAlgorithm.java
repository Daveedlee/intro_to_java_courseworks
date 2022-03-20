/**
 * Following class contains the incomplete logic of solving the game of
 * Scorpion.
 * 
 * 
 * @author jonghoonlee
 *
 */
public class PlayingAlgorithm
{
   // the solvePuzzle method assigns a card iteratively to the variable currentCard
   // and iterates through the last card of other piles to find the correct match.
   // If the correct one is found, its detached from the original pile and
   // rearranged into the matching pile.
   public void solvePuzzle(Deal deal, int turnCount)
   {
      int turn = turnCount;
      Card currentCard, lastCardOne, lastCardTwo, lastCardThree, lastCardFour,
            lastCardFive, lastCardSix;

      if ((turn % 7) == 0)
      {
         currentCard = deal.pileOne.head;
         lastCardOne = deal.pileTwo.last;
         lastCardTwo = deal.pileThree.last;
         lastCardThree = deal.pileFour.last;
         lastCardFour = deal.pileFive.last;
         lastCardFive = deal.pileSix.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 1)
      {
         currentCard = deal.pileTwo.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileThree.last;
         lastCardThree = deal.pileFour.last;
         lastCardFour = deal.pileFive.last;
         lastCardFive = deal.pileSix.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 2)
      {
         currentCard = deal.pileThree.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileTwo.last;
         lastCardThree = deal.pileFour.last;
         lastCardFour = deal.pileFive.last;
         lastCardFive = deal.pileSix.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 3)
      {
         currentCard = deal.pileFour.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileTwo.last;
         lastCardThree = deal.pileThree.last;
         lastCardFour = deal.pileFive.last;
         lastCardFive = deal.pileSix.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 4)
      {
         currentCard = deal.pileFive.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileTwo.last;
         lastCardThree = deal.pileThree.last;
         lastCardFour = deal.pileFour.last;
         lastCardFive = deal.pileSix.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 5)
      {
         currentCard = deal.pileSix.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileTwo.last;
         lastCardThree = deal.pileThree.last;
         lastCardFour = deal.pileFour.last;
         lastCardFive = deal.pileFive.last;
         lastCardSix = deal.pileSeven.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

      if ((turn % 7) == 6)
      {
         currentCard = deal.pileSeven.head;
         lastCardOne = deal.pileOne.last;
         lastCardTwo = deal.pileTwo.last;
         lastCardThree = deal.pileThree.last;
         lastCardFour = deal.pileFour.last;
         lastCardFive = deal.pileFive.last;
         lastCardSix = deal.pileSix.last;

         if (currentCard != null)
         {
            while (currentCard.isHidden == false)
            {
               currentCard = currentCard.next;
            }
            while (currentCard.next != null)
            {
               if ((currentCard.suit == lastCardOne.suit)
                     && ((currentCard.rank + 1) == lastCardOne.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardOne.next = currentCard;
                     break;
                  }
                  lastCardOne.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardTwo.suit)
                     && ((currentCard.rank + 1) == lastCardTwo.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardTwo.next = currentCard;
                     break;
                  }
                  lastCardTwo.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardThree.suit)
                     && ((currentCard.rank + 1) == lastCardThree.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardThree.next = currentCard;
                     break;
                  }
                  lastCardThree.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFour.suit)
                     && ((currentCard.rank + 1) == lastCardFour.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFour.next = currentCard;
                     break;
                  }
                  lastCardFour.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardFive.suit)
                     && ((currentCard.rank + 1) == lastCardFive.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardFive.next = currentCard;
                     break;
                  }
                  lastCardFive.next = currentCard;
                  break;
               }
               if ((currentCard.suit == lastCardSix.suit)
                     && ((currentCard.rank + 1) == lastCardSix.rank))
               {
                  if (currentCard.prev != null)
                  {
                     currentCard.prev = null;
                     lastCardSix.next = currentCard;
                     break;
                  }
                  lastCardSix.next = currentCard;
                  break;
               }
               currentCard = currentCard.next;
            }

         }

      }

   } // end solvePuzzle

   // Following method takes in a card and goes from bottom-up to check if the
   // card above are "removable." If so, they're removed.
   public void removeSolved(Card lastCard)
   {
      Card currentCard = lastCard;
      int rankSum = 1;

      if (currentCard.rank == 1)
      {
         while ((currentCard.prev != null)
               && (currentCard.suit == currentCard.prev.suit))
         {
            rankSum += currentCard.prev.rank;
            currentCard = currentCard.prev;
         }
      }

      if (rankSum == 91)
      {
         if (currentCard.prev != null)
         {
            currentCard.prev.next = null;
            currentCard.prev = null;
         } else
         {
            currentCard.prev = null;
         }

      }
   }

   // The hasWon method checks each pile and returns "won" if all piles are empty
   // (i.e. solved). Otherwise, it returns "not yet."
   public String hasWon(Deal deal)
   {
      if ((deal.pileOne.last == null) && (deal.pileTwo.last == null)
            && (deal.pileOne.last == null) && (deal.pileTwo.last == null)
            && (deal.pileOne.last == null) && (deal.pileTwo.last == null))
      {
         return "Won";
      }
      return "Not Yet.";
   }

}
// end PlayingAlgorithm

