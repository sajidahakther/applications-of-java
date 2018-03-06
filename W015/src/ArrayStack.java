
public class ArrayStack {

	 // Creating a private object array, private integer count and initialising the maximum number to 100.
	 private Object[] a;
	 private int c;
	 public static final int m = 100;

	 public ArrayStack(){
		 	a = new Object[m];
		 	c = 0;
	 		}

	 // Returns the last added element (top)
	 public Object top() {
	 	return a[c - 1];
	 }

	 // Removes (pop) the last added element
	 public void pop(){
	 	c--;
	 }

	 // Add (push) the element to the stack
	 public void push(Object obj){
	 	a[c++] = obj;
	 }

	 // Returns the size of the stack
	 public int size(){ 
		 return c;
	 }

	 // Boolean checks if the stack is empty
	 public boolean isEmpty(){
	  return c == 0;
	 }

	 
}	 

