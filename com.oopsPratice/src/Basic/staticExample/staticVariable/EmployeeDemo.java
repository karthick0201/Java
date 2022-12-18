package Basic.staticExample.staticVariable;

public class EmployeeDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee("karthi", "1", "zoho");
		Employee e2 = new Employee("rafi", "1", "zoho");
		Employee e3 = new Employee("mani", "1", "zoho");
		System.out.println(Employee.company);
		Employee.work();

	}
}
