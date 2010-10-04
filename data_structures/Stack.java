package data_structures;

import java.util.Iterator;

public class Stack<E> {
	
	private ListADT<E> stack;
	
	public Stack() {
		stack = new LinkedListDS<E>(); 
		}
	
	// inserts the object obj into the stack
	public void push(E obj) {
		stack.addFirst(obj); 
		}
	
	// pops and returns the element on the top of the stack
	public E pop() {
		return stack.removeFirst(); 
		}
     
     // returns the number of elements currently in the stack
	public int size() { 
		return stack.size(); 
		}

	// return true if the stack is empty, otherwise false  
	public boolean isEmpty() { 
		return stack.isEmpty();
		}

	// returns but does not remove the element on the top of the stack 
	public E peek() { 
		return stack.peekFirst();
		}        

	// returns true if the object obj is in the stack, otherwise false
	public boolean contains(E obj) {
		return stack.contains(obj);
		}
	      
	// returns the stack to an empty state 
	public void makeEmpty() { 
		stack.makeEmpty();
		}
	
	// returns a iterator of the elements in the stack.  The elements
	// must be in the same sequence as pop() would return them.   
	public Iterator<E> iterator() { 
		return stack.iterator();
		}
}