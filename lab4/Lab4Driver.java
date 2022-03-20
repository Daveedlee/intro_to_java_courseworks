import java.io.*;
import java.util.Scanner;

public class Lab4Driver
{
   public static void main(String[] args) throws IOException
   {
      InputStream inputStream = null;
      FileWriter outputStream = null;
      Scanner s = null;
      QuickSort qs = null;
      ShellSort ss = null;

      int[] knuth =
      { 29524, 9841, 3280, 1093, 364, 121, 40, 13, 4, 1 };
      int[] seq2 =
      { 30341, 10111, 3371, 1123, 373, 149, 53, 17, 5, 1 };
      int[] seq3 =
      { 29160, 9720, 3240, 1080, 360, 120, 60, 30, 10, 1 };
      int[] seq4 =
      { 49392, 4938, 3172, 2043, 293, 100, 40, 20, 13, 1 };

      int length, currentNum;
      long startTime, endTime, timeTaken;

      try
      {
         outputStream = new FileWriter(args[1]); // output file
         inputStream = new FileInputStream(args[0]); // input file
         s = new Scanner(inputStream); // use scanner to process matrix
         s.useDelimiter("[[\\s]&&[^\\n]]+"); // whitespace, except newline
         length = Integer.parseInt(args[2]); // length
         int[] array = new int[length];
         currentNum = 0;

         while (true)
         { // read and process one character

            if (s.hasNextInt())
            {
               array[currentNum] = s.nextInt();
               currentNum++;

            } else
            {
               break;
            }
         }

         outputStream.write("Quicksorts:\n");

         qs = new QuickSort(100, length);
         startTime = System.nanoTime();
         int[] k100 = qs.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("k = 100: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + k100[i]);
            outputStream.write(" ");
         }

         qs = new QuickSort(50, length);
         int[] k50 = qs.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\n\nk = 50: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + k50[i]);
            outputStream.write(" ");
         }

         qs = new QuickSort(2, length);
         int[] k2 = qs.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\n\nk = 2: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + k2[i]);
            outputStream.write(" ");
         }

         outputStream.write("\n\nShell Sorts:");

         ss = new ShellSort(length, knuth);
         startTime = System.nanoTime();
         int[] sortedKnuth = ss.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\nKnuth: " + timeTaken + " nanoseconds\n");

         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + sortedKnuth[i]);
            outputStream.write(" ");
         }

         ss = new ShellSort(length, seq2);
         startTime = System.nanoTime();
         int[] sortedSeq2 = ss.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\n\nSequence 2: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + sortedSeq2[i]);
            outputStream.write(" ");
         }

         ss = new ShellSort(length, seq3);
         startTime = System.nanoTime();
         int[] sortedSeq3 = ss.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\n\nSequence 3: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + sortedSeq3[i]);
            outputStream.write(" ");
         }

         ss = new ShellSort(length, seq4);
         startTime = System.nanoTime();
         int[] sortedSeq4 = ss.sort(array);
         endTime = System.nanoTime();
         timeTaken = endTime - startTime;
         outputStream.write("\n\nMy Sequence: " + timeTaken + " nanoseconds\n");
         for (int i = 0; i < length; i++)
         {
            outputStream.write(" " + sortedSeq4[i]);
            outputStream.write(" ");
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

