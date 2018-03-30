public class Anonymous implements Length {

	int x = 8;

	// Prints out the sides, string "y" and "x"
	public void printSide(String message) {
		System.out.print(message);
	}

	// Prints out the number; the length of y and x
	public void printNumber (int i) {
		System.out.print(i);
	}
	
	public static void main(String[] args) {

		// Inheriting the abstract methods from the interface class Length
		Anonymous length = new Anonymous();
		
		length.printSide("y");
		length.printNumber(Length.x);
		length.printSide("x");
		length.printNumber(10);
	}
}
