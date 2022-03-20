/**
 * Following class extends deck, but adds a certain features like identifier,
 * which serves to identify which pile a pile is during the play.
 * 
 * @author jonghoonlee
 *
 */
public class Pile extends Deck
{
   // declares an object and variable
   Card last;
   int identifier;

   public Pile(int identifier)
   {
      this.identifier = identifier;
   } // end constructor

   public void addCard(char suit, int rank, boolean isHidden)
   {
      // declare and initialize the object according to the input.
      Card newCard = new Card(suit, rank, isHidden);

      // setting the head if there isn't one
      if (this.head == null)
      {
         newCard.prev = null;
         head = newCard;
         newCard.next = null;
         return;
      } else
      {
         this.last = this.head;
         while (this.last.next != null)
         {
            this.last = this.last.next;
         }

         newCard.prev = this.last;
         this.last.next = newCard;
         last = newCard;

      }

   } // end addCard

   public Card getLast()
   {
      return last;
   } // end getLast

   public int getIdentifier()
   {
      return identifier;
   } // end getIdentifier

}// end Deck
