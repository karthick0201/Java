package Basic.basicPackage;

public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		r1.area();
		r2.area();
		char A='A'; // 65
		char B='B'; // 66
		
		System.out.println(A + " \n" + B );
		System.out.println(A+B);
	}
}
class Rectangle{
	private int length;
	private int breadth;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void area() {
		System.out.println("Area : " + length*breadth);
	}
}
