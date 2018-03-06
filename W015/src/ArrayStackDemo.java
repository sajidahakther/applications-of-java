
public class ArrayStackDemo {

	public static void main(String[] args) {
		
		ArrayStack testingStack = new ArrayStack();

		// Testing pushing numbers
		testingStack.push(2);
		testingStack.push(4);
		testingStack.push(6);
		testingStack.push(8);

		//Testing the properties
		System.out.println("top " + testingStack.top());
		System.out.println("size " + testingStack.size());
		System.out.println("Empty? " + testingStack.isEmpty());

		//Testing deleting from the stack
		testingStack.pop();

		//Printing out the top element of the stack
		System.out.println("top " + testingStack.top());

		//Printing out the size of the stack
		System.out.println("size " + testingStack.size());
	}
	
}
