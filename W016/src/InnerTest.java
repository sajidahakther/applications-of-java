public class InnerTest {

	/* The InnerTest class contains the main method; where the code is being executed from. */

	public static void main(String[] args) {

		// Creating an Employee, with the ID 1000, with the name James G, sex being male, and salary of 32000.0
		Employee emp = new Employee(1000, "James G", "M", 32000.0);

		// Assigning an address to the employee
		emp.employeeAddress(26, "St. James", "London", "SE14 6NW");

		// The employee's info is all being printed out through this method
		emp.printall();
	}
}