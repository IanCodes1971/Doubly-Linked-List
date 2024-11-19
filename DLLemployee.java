//corresponds with lab 1

public class DoublyLinkedListINT 
{
  // Nested class definition
  private static class Node
    {
      // Instance Variables
      private int element;
      private Node next;
      private Node prev;
      
      // Constructor
      public Node(int elem, Node prv, Node nxt)
      {
        element = elem;
        next = nxt;
        prev = prv;
      }
      // Methods
      // getElement
      public int getElement()
      {
        return element;
      }
      
      // setElement
      public void setElement(int elem)
      {
        element = elem;
      }
      
      // getNext
      public Node getNext()
      {
        return next;
      }
      // getPrev
      public Node getPrev()
      {
        return prev;
      }
      // setNext
      public void setNext(Node nxt)
      {
        next = nxt;
      }
      // setPrev
      public void setPrev(Node prv)
      {
        prev = prv;
      }
      
    }
  // Instance Variables
  private Node header;
  private Node trailer;
  private int size;
  
  // Constructor
  public DoublyLinkedListINT()
  {
    header = new Node(0, null, null);
    // set trailer->prev to head
    trailer = new Node(0, header, null);
    // set head->next to tail
    header.setNext(trailer);
    size = 0;
  }
  
  // Methods
  // getSize - return how many elements are in the list
  public int size()
  {
    return size;
  }
  
  // isEmpty - return true or false
  public boolean isEmpty()
  {
    return size == 0;
  }
  
  // getFirst (first) - return first element
  //    (what 'head' is pointing to)
  public int first()
  {
    if ( isEmpty() )
      return 0;
    // first element is one past header
    return header.getNext().getElement();
  }
  // getLast (last) - return last element
  //   ( what 'last' is pointing to)
  public int last()
  {
    if ( isEmpty() )
      return 0;
    // last element is before trailer
    return trailer.getPrev().getElement();
  }
  // ADDING ELEMENTS
  // addFirst - insert node at the head
  public void addFirst(int elem)
  {
    addBetween(elem, header, header.getNext());
  }
  
  // addLast - insert node at the tail
  public void addLast(int elem)
  { 
    addBetween(elem, trailer.getPrev(), trailer);
  }
  // removeFirst - delete first node, return its element  
  public int removeFirst()
  {
      if (isEmpty())
          return -1;
      return remove(header.getNext());
  }
  public int removeLast()
  {
      if (isEmpty())
          return -1;
      return remove(trailer.getPrev());
  }
  // Added node to the linked list between the given nodes
  private void addBetween(int elem, Node before, Node after)
  {
      // create and link new node
      Node newest = new Node(elem, before, after);
      
      // Fix prev and next links
      before.setNext(newest);
      after.setPrev(newest);
      
      size++;
  }
  
  // Removes the given node and returns it data element
  private int remove(Node node)
  {
      Node before = node.getPrev();
      Node after = node.getNext();
  
      before.setNext(after);
      after.setPrev(before);
      size--;
      return node.getElement();
  }
  
}