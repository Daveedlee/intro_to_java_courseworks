/**
 * Following class serves as a basic node in the program Scorpio.
 * 
 * @author jonghoonlee
 *
 */
public class Card
{
   // Declare variables
   Card next, prev;
   boolean isHidden;
   char suit;
   int rank;

   public Card(char suit, int rank, boolean isHidden)
   {
      this.suit = suit;
      this.rank = rank;
      this.isHidden = isHidden;
   } // end constructor

   public void setHidden(boolean isHidden)
   {
      this.isHidden = isHidden;
   } // end setHidden

   public char getSuit()
   {
      return suit;
   } // end getSuit

   public void setSuit(char suit)
   {
      this.suit = suit;
   } // end setSuit

   public int getRank()
   {
      return rank;
   } // end getRank

   public void setRank(int rank)
   {
      this.rank = rank;
   } // end setRank

}// end Card

