/*
 * Name: Nang Chen
 * Login: cs12saw
 * PID: A14205066
 * Date: 04/28/2017
 * File: MyStack.java
 * 
 * This is a generic class that implements BoundedStack class. 
 * It includes all the push, pop and peek methods. 
 */

package hw4;

import java.util.*;

public class MyStack<E> implements BoundedStack<E> {
	private Deque12<E> deque;
	
	public MyStack(int n) {
		deque = new Deque12<E>(n);
	}

	/**
	 * Returns the capacity of this BoundedStack,that is, the maximum number of
	 * elements it can hold. <br>
	 * PRECONDITION: none <br>
	 * POSTCONDITION: the BoundedStack is unchanged.
	 * 
	 * @return the capacity of this BoundedStack
	 */
	public int capacity() {
		return deque.capacity();
	}

	/**
	 * Returns the number of elements in this BoundedStack. <br>
	 * PRECONDITION: none <br>
	 * POSTCONDITION: the BoundedStack is unchanged.
	 * 
	 * @return the number of elements in this BoundedStack
	 */
	public int size() {
		return deque.size();
	}

	/**
	 * Adds the specified element to the top of this BoundedStack. Returns true
	 * if the operation succeeded, else false. <br>
	 * PRECONDITION: the BoundedStack's size is less than its capacity. <br>
	 * POSTCONDITION: the element is now the top element in this BoundedStack,
	 * none of the other elements have been changed, and the size is increased
	 * by 1.
	 * 
	 * @param e
	 *            the element to add to the stack
	 * @return <tt>true</tt> if the element was added, else <tt>false</tt>.
	 * @throws NullPointerException
	 *             if the specified element is null, and size is less than
	 *             capacity
	 */
	public boolean push(E e) {
		return deque.addFront(e);
	}

	/**
	 * Removes the element at the top of this BoundedStack. Returns the element
	 * removed, or <tt>null</tt> if there was no such element. <br>
	 * PRECONDITION: the BoundedStack's size is greater than zero. <br>
	 * POSTCONDITION: the top element in this BoundedStack has been removed,
	 * none of the other elements have been changed, and the size is decreased
	 * by 1.
	 * 
	 * @return the element removed, or <tt>null</tt> if the size was zero.
	 */
	public E pop() {
		return deque.removeFront();
	}

	/**
	 * Returns the element at the top of this BoundedStack, or <tt>null</tt> if
	 * there was no such element. <br>
	 * PRECONDITION: the BoundedStack's size is greater than zero. <br>
	 * POSTCONDITION: The BoundedStack is unchanged.
	 * 
	 * @return the element at the top, or <tt>null</tt> if the size was zero.
	 */
	public E peek() {
		return deque.peekFront();
	}

}