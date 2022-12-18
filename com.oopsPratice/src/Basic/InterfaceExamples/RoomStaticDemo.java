package Basic.InterfaceExamples;

/*STATIC DATA CHECK: STATIC DATA ACCESS IN EXTENDS VS IMPLEMENTS
 * -----------------
 * IF EXTENDS ONE CLASS TO ANOTHER CLASS WE CAN USE PARENT CLASS STATICK METHOD USING BASE CLASS NAME
 * IF IMPLEMENTS ONE CLASS TO ANOTHER CLASS WE ONLY USE CORRESPONDING CLASS TO ACCESS STATIC DATA...
 * 
 * */

public class RoomStaticDemo {
	public static void main(String[] args) {
		staticCheckDemo scd=new staticCheckDemo();
		scd.method1();
		
		//staticCheckDemo.method2();
		staticCheck.method2();
		
	}

}
interface staticCheck{
	void method1();
	static void method2() {
		System.out.println("Static method");
	}
}
class staticCheckDemo implements staticCheck{

	@Override
	public void method1() {
		System.out.println("Method 1 definition");
		
	}
	
}






