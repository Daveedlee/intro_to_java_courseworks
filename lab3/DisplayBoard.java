
public class DisplayBoard
{
   public void currentStatus(Deal deal)
   {
      // declare and initialize the head of the each node
      Card deckOne = deal.pileOne.head;
      Card deckTwo = deal.pileTwo.head;
      Card deckThree = deal.pileThree.head;
      Card deckFour = deal.pileFour.head;
      Card deckFive = deal.pileFive.head;
      Card deckSix = deal.pileSix.head;
      Card deckSeven = deal.pileSeven.head;
      Card extraPile = deal.extraPile.head;

      // All while statements under this comment iterate through the associated
      // linked lists and prints them out according to the rules.
      System.out.print("Pile One: ");
      while (deckOne.next != null)
      {
         if (deckOne.isHidden == true)
         {
            System.out.printf("\thidden\t");
         } else
         {
            System.out.printf("\t%c%d\t", deckOne.suit, deckOne.rank);

         }

         deckOne = deckOne.next;
      }
      System.out.printf("\t%c%d\t\n", deckOne.suit, deckOne.rank);

      System.out.print("Pile Two: ");
      while (deckTwo.next != null)
      {
         if (deckTwo.isHidden == true)
         {
            System.out.printf("\thidden\t");
         } else
         {
            System.out.printf("\t%c%d\t", deckTwo.suit, deckTwo.rank);
         }

         deckTwo = deckTwo.next;
      }
      System.out.printf("\t%c%d\t\n", deckTwo.suit, deckTwo.rank);

      System.out.print("Pile Three: ");
      while (deckThree.next != null)
      {
         if (deckThree.isHidden == true)
         {
            System.out.printf("\thidden\t");
         } else
         {
            System.out.printf("\t%c%d\t", deckThree.suit, deckThree.rank);
         }

         deckThree = deckThree.next;
      }
      System.out.printf("\t%c%d\t\n", deckThree.suit, deckThree.rank);

      System.out.print("Pile Four: ");
      while (deckFour.next != null)
      {
         if (deckFour.isHidden == true)
         {
            System.out.printf("\thidden\t");
         } else
         {
            System.out.printf("\t%c%d\t", deckFour.suit, deckFour.rank);
         }

         deckFour = deckFour.next;
      }
      System.out.printf("\t%c%d\t\n", deckFour.suit, deckFour.rank);

      System.out.print("Pile Five: ");
      while (deckFive.next != null)
      {
         System.out.printf("\t%c%d\t", deckFive.suit, deckFive.rank);

         deckFive = deckFive.next;
      }
      System.out.printf("\t%c%d\t\n", deckFive.suit, deckFive.rank);

      System.out.print("Pile Six: ");
      while (deckSix.next != null)
      {
         System.out.printf("\t%c%d\t", deckSix.suit, deckSix.rank);

         deckSix = deckSix.next;
      }
      System.out.printf("\t%c%d\t\n", deckSix.suit, deckSix.rank);
      System.out.print("Pile Seven: ");
      while (deckSeven.next != null)
      {
         System.out.printf("\t%c%d\t", deckSeven.suit, deckSeven.rank);

         deckSeven = deckSeven.next;
      }
      System.out.printf("\t%c%d\t\n", deckSeven.suit, deckSeven.rank);

      if (extraPile == null)
      {
         System.out.println("Extra: 0");
      } else
      {
         System.out.println("\tExtra still available");
      }

   } // end currentStatus
} // end DisplayBoard

