/**
 * Following class is an implementation of Insertion sort.
 * 
 * @author jonghoonlee
 *
 */
public class InsertionSort
{
   // Following method takes in an array and its length as parameters.
   // Returns a sorted array using insertion sort.
   public int[] sort(int[] array, int length)
   {
      int[] sortedArray = array;

      for (int i = 1; i < length; i++)
      {
         int key = sortedArray[i];
         int j = i - 1;

         while ((j >= 0) && (sortedArray[j] > key))
         {
            sortedArray[j + 1] = sortedArray[j];
            j--;
         }
         sortedArray[j + 1] = key;
      }

      return sortedArray;

   } // end sort

} // end InsertionSort
