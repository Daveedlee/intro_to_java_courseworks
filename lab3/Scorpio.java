import java.io.*;
import java.util.*;

/**
 * Following Program runs the game Scorpion
 * 
 * @author jonghoonlee
 *
 */

public class Scorpio
{
   public static void main(String[] args) throws IOException
   {
      InputStream inputStream = null;
      InputStreamReader inputStreamReader = null;
      BufferedReader bufferedReader = null;
      Scanner s = null;
      Deck startingDeck = null;
      Deal dealer = null;
      DisplayBoard display = null;
      String askShuffle = null;
      PlayingAlgorithm play = null;

      try
      {
         inputStream = new FileInputStream(args[0]);
         inputStreamReader = new InputStreamReader(inputStream);
         bufferedReader = new BufferedReader(inputStreamReader);
         startingDeck = new Deck();
         dealer = new Deal();
         display = new DisplayBoard();
         s = new Scanner(System.in);
         play = new PlayingAlgorithm();

         int c;
         char suit = 20;
         int rank = 0;
         int turn = 0;

         // Following while statement reads the input file to create the initial state of
         // the game
         while (((c = bufferedReader.read()) != -1))
         {
            if (c != 20)
            {
               if (c == 'D' || c == 'H' || c == 'S' || c == 'C')
               {
                  suit = (char) c;
               } else if (c == '1')
               {
               } else if (c == '0')
               {
                  rank = 10;
               } else if (c == 'A')
               {
                  rank = 1;
               } else if (c == 'J')
               {
                  rank = 11;
               } else if (c == 'Q')
               {
                  rank = 12;
               } else if (c == 'K')
               {
                  rank = 13;
               } else if (c > 49 && c < 58)
               {
                  rank = Character.getNumericValue(c);
               }

               if ((rank != 0) && (suit != 20))
               {
                  startingDeck.append(startingDeck, suit, rank, false);
                  rank = 0;
                  suit = 20;
               }
            }
         }
         dealer.dealing(startingDeck);

         while (turn < 100)
         {
            display.currentStatus(dealer);
            play.solvePuzzle(dealer, turn);
            play.removeSolved(dealer.pileOne.last);
            play.removeSolved(dealer.pileTwo.last);
            play.removeSolved(dealer.pileThree.last);
            play.removeSolved(dealer.pileFour.last);
            play.removeSolved(dealer.pileFive.last);
            play.removeSolved(dealer.pileSix.last);
            play.removeSolved(dealer.pileSeven.last);
            System.out.println(play.hasWon(dealer));
            turn++;
         }

         System.out.println("Shuffle the cards? (Y/N)");
         askShuffle = s.nextLine();
         if (askShuffle == "Y")
         {
            startingDeck.shuffle(startingDeck);
            turn = 0;
            dealer.dealing(startingDeck);

            while (turn < 100)
            {
               display.currentStatus(dealer);
               play.solvePuzzle(dealer, turn);
               play.removeSolved(dealer.pileOne.last);
               play.removeSolved(dealer.pileTwo.last);
               play.removeSolved(dealer.pileThree.last);
               play.removeSolved(dealer.pileFour.last);
               play.removeSolved(dealer.pileFive.last);
               play.removeSolved(dealer.pileSix.last);
               play.removeSolved(dealer.pileSeven.last);
               System.out.println(play.hasWon(dealer));
               turn++;
            }
         }

      } finally
      {
         if (inputStream != null)
            inputStream.close();
      }
   } // end main
} // end Scorpio

