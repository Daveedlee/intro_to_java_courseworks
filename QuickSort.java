/**
 * Following class is an implementation of QuickSort based on the lecture.
 * 
 * 
 * @author jonghoonlee
 *
 */
public class QuickSort
{
   int uPMove, dPMove, k, length;
   InsertionSort insertionSort;

   public QuickSort(int k, int length)
   {
      this.k = k;
      this.length = length;
   } // end constructor

   public int[] sort(int array[])
   {
      int middle = (this.length / 2) - 1;
      int cycle = 0;
      int pivot = array[middle];
      this.dPMove = 0;
      this.uPMove = 0;
      insertionSort = new InsertionSort();
      int[] sortedArray = array;
      int downPointer = 0;
      int upPointer = this.length - 1;

      if (k >= this.length)
      {
         return insertionSort.sort(sortedArray, this.length);

      } else
      {
         while (upPointer != downPointer)
         {
            if (sortedArray[upPointer] >= pivot)
            {
               upPointer--;
               this.uPMove++;
            }
            if (cycle == 0)
            {
               sortedArray[middle] = sortedArray[upPointer];
            } else
            {
               sortedArray[downPointer] = sortedArray[upPointer];
            }

            if (sortedArray[downPointer] <= pivot)
            {
               downPointer++;
               this.dPMove++;
            }

            sortedArray[upPointer] = sortedArray[downPointer];

            cycle++;
         }
         sortedArray[downPointer] = pivot;
      }
      return sortedArray;

   } // end sort
} // end QuickSort

