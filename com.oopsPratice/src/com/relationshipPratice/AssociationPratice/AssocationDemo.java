package com.relationshipPratice.AssociationPratice;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;


/*
 * One to Many Relationship
 *--------------------------
 *Bank class assocated with Employee class via objects
 * 
 * */
public class AssocationDemo {

	public static void main(String[] args) {
		Bank bank=new Bank("Zoho");
		Employee e1=new Employee("Karthi");
		Employee e2=new Employee("Vijay");
		Employee e3=new Employee("Rafi");
		Set<Employee> employees=new HashSet<Employee>(Arrays.asList(e1,e2,e3));
		//System.out.println(employees);
		bank.setEmployees(employees);
		System.out.println(bank.getEmployees());
		
	}

}
class Bank{
	private String bankName;
	private Set<Employee> employees;
	
	public Bank(String bankName){
		this.bankName=bankName;
		
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees=employees;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	
}
class Employee{
	private String name;
	Employee(String name){
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		
		return " "+this.name ;
		
	}
}
