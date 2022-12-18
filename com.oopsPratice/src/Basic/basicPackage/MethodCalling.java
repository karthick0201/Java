package Basic.basicPackage;

public class MethodCalling {

	public static void main(String[] args) {
		//We can't call non-static method  inside static method 
		//methodOne();
		MethodCalling mc=new MethodCalling();
		mc.methodOne();
		//Call another class method without creating object.
		SecondClass sc=new SecondClass();
		sc.secondClassMethod();
		
		
	}
	void methodOne() {
		System.out.println("Method one");
		methodTwo();
		
	}
	void methodTwo() {
		System.out.println("Method Two");
	}


}
class SecondClass extends MethodCalling{
	void secondClassMethod() {
		System.out.println("Second Class method");
		//Calling Method, without creating object 
		methodOne();
	}
}


