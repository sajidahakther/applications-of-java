import java.util.*;

public class LinkedListQueue {

	LinkedList<Integer> QLL = new LinkedList<Integer>();

	// Adding the last node
	public void enqueue(int n) {
		QLL.addLast(n);
	}

	// Removing the first element of the queue
	public int dequeue() {
		int f = QLL.getFirst();
		 if(!QLL.isEmpty()) {
			 QLL.removeFirst();
		 }
		 // Returning the first element
		 return f;
	}

	//isEmpty property, checking the linked list, printing out true or false if the linked is Empty
	public void isEmpty() {
		if(QLL.isEmpty()) {
			System.out.println("True. The linked list is empty.");
		}else {
			System.out.println("False. The linked list isn't empty.");
		}
	}

	// Showing queue by creating a counter 'c' for the queue and the size 's' of the queue
	public void showQueue() {
		int c = 0;
		int s = QLL.size();

		// While the counter is not equal to the size of the queue
		// Print out the linked list counter, and then increment the counter
		while(c != s) {
			System.out.println(QLL.get(c));
			c++;
		}
	}

	// Adding elements into the linked list
	public static void main(String[] args) {
		LinkedListQueue QLLT = new LinkedListQueue();

		QLLT.enqueue(2);
		QLLT.enqueue(4);
		QLLT.enqueue(6);
		QLLT.enqueue(8);
		QLLT.enqueue(10);

		// Testing the queue properties
		QLLT.showQueue();
		QLLT.dequeue();
		QLLT.showQueue();
		QLLT.isEmpty();
	}
}


