package Basic.basicPackage;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student("John",2);
		s1.display();
	}

}
class Student{
	private String name;
	private int rollNo;
	/*IF WE DONT USE THIS KEYWORD 
	 * * ITS NOT ERROR CAME....
	 * * ONE WARNING SHOW--> "Name has no effects..."
	 * 
	 * */
	public Student(String name, int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + rollNo);
	}
}
