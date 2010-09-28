package data_structures;

import java.util.Iterator;

public interface ListADT<E> extends Iterable<E> {


//  Adds the Object obj to the beginning of the list
    public void addFirst(E obj);

//  Adds the Object obj to the end of the list
    public void addLast(E o);

//  Removes the first Object in the list and returns it.
//  Returns null if the list is empty.
    public E removeFirst();

//  Removes the last Object in the list and returns it.
//  Returns null if the list is empty.
    public E removeLast();

//  Returns the first Object in the list, but does not remove it.
//  Returns null if the list is empty.
    public E peekFirst();

//  Returns the last Object in the list, but does not remove it.
//  Returns null if the list is empty.
    public E peekLast();

//  Removes the first instance of thespecific Object obj from the list, if it exists.
//  Returns true if the Object obj was found and removed, otherwise false
    public boolean remove(E obj);

//  The list is returned to an empty state.
    public void makeEmpty();

//  Returns true if the list contains the Object obj, otherwise false
    public boolean contains(E obj);

//  Returns true if the list is empty, otherwise false
    public boolean isEmpty();

//  Returns true if the list is full, otherwise false
    public boolean isFull();

//  Returns the number of Objects currently in the list.
    public int size();

//  Returns an Iterator of the values in the list, presented in
//  the same order as the list.
    public Iterator<E> iterator();

}

