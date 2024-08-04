// Write a function detectLoop() that checks whether a given Linked List contains a loop. If the loop is present then it returns point to the first node of the loop. Else it returns NULL.
import java.util.*;
class Main{

static class Node 
{
  int key;
  Node next;
};

static Node newNode(int key)
{
  Node temp = new Node();
  temp.key = key;
  temp.next = null;
  return temp;
}

// A utility function to 
// print a linked list
static void printList(Node head)
{
  while (head != null) 
  {
    System.out.print(head.key + " ");
    head = head.next;
  }
  System.out.println();
}

static Node detectLoop(Node head)
{
  if (head == null || head.next == null)
    return null;
 Node fast=head;
 Node slow=head;
 Node ans;
 slow = slow.next;
 fast = fast.next.next;
 while(fast.next!=null && fast!=null){
   if(fast==slow){
    break;
  }
  fast=fast.next.next;
  slow=slow.next;
 
 }
 if (slow != fast)
    return null;

  // If loop exists. Start slow from
  // head and fast from meeting point.
  slow = head;
  while (slow != fast) 
  {
    slow = slow.next;
    fast = fast.next;
  }

  return slow;
}

// Driver code
public static void main(String[] args)
{
  Node head = newNode(50);
  head.next = newNode(20);
  head.next.next = newNode(15);
  head.next.next.next = newNode(4);
  head.next.next.next.next = newNode(10);

  // Create a loop for testing
  head.next.next.next.next.next = head.next.next;

  Node res = detectLoop(head);
  if (res == null)
    System.out.print(res);
  else
    System.out.print(res.key);
}
}
