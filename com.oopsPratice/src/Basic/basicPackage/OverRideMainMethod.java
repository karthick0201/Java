package Basic.basicPackage;
/*WE CAN OVER LOAD MAIN METHOD
 * */
public class OverRideMainMethod {

	public static void main(String[] args) {
		System.out.println("Hello!!!");
		main(3,5);
		
		
	}
	public static void main(int a,int b) {
		int sum=a+b;
		System.out.println("Sum : " + sum);
	}
	public static void demo() {
		System.out.println("Demo");
	}
}
class CheckingDemo extends OverRideMainMethod{
	
}

