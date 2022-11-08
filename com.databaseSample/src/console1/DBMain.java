package console1;

import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("\t DB-1\n\t------nothhhh--");
			
			System.out.println("1. Login\n2. Register\n3. Display\n4. Exit");
			System.out.print("-----------------------\nEnter Your Choice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("Login Processing...");
//				RegisterUser.registerUser("kar",123);
				System.out.println("Checking...");
				break;
			case 2 : 
				System.out.println("Resgister Processing...");
				break;
			case 3 : 
				System.out.println("Display All Details Processing....");
				break;
			case 4 : 
				System.out.println("Thank You!!!");
				check=false;
				break;
				default:
					System.out.println("Wrong Option!!!");
			}
		}
	}

}
