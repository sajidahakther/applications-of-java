public class ArrayQueue {

	// Initialising the front and back of the array, object array, maximum = 100.
	int front, back;
	 Object[] a;
	 public static final int m = 100;

	 // Size
	 int s = back;

	 public ArrayQueue(){
	  front = 0;
	  back = 0;
	  a = new Object[m];
	 }

	 // Returns the head of the queue
	 public Object head() {
	  return a[front];
	 }

	 // Returns the tail of the queue
	 public Object tail() {
		 return a[back - 1];
	 }

	 // Checks the front of the queue reaches the end then the front becomes 0.
	 public void leave(){
	  front++;
	  if(front == m) {
	     front = 0;
	  }
	  s = back - 1;
	 }
	 
	 // Add an element of the queue
	 public void join(Object obj){
	  a[back++] = obj;
	  if(back == m) {
	     back = 0;
	     }
	  s = back;
	 }

	 // Checks if the queue is empty
	 public boolean isEmpty(){
	  return front == back;
	 }

	 // Returns the size of the queue
	 public int s(){
		 return s;
	  }
}
