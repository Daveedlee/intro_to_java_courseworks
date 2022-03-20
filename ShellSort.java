/**
 * Following class in an implementation of Shell sort. Contains only sort
 * method.
 * 
 * @author jonghoonlee
 *
 */
class ShellSort
{
   // declaring the global variable
   int[] sequence;
   int length;

   // inserting sequence and the length on the constructor
   public ShellSort(int length, int[] sequence)
   {
      this.length = length;
      this.sequence = sequence;
   } // end constructor

   // Following method sorts the given array using the sequence inserted at the
   // declaration.
   public int[] sort(int[] arr)
   {
      int currentSeq;
      int[] sortedArray = arr;

      for (int k = 0; k < 10; k++)
      {
         currentSeq = this.sequence[k];
         for (int i = currentSeq; i < this.length; i++)
         {
            int temp = sortedArray[i];
            int j = i;
            while ((j >= currentSeq) && (sortedArray[j - currentSeq] > temp))
            {
               sortedArray[j] = sortedArray[j - currentSeq];
               j -= currentSeq;
            }
            sortedArray[j] = temp;
         }
      }
      return sortedArray;

   } // end sort

} // end ShellSort
