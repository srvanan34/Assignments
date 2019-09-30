package com.saro.immutable;


/**
 * Stack Interface
 * 
 * @author Saravanan
 * 
 * @param <T> Generic type element of the stack
 */
public interface Stack<T> {
	
	
	/**
	 * @param t generic type element of the stack
	 * @return the new stack once the insertion has done.
	 */
	public Stack<T> push(T t);
	
	
	/**
	 * @return the new stack once the deletion has done.
	 * @throws Exception when stack is empty
	 */
	public Stack<T> pop() throws Exception;

	
	/**
	 * @return head element of the stack
	 * @throws Exception when stack is empty
	 */
	public T head() throws Exception;

	
	/**
	 * @return true when the stack is empty otherwise return false
	 */
	public boolean isEmpty();

}
