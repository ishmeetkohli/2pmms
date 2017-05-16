package bean;

public class TaxPayer {
	String firstName;
	String lastName;
	String sin;
	int salary;

	public TaxPayer(String sin, String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sin = sin;
		this.salary = salary;
	}
}
