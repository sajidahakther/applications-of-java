public class Employee {

	/* Private variables for the ID numbers, name of person, sex and salary. */
	private int ID;
	private String Name;
	private String Sex;
	private double Salary;

	/* Public variables for the house number, street, city, post code. */
	public int HouseNumber;
	public String Street;
	public String City;
	public String PostCode;

	public Employee() {
		// The main constructor class
	}

	// Created a constructor Employee where each of the private variables are being initialised.
	public Employee(int ID, String Name, String Sex, double Salary) {
		this.ID = ID;
		this.Name = Name;
		this.Sex = Sex;
		this.Salary = Salary;
	}

	// Created a constructor employeeAddress where each of the public variables are being initialised.
	public void employeeAddress(int HouseNumber, String Street, String City, String PostCode) {
		this.HouseNumber = HouseNumber;
		this.Street = Street;
		this.City = City;
		this.PostCode = PostCode;
	}

	// Printing out the employees' data; ID number, name, sex and salary.
	public void printInfo() {
		System.out.println("ID: " + ID + " Name: " + Name + " Sex: " + Sex + " Salary: " + Salary);
	}

	// Printing out the Address of the employee
	public void printall() {
		printInfo();
		System.out.println("[Address]");
		System.out.println("House no: " + HouseNumber);
		System.out.println("Street: " + Street);
		System.out.println("City: " + City);
		System.out.println("Post code: " + PostCode);
	}

	// The class Address extends the class Employee, to create more variables.
	public class Address extends Employee {
		int HouseNumber;
		String Street;
		String City;
		String PostCode;

		// Initialising the address variables within the Address constructor. The method 'super' is being used for Inheritance.
		public Address(int HouseNumber, String Street, String City, String PostCode) {
			super();
			this.HouseNumber = HouseNumber;
			this.Street = Street;
			this.City = City;
			this.PostCode = PostCode;
		}
	}
}