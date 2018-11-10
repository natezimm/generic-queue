/* Test class for the class
 * Will test all methods from queue
 */

package queue;

import queue.QueueEmptyException;
import queue.Queue;

public class QueueTest {
	public static void main(String[] args) {

		//Dynamically allocating memory for queue
		Queue<Integer> integerQueue = new Queue<>();
		
		try {
			
			//Adding 10 items (numbers 0-9) to the queue.
			for (int i = 0; i < 10; i++) {
				integerQueue.enqueue(i);}
			
			//Checking size, if queue is empty, and front item of queue.
			System.out.println("Queue size is : " + integerQueue.getsize());
			System.out.println("The queue is " + (integerQueue.isEmpty() ? "empty" : "not empty"));
			System.out.println("The front contains: " + integerQueue.getFront());
			
			//Removing five items from the queue.
			System.out.println();
			System.out.println("Dequeing:  ");
			for (int i = 0; i < 5; i++) {
			System.out.print(integerQueue.dequeue() + " ");
			System.out.println(); }
			
			//Checking size, if queue is empty, and front of queue after removing front 5 items.
			System.out.println("Queue size is : " + integerQueue.getsize());
			System.out.println("The queue is " + (integerQueue.isEmpty() ? "empty" : "not empty"));
			System.out.println("The front contains: " + integerQueue.getFront());
			
			//Adding 10 more items (numbers 10-19) to the queue.
			System.out.println();
			for (int i = 10; i < 20; i++) {
				integerQueue.enqueue(i);}

			//Checking size, if queue is empty, and front item of queue.
			System.out.println("Queue size is : " + integerQueue.getsize());
			System.out.println("The queue is " + (integerQueue.isEmpty() ? "empty" : "not empty"));
			System.out.println("The front contains: " + integerQueue.getFront());
			
			//Removing all the items from the queue until it is empty.
			System.out.println();
			System.out.println("Dequeing more:");
			while (!integerQueue.isEmpty()) {
				System.out.print(integerQueue.dequeue() + " ");
				System.out.println(); }
			
			System.out.println("Queue size is : " + integerQueue.getsize());
			System.out.println("The queue is " + (integerQueue.isEmpty() ? "empty" : "not empty"));

		} catch (QueueEmptyException e) {
			System.out.println("We tried to remove from an empty queue");

		}
		
	}

}

