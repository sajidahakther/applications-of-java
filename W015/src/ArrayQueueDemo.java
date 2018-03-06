
public class ArrayQueueDemo {

	public static void main(String[] args) {
		
		ArrayQueue testingQueue = new ArrayQueue();

		// Adding elements to the queue: 2,4,6,8,10.
		testingQueue.join(2);
		testingQueue.join(4);
		testingQueue.join(6);
		testingQueue.join(8);
		testingQueue.join(10);

	//Testing the queue properties: head, tail and size.
	System.out.println("head " + testingQueue.head());
	System.out.println("tail " + testingQueue.tail());
	System.out.println("size " + testingQueue.s());

	testingQueue.leave();
	
	System.out.println("head " + testingQueue.head());
	System.out.println("tail " + testingQueue.tail());
	System.out.println("size " + testingQueue.s());

	// Testing if the queue is empty and returning the boolean.
	System.out.println("empty? " + testingQueue.isEmpty());
	}
	
}
