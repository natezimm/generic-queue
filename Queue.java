/* This program demonstrates understanding of the 
 * operation of a queue. It shows how to use dynamic
 * memory allocation in the Java language.
 */

package queue;

public class Queue<T> {

	private class Node {
		T item;
		Node next;
		Node(T item) {
			this.item = item;
			this.next = null;
		}
	}
	
	//Constructors
	private int size = 0;
	private Node front = null;
	private Node rear = null;

	//Adds items to the back of the queue
	public void enqueue(T item) {
		Node previousRear = rear;
		rear = new Node(item);
		rear.item = item;
		rear.next = null;
		if (isEmpty()) 
			front = rear;
		else 
			previousRear.next = rear;		
		size++;
	}
	
	//Removes items from the front of queue
	public T dequeue() {
		if (isEmpty()) {
			throw new QueueEmptyException();		
		}
		T item = front.item;
		front = front.next;
		size--;
		return item;
	}
	
	//Returns the first item in the queue
	public T getFront() {
		if (isEmpty()) {
			throw new QueueEmptyException();		
		}
		return front.item;
	}

	//Returns the size of the queue
	public int getsize() {
		return size;
	}
	
	//Returns true if queue is empty. False if not empty.
	public boolean isEmpty() {
		return size == 0;
	}
	
	//Removes items from queue
	protected void finalize() {
		while (!isEmpty())
			dequeue();
	}
}
