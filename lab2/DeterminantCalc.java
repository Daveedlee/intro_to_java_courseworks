/**
 * Following program computes determinant of a square matrix.
 * 
 * @author jonghoonlee
 *
 */
public class DeterminantCalc
{

   // getMinor method takes a matrix and column, and returns corresponding minor matrix
   public int[][] getMinor(int[][] matrix, int order, int selectedCol)
   {
      // declares local variables
      int[][] minorMatrix = new int[order - 1][order - 1];
      int minorCol;

      // following for loops iterate through the original matrix and 
      // copies the values in each cell while skipping the selected column
      for (int row = 1; row < order; row++)
      {
         minorCol = 0;
         for (int col = 0; col < order; col++)
         {
            if (col != selectedCol)
            {
               minorMatrix[row - 1][minorCol] = matrix[row][col];
               minorCol++;
            }
         }
      }

      return minorMatrix;
   } // end getMinor

   // calculate method computes determinant of a square matrix recursively  
   public int calculate(int mat[][], int order)
   {
      int solution = 0; // container for the solution

      // Stopping case
      if (order == 1)
         return mat[0][0];

      // Following for loop illustrates the general case.
      for (int col = 0; col < order; col++)
      {
         if ((col % 2) == 0)
         {
            solution += mat[0][col]
                  * calculate(getMinor(mat, order, col), order - 1);
         } else
         {
            solution += (-1) * mat[0][col]
                  * calculate(getMinor(mat, order, col), order - 1);
         }

      }

      return solution;
   }// end calculate
} // end DetermionantCalc

