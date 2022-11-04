package suriyaLoginPage;
import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception {
		System.out.println("!!W E L C O M E!!");
		Main m = new Main();
		m.display();
	}
	public void display() throws Exception {
		Main m = new Main();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1 to LogIn! \n Enter 2 to Register");
		int num=in.nextInt();
		while(num>=0){
			switch (num) {
			case 1:
				System.out.print("Username : ");
				 String name=in.next();
				 System.out.print("Password : ");
				 String password=in.next();
				 logIn obj=new logIn(name,password);
				 System.out.println("--------------");
				 m.display();
				 break;
			case 2:
				System.out.print("Enter your name");
				String Ename=in.next();
				System.out.print("Enter password");
				String Epassword=in.next();
				register obj1=new register(Ename,Epassword);
				System.out.println("--------------");
				 m.display();
				 break;
			case 0:
				m.display();
				break;
			default:
				m.display();
				break;
			}
		}while(num!=0);
		in.close();
	}
}
