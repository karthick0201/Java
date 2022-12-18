package com.relationshipPratice.AssociationPratice;

public class AssocationStudentAddress {
	public static void main(String[] args) {
		Address a1=new Address("1","Main Road","Tamil Nadu");
		Student s1=new Student("karthi",a1);
		s1.getStudentDetails();
		
	}
}
class Address{
	private String number;
	private String street;
	private String state;
	Address(String number,String street, String state){
		this.number=number;
		this.street=street;
		this.state=state;
	}
	public String showAddress() {
		String add=number + " : " + street + " : " + state;
		return add;
	}
}
class Student{
	private String name;
	private Address address;
	Student(String name,Address address){
		this.name=name;
		this.address=address;
	}
	public void getStudentDetails(){
		System.out.println("Name : " + name);
		System.out.println(address.showAddress());
	}
	
	
}
