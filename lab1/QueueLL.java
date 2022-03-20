package labOne;

/**
 * Following static class implements queue data structure using linked list.
 * Because its written to serve as underlying data structure for stack, it's
 * written to bare minimum: only contains enqueue, and dequeue methods.
 * 
 * @author jonghoonlee
 *
 */
public class QueueLL
{
   // declaring variables
   public QueueNode front;
   public QueueNode back;

   // for a simple node to be used as a singly-linked list
   public class QueueNode
   {
      char data;
      QueueNode next;

      public QueueNode(char data)
      {
         this.data = data;
         this.next = null;
      }
   } // end QueueNode

   // constructor
   public QueueLL()
   {
      this.front = null;
      this.back = null;
   } // end QueueLL

   /**
    * Enqueues a variable to the queue.
    * 
    * @param a character with the char data type
    */
   public void enqueue(char x)
   {
      QueueNode temp = new QueueNode(x); // Create a temporary node to store a given char

      // Following if-statement captures the case where
      // the queue is empty
      if (this.back == null)
      {
         this.front = temp;
         this.back = temp;

         return; // breaks
      } else
      {
         this.back.next = temp;
         this.back = temp;
      }

   } // end enqueue()

   /**
    * dequeues (FIFO)
    */
   public void dequeue()
   {
      // if the queue is empty, break
      if (this.front == null)
      {
         return;
      } else
      {
         this.front = this.front.next;
      }

   } // end dequeue()
}
// end QueueLL
