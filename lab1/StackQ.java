package labOne;

import labOne.QueueLL.QueueNode;

/**
 * QueueStack uses the QueueLL above to implement the stack data structure
 * contains a bit more than queue, but still very minimalistic. Because it's
 * using two queues, instead of setting a pointer for top to determine the size,
 * I've added the size variable that adds and subtracts when the method
 * enqueue/dequeue's called. Contains: push, pop, getSize, and isEmpty methods.
 * 
 * @author jonghoonlee
 *
 */

public class StackQ
{
   // declaring the variables
   private QueueLL QueueOne;
   private QueueLL QueueTwo;
   private int size;

   // constructor - setting the size to 0
   public StackQ()
   {
      this.QueueOne = new QueueLL();
      this.QueueTwo = new QueueLL();
      this.size = 0;
   } // end QueueStack()

   /**
    * takes a character, pushes to the stack by adding an item to the first queue.
    * 
    * @param a character data type.
    */
   public void push(char x)
   {
      QueueOne.enqueue(x); // adds an item to the first queue
      this.size++; // the stack's size is increased by one
   } // end push()

   /**
    * Pops the stack by adding all the items stores in the QueueOne except for the
    * last item to QueueTwo, then returns that last item. The last item is stored
    * separately and returned. QueueOne is replaced by QueueTwo (QueueOne =
    * QueueTwo), then QueueTwo is cleared.
    * 
    * @return a character data type popped from the stack.
    */
   public char pop()
   {
      // Following if statement checks for the current status
      // of the Queue - empty or full. If full, by how much?
      if (QueueOne.front == null)
      {
         // if empty, then return null
         return (char) 0;
      } else
      {
         // This while loop iterates QueueOne's item one by one and enqueues them
         // into QueueTwo. When there isn't a next item in the queue, which indicates
         // that
         // we're at the last node, iteration stops.
         while (QueueOne.front.next != null)
         {
            QueueTwo.enqueue(QueueOne.front.data);
            QueueOne.dequeue();
         }

         // poppedItem is declared and the last item in the first queue is stored
         char poppedItem = QueueOne.front.data;

         QueueOne = QueueTwo; // QueueOne is re-populated by QueueTwo
         QueueTwo = new QueueLL(); // QueueTwo is cleared
         this.size--; // The stack's size is reduced by one

         return poppedItem;
      }
   } // end pop()

   /**
    * returns the current size of the stack
    * 
    * @return the size of current stack in an integer data type
    */
   public int getSize()
   {
      return size;
   } // end getSize()

   /**
    * checks if the stack is empty or not, and returns true/false based on the
    * check.
    * 
    * @return true or false in boolean
    */
   public boolean isEmpty()
   {
      // Following if-else statement returns true if the stack's empty
      // and false otherwise.
      if ((QueueOne.front == null))
      {
         return true;

      } else
      {
         return false;
      }
   } // end isEmpty()
}

