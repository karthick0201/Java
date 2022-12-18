package com.relationshipPratice.AggregationPratice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
 * AGGREGATION 
 * HAS A RELATIONSHIP
 * ONE WAY RELATIONSHIP
 * 
 * */
public class AggregationDemo {
	
	public static void main(String[] args) {
		
		Student s1=new Student("Karthi","cs");
		Student s2=new Student("sneka","cs");
		Student s3=new Student("suriya","bca");
		Student s4=new Student("iman","bca");
		//LIST OF STUDENTS:
		List<Student>cs=new ArrayList<Student>(Arrays.asList(s1,s2));
		List<Student>bca=new ArrayList<Student>(Arrays.asList(s3,s4));
		
		//DEPARTMENT OBJECT CREATION:
		Department d1=new Department("cs",cs);
		Department d2=new Department("bca",bca);
		
		//List of Departments
		
		List<Department> departments=new ArrayList<Department>(Arrays.asList(d1,d2));
		
		//INSTITUTE OBJECT CREATION:
		Institute i1=new Institute("Zoho",departments);
		
		//IF I WANT TOTOAL NO OF STUDENTS COUNT:
		int instituteStudentCount=i1.getStudentsCount();
		//PRINT STUDENT COUNT:
		System.out.println("Students COunt : " + instituteStudentCount);
		
		
	}
}
class Student{
	private String name;
	private String Department;
	Student(String name,String Department){
		this.name=name;
		this.Department=Department;
	}
	
}
class Department{
	
	private String departmentName;
	private List<Student> students;
	
	Department(String departmentName,List<Student> students){
		this.departmentName=departmentName;
		this.students=students;
	}
	
	public int getStudentsCount() {
		
		int sCount=students.size();
		
		return sCount;
	}
	
	
}
class Institute{
	private String institute;
	List<Department> departments;
	
	public Institute(String institute, List<Department>departments){
		this.institute=institute;
		this.departments=departments;
	}
	public int getStudentsCount(){
		int stdCount=0;
		Iterator i=departments.iterator();
		while(i.hasNext()) {
			Department d=(Department)i.next();
			stdCount+=d.getStudentsCount();
		}
		return stdCount;
		
	}
	
}
