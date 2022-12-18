package com.StaticExample.pailagam;

public class StaticDemo {
	//CONSTRUCTOR
	public StaticDemo() {
		System.out.println("Hello from Constructor");
	}
	//STATIC BLOCK
	static {
		System.out.println("Hello from static block");
	}
	//NON - STATIC BLOCK
	{
		System.out.println("hello Non static block");
	}
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		System.out.println("Hello from Main method");
		
		StaticDemo staticDemo =new StaticDemo();
		System.out.println("-------------------------");
		
		//1.  try to call static method in non static place
		staticDemo.checkStaticMethods();
		// its working we can call static methods via  non static method
		
		/*2.  TRY TO CALL NONSTATIC METHODS IN STATIC MMETHOD*/
		
		//We cant call normal method in static block
		//Cannot make a static reference to the non-static method checkNotStaticMethod() from the type StaticDemo
		
		
		
		
	}
	//another STATIC METHOD:
	public static void sMethod2() {
		System.out.println("static method --> 2");
		//checkNotStaticMethod();
	}
	public void checkStaticMethods() {
		System.out.println("Non static method -1 ");
		sMethod2();
	}
	public void checkNotStaticMethod() {
		System.out.println("NonStatic method - 2");
	}
}
