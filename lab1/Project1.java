package labOne;

import java.io.*;


/**
 * 
 * Following program uses stack, implemented using two queues, to determine if a
 * line of string in a given file is a palindrome.
 * 
 * @author jonghoonlee
 *
 */

public class Project1
{
   public static void main(String[] args) throws IOException
   {
      // declare a stack for character
      StackQ stackOrig = new StackQ(); 
      // declare isPalindrome for check
      IsPalindrome palinTest = new IsPalindrome(); 

      // declare I/O
      FileWriter outputStream = null;
      InputStream inputStream = null;
      InputStreamReader inputStreamReader = null;
      BufferedReader bufferedReader = null;
      
      try
      {
         inputStream = new FileInputStream(args[0]); //input file
         outputStream = new FileWriter(args[1]); // output file
         inputStreamReader = new InputStreamReader(inputStream);
         bufferedReader = new BufferedReader(inputStreamReader);

         int c; // value read from file
         char charValue; // character value read from file

         while ((c = bufferedReader.read()) != -1)
         { // read and process one character
            charValue = (char) c;

            // Following specifies which characters to consider at the unicode level
            if (((c >= 33) & (c <= 38)) | ((c >= 48) & (c <= 57))
                  | (((c >= 65) & (c <= 90)) | ((c >= 97) & (c <= 122))))
            {
               // if appropriate, then pushed into the stack
               stackOrig.push(Character.toLowerCase(charValue));
            }

            // if the end of the line is detected, then check if the stack's palindrome
            if ((charValue == '\n'))
            {
               // if stack's empty, write an empty line.
               if (stackOrig.isEmpty())
               {
                  outputStream.write('\n');
               } else
               {
                  // if the stack is palindrome, write True
                  if (palinTest.testStack(stackOrig))
                  {
                     outputStream.write("True\n");
                  } else
                  {  // write False if not palindrome
                     outputStream.write("False\n");
                  }
               }
               // clear the stack for next line
               stackOrig = new StackQ();
            }
         }
         // Because the last line in the input file won't have \n to execute
         // the palindrome test, if-else statement is re-written here.
         if (palinTest.testStack(stackOrig))
         {
            outputStream.write("True");
         } else
         {
            outputStream.write("False");
         }
      } finally
      {
         if (inputStream != null)
            inputStream.close();
         if (outputStream != null)
            outputStream.close();
      }

   } // end main

} // end Project1

