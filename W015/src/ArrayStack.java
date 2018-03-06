<<<<<<< HEAD

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

=======
//Question 1

import java.lang.*;

public class ArrayStack {

    // Creating a private object array, private integer count and initialising the maximum number to 100
    private Object[] a;
    private int c;
    public static final int m = 100;

    // The array first takes up the maximum value, and the counter starts off from 0
    public ArrayStack(Object[] a, int c) {
        a = new Object[m];
        c = 0;
    }

    public Object top() {
        return a[c - 1];
    }

    public void pop() {
        switch (c--) {
        }
    }

    public void push(Object obj) {
        a[c++] = obj;
    }

    public boolean isEmpty() {
        return c == 0;
    }
}
>>>>>>> f976d3d18f64aea3b203f3736c1930e5584962c7
