package labOne;

/**
 * 
 * Following program uses stack, implemented using two queues, to determine if a
 * line of string in a given file is a palindrome.
 * 
 * @author jonghoonlee
 *
 */
public class IsPalindrome
{
   // declares variables
   private StackQ stackOne;
   private StackQ stackTwo;
   private int stackMidpoint;

   // declares constructor
   public IsPalindrome()
   {
      stackMidpoint = 0;
   }

   // Following method checks if the items in given stack's a palindrome 
   public boolean testStack(StackQ stack)
   {
      stackMidpoint = stack.getSize() / 2; // setting the midpoint for iterations
      stackOne = stack;
      stackTwo = new StackQ();

      for (int i = 0; i < (stackMidpoint); i++)
      {
         stackTwo.push(stackOne.pop());
      }

      // Following if statement evens out the size of each stack, which will
      // only occur if the size of the param stack is an odd number.
      if (stackOne.getSize() > stackTwo.getSize())
      {
         stackOne.pop();
      }

      for (int i = 0; i < (stackMidpoint); i++)
      {
         if (stackOne.pop() != stackTwo.pop())
         {
            return false;
         }
      }
      return true;
   }
}

