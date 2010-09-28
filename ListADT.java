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
