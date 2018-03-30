	public class Outer {
		String S;

		/* Removing "static" from the Inner class and changing
        the Inner class to a public class like the Outer class
        will make the program compile. */

		class Inner {
			 void testMethod() {
				S = "Inner";
			}
		}
	}
