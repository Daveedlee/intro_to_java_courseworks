/**
 * Following class is an implementation of doubly linked list with head and tail
 * pointer. It, however, contains two methods, which are adding a node to the
 * end and swapping nodes.
 * 
 * @author jonghoonlee
 *
 */
public class DoublyLinkedList
{
   NodeDoubly head, tail;

   // Following method adds a node to the end of linked list
   public void append(int new_data)
   {
      NodeDoubly newNode = new NodeDoubly(new_data);
      NodeDoubly last = this.head;

      newNode.next = null;

      // When the list is empty
      if (this.head == null)
      {
         newNode.prev = null;
         this.head = newNode;
         return;
      }

      // moving to the end of the list otherwise
      while (last.next != null)
      {
         last = last.next;
      }

      last.next = newNode;
      newNode.prev = last;
      this.tail = newNode;
   } // end append()

   // Following method takes in two parameters and swap their position
   public void swap(int dataA, int dataB)
   {
      // keeping tracker for each
      NodeDoubly prevX = null;
      NodeDoubly currX = this.head;

      while ((currX != null) && (currX.data != dataA))
      {
         prevX = currX;
         currX = currX.next;
      }

      NodeDoubly prevY = null, currY = head;
      while ((currY != null) && (currY.data != dataB))
      {
         prevY = currY;
         currY = currY.next;
      }

      if (currX == null || currY == null)
      {
         return;
      }

      // If x is not head of linked list
      if (prevX != null)
      {
         prevX.next = currY;
      } else
      {
         this.head = currY;
      }

      // If y is not head of linked list
      if (prevY != null)
      {
         prevY.next = currX;
      } else
      {
         this.head = currX;
      }

      NodeDoubly temp = currX.next;
      currX.next = currY.next;
      currY.next = temp;
   } // end swap()

} // end DoulbyLinkedList

