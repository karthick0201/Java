package CollectionPratice.SortingInterfacePratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePratice2 {
	public static void main(String[] args) {

		ComparatorInterfacePratice2 cifp = new ComparatorInterfacePratice2();

		cifp.numberEmployeeSort();
	}

	void numberEmployeeSort() {
		List<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee("kat", "98000", 24);
		Employee e2 = new Employee("sneha", "65000", 22);
		Employee e3 = new Employee("iman", "54000", 25);
		Employee e4 = new Employee("bharath", "76000", 25);
		Employee e5 = new Employee("suriya", "71000", 22);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		System.out.println(al);
		// IF I NEED USER DEFININED SORT:
		/// * Collections.sort(al); */ --> thows Class cast exception

		// IMPLEMENT COMPARATOR IN DEMO CLASS AND SORT AND PASS OBJECT IN THIS
		// COLLECTIONS.SORT(LIST NAME,OBJ);
		// Sort via age
		ComparatorDemo ageSort = new ComparatorDemo();
		Collections.sort(al,ageSort);
		System.out.println("After Sort : \n------------------" + al);
		

	}
}

class Employee {
	String name;
	String salary;
	int age;

	public Employee(String n, String s, int age) {
		name = n;
		salary = s;
		this.age = age;
	}

	@Override
	public String toString() {

		return "\n" + this.name + " : " + this.age + " : " + this.salary;
	}
}

class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee a1=(Employee)o1;
		Employee a2=(Employee)o2;
		if (a1.age < a2.age)
			return -1;
		else if (a1.age > a2.age)
			return 1;
		else
			return 0;
	}

}
