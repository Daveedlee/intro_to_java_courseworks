/**
 * Following class constructs a deck given inputs. It contains two methods push
 * and append. The push method adds an element on top of the deck. The append
 * method adds an element at the bottom.
 * 
 * @author jonghoonlee
 *
 */

public class Deck
{
   // Declare head
   Card head;

   // push method adds an element on top of the deck.
   public void push(Deck deck, char suit, int rank, boolean isHidden)
   {
      // declares a new card object with given inputs
      Card newCard = new Card(suit, rank, isHidden);

      newCard.next = this.head;
      newCard.prev = null;

      // handling edge case
      if (head != null)
      {
         head.prev = newCard;
      }

      head = newCard;
   } // end push

   // append method adds an element to the bottom of the deck.
   public void append(Deck deck, char suit, int rank, boolean isHidden)
   {
      // declares a new card object and also the variable last
      Card newCard = new Card(suit, rank, isHidden);
      Card last = head;

      newCard.next = null;

      // handling when head is null.
      if (head == null)
      {
         newCard.prev = null;
         head = newCard;
         return;

      }

      // moving to the last node
      while (last.next != null)
      {
         last = last.next;
      }

      last.next = newCard;

      newCard.prev = last;

   } // end append

   // the shuffle method shuffles the cards in deck.
   public void shuffle(Deck deck)
   {
      Deck newDeck = new Deck();
      Card currentCard = deck.head;

      // following for-loop takes the current deck and creates a new deck, shuffled.
      // Odd numbered cards are added to the deck using push method and even numbered
      // cards are added to the deck using the append method.
      for (int i = 0; i < 52; i++)
      {
         // handling the even numbers
         if ((i % 2) == 0)
         {
            newDeck.append(newDeck, currentCard.getSuit(),
                  currentCard.getRank(), false);

         }
         // handling the odd numbers
         if ((i % 2) == 1)
         {
            newDeck.push(newDeck, currentCard.getSuit(),
                  currentCard.getRank(), false);

         }
         currentCard = currentCard.next;
      }

      this.head = newDeck.head;
   } // end shuffle

} // end Deck
