package queue;

//Exception class for when queue is empty
public class QueueEmptyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QueueEmptyException() {
	super("Queue underflow encountered");
 
}
}
