package CollectionPratice.BasicCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPratice1 {
	public static void main(String[] args) {
		List l=new ArrayList(Arrays.asList(1,2,3,'a','b',"hello","karthi",true,false,new Employee("Kat","101",98000)));
		//PRINT STATEMENTS:
//		--------------------
		// TYPE -1
		System.out.println("TYPE 1 : \n" + l);
		//TYPE -2:
		System.out.println("TYPE - 2: ");
		for(Object o: l) {
			System.out.print(o + " " );
		}
		
		
		//TYPE -3: ITERATOR
		System.out.println("\nTYPE 3 : ");
		Iterator i= l.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
		
		
		
	}
}
class Employee{
	String name;
	String id;
	int salary;
	public Employee(String name,
	String id,
	int salary) {
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
