package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListDS<E> implements ListADT<E> {

	Node<E> head = null, tail = null;
	int currentSize;
	
	// Adds the Object obj to the beginning of the list
	public void addFirst(E obj) {
		Node<E> newNode = new Node<E>(obj);
		if(head==null) 
		    head=tail=newNode;
		else { 
	       newNode.next=head;
	       head=newNode;
	       }		 
		
	    currentSize++;
	    }

	// Adds the Object obj to the end of the list
	public void addLast(E obj) {
		Node<E> newNode = new Node<E>(obj);
        if(head==null) 
          head=tail=newNode;
        else { 
          tail.next = newNode; 
          tail = newNode; 
          }
		
		currentSize++;
	    }

	// Removes the first Object in the list and returns it.
	// Returns null if the list is empty.
	public E removeFirst() {
		if (isEmpty())
			return null;
	
	    E tmp = head.data;
		
		if (head == tail)
		    head = tail = null;
		else {
		    Node<E> next = head.next;
		    head.next = null;
		    head = next;
		}
	  
		currentSize--;
		return tmp;
	    }

	// Removes the last Object in the list and returns it.
	// Returns null if the list is empty.
	public E removeLast() {
		if (head == null) {
			return null;
		}
		
		E tmp = tail.data; 
	    Node<E> previous, current;
		
		if (head == tail)
		    head = tail = null;
		else {
		    previous = null;
		    current = head;
		    while (current != tail) { 
		        previous = current;
    	        current = current.next;
    	        } 
            previous.next = null;
            tail = previous;
		    }
	        currentSize--;
		    return tmp;
	    }

	// Returns the first Object in the list, but does not remove it.
	// Returns null if the list is empty.
	public E peekFirst() {
		if (isEmpty())
			return null;
		return head.data;
	    }

	// Returns the last Object in the list, but does not remove it.
	// Returns null if the list is empty.
	public E peekLast() {
		if (isEmpty())
			return null;
		return tail.data;
	    }

	// Removes the first instance of thespecific Object obj from the list, if it
	// exists.
	// Returns true if the Object obj was found and removed, otherwise false
	public boolean remove(E obj) {
		Node<E> previous = null, current = head;
		while (current != null
				&& ((Comparable<E>)current.data).compareTo(obj) != 0) {
			previous = current;
			current = current.next;
		    }
		if (current == head) {
			removeFirst();
			return true;
		} else if (current == tail) {
			previous.next = null;
			tail = previous;
		} else
			previous.next = current.next;
			
		currentSize--;
		return true;
	    }

	// The list is returned to an empty state.
	public void makeEmpty() {
		head = tail = null;
	    }

	// Returns true if the list contains the Object obj, otherwise false
	public boolean contains(E obj) {
		Node<E> tmp = head;

		while (tmp != null) {
			if (((Comparable<E>)tmp.data).compareTo(obj) == 0)
				return true;
			tmp = tmp.next;
		    }
		return false;
	    }

	// Returns true if the list is empty, otherwise false
	public boolean isEmpty() {
		return head == null;
	    }

	// Returns true if the list is full, otherwise false
	public boolean isFull() {
		return false;
	    }

	// Returns the number of Objects currently in the list.
	public int size() {
		return currentSize;
	    }

	// Returns an Iterator of the values in the list, presented in
	// the same order as the list.
	public Iterator<E> iterator() {
		return new IteratorHelper<E>();
	    }

	// node class
	class Node<E> {
		Node<E> next;
		E data;

		public Node(E obj) {
			data = obj;
			next = null;
		    }
	    }

	class IteratorHelper<E> implements Iterator<E> {
		Node<E> iterPtr;

		public IteratorHelper() {
			iterPtr = (Node<E>)head;
		    }

		public boolean hasNext() {
			return iterPtr != null;
		    }

		public E next() {
			if (!hasNext())
				throw new NoSuchElementException();
			E temp = iterPtr.data;
			iterPtr = iterPtr.next;
			return temp;
		    }

		public void remove() {
			throw new UnsupportedOperationException();
		    }
	    }
    }
