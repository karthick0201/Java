package Basic.staticExample.staticVariable;

public class Employee {

	String name;
	String id;
	static String company="zoho";

	public Employee(String name, String id, String company) {
		this.name = name;
		this.id = id;
		this.company = company;
	}

	static void  work() {
		System.out.println(/* name + */ "Employee is working");
	}
}
