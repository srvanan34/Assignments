package com.saro.immutable;




/**
 * Queue Interface
 * 
 * @author Saravanan
 * 
 * @param <T> Generic type element of the queue
 */
public interface Queue<T> {
	
	
	/**
	 * @param t generic type element of the queue
	 * @return the new queue once the insertion has done.
	 */
	public Queue<T> enQueue(T t);
	
	
	/**
	 * @return the new queue once the deletion has done.
	 * @throws Exception when queue is empty
	 */
	public Queue<T> deQueue() throws Exception;
	
	
	/**
	 * @return head element of the queue
	 * @throws Exception when queue is empty
	 */
	public T head() throws Exception;
	
	
	/**
	 * @return true when the queue is empty otherwise return false
	 */
	public boolean isEmpty();

}
