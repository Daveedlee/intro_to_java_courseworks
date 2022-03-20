import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Following class 
 * @author jonghoonlee
 *
 */

public class ReadingMatrix
{
   public static void main(String[] args) throws IOException
   {
      FileWriter outputStream = null;
      InputStream inputStream = null;
      Scanner s = null;

      try
      {
         outputStream = new FileWriter(args[1]); // output file
         inputStream = new FileInputStream(args[0]); // input file
         s = new Scanner(inputStream); // use scanner to process matrix
         s.useDelimiter("[[\\s]&&[^\\n]]+"); // whitespace, except newline

         int i, j, order = 0;
         while (true)
         {
            // logic for handling the order of matrix
            //
            if (s.hasNextInt())
            {
               order = s.nextInt();
               
            } else
            {
               break; // exit if no more arrays
            }
            //
            int determ = 0;
            int[][] inputMatrix = new int[order][order];
            DeterminantCalc determinant = new DeterminantCalc();
            s.nextLine(); // skip ahead to matrix elements
            for (i = 0; i < order; i++)
            {
               for (j = 0; j < order; j++)
               {
                  if (s.hasNextInt())
                  {
                     inputMatrix[i][j] = s.nextInt(); // load array element

                     outputStream.write(
                           "Array [" + i + "," + j + "] = " + inputMatrix[i][j] + "\n");
                  } else
                  {
                     System.out.println("Row is short!  Handle error...");
                  }
               }
               if (s.hasNextInt())
               {
                  System.out.println("Row is long!  Handle error...");
               }
               if (s.hasNextLine())
                  s.nextLine(); // advance to next row
            }
            determ = determinant.calculate(inputMatrix, order);
            outputStream.write("Determinant is " + determ + "\n\n");
            System.out.println("Array is loaded - process.");
         }
      } finally
      {
         if (inputStream != null)
            inputStream.close();
         if (outputStream != null)
            outputStream.close();
      }
   }

}
