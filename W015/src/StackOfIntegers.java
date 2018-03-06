import java.util.*;

public class StackOfIntegers {

	// Initialising integers first element and second element
	public static int secondFromTop(Stack<Integer> stackInt) {
		int f = stackInt.pop(); //
		int s = stackInt.pop();

		// Pushing the second element and then the first element
		stackInt.push(s);
		stackInt.push(f);

		// Popping the second element
		return s;
	}

	// Takes a stack of integers as arguements and then returns a reversed stack.
	public static Stack<Integer> reverseStack(Stack<Integer> r) {
		Collections.reverse(r);
		return r;
	}

	public static void main(String[] args) {
		Stack<Integer> tempStack = new Stack<Integer>();

		// Pushing elements into the stack
		tempStack.push(2);
		tempStack.push(4);
		tempStack.push(6);
		tempStack.push(8);
		tempStack.push(10);
		tempStack.push(12);

		// Printing the stack, the second element from the top, and the reversed stack.
		System.out.println("The complete stack: " + tempStack);
		System.out.println("The second element from the top of the stack: " + secondFromTop(tempStack));
		System.out.println("The reversed stack: " + reverseStack(tempStack));
	}
	
}
