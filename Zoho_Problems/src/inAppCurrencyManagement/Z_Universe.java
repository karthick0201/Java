package inAppCurrencyManagement;

import java.util.Scanner;

public class Z_Universe {
	
	
	static Z_Universe zuni=new Z_Universe();
	static Scanner in = new Scanner(System.in);
	static ZCoinExchange zcoinExchange = new ZCoinExchange();
	
	public static void main(String[] args) {
		/**Default **/
		User u=new User("Karthick","karthick@123","8072036304","12","karthick#123",12);
		User u2=new User("sneha","sneha@123","234567","13","sneha#123",13);
		ZCoinExchange.users.put(u.getEmail(), u);
		ZCoinExchange.users.put(u2.getEmail(), u2);
		
		/***********************/
		
		Z_Universe zUniClass = new Z_Universe();
		ZCoinExchange zcoinExchange = new ZCoinExchange();
		Scanner in = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("\tZ-UNIVERSE");
			System.out.println("1. Admin Login\n2. User Login\n3. Register\n4. Exit");
			System.out.println("-----------------------------");
			System.out.println("Enter Your Choice : ");

			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Admin Login");
				adminLogin();
				break;
			case 2:
				
				System.out.println("-------User Login Page--------");
				userLogin();
				break;
			case 3:
				System.out.println("<-----Register Page------> ");
				zUniClass.newUser();
				
				break;
			case 4:
				System.out.println("Thank You!!!");
				check = false;
				break;
			case 5:
				zcoinExchange.display1();
				
				break;
			case 6:
				zcoinExchange.display2();
				break;
				
			default:
				System.out.println("Wrong Input...");
			}

		}
	}

	private void newUser() { 
		String name,email,mobile,hId,password;
		int Rs,zCoin;
		System.out.println("Enter Your Name : ");
		name=in.next();
		System.out.println("Email : ");
		email=in.next();
		System.out.println("Mobile : ");
		mobile=in.next();
		System.out.println("hId : ");
		hId=in.next();
		System.out.println("Enter Password : --> (Length : '8' Spcl Char : '!#%?><&*')");
		password=in.next();
		boolean pswCheck=vaildatePassword(password);
		while(pswCheck==false) {
			System.out.println("Password Not Strong!!!");
			System.out.println("Length : '8' Spcl Char : '!#%?><&*'");	
			System.out.println("Re-Enter Password : ");
			password =in.next();
		}
		System.out.println("Password Strong!!!");
		
		
		User temp=new User(name,email,mobile,hId,password);
		System.out.println("status : " + ZCoinExchange.bendingStatus.isEmpty() );
		//register to zcoin--> 
		ZCoinExchange.bendingStatus.put(email, temp);
		System.out.println("status : " + ZCoinExchange.bendingStatus.isEmpty() );
		System.out.println("Register Successfull");
		System.out.println("Waiting for admin Response...\n Note : after only you login!!!");
		System.out.println("Thanks for Register");
	}

	private static void userLogin() { 

		System.out.println("Email : ");
		String email=in.next();
		System.out.println("Password : ");
		String password=in.next();
		//vaildate
		boolean check = zcoinExchange.vaildateUser(email,password);
		if(check==true) {
			System.out.println("Welcome!!!");
			zuni.userProfile(email);
		}else {
			System.out.println("Invaild!!!");
		}
		
	}

	private void userProfile(String email) {
		/**************get user objecct************/
		User u=ZCoinExchange.users.get(email);
		Scanner in=new Scanner(System.in);
		System.out.println("<----USER PROFILE---->");
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("1. ProfileDetails\n2. Display Wallet\n3. Transaction History\n4. Change Password\n5. Deposit\n6. Withdraw\n7. RsToZCoin\n8. Transfer\n9. Exit");
			System.out.println("Enter Your Choice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("<---------Profile Details--->");
				u.display();
				break;
			case 2:
				System.out.println("<<------wallet Information------>");
				System.out.println("Real Money : " + u.getRealCurrency());
				System.out.println("Z-Coin     : " + u.getzCoin());
				break;
			case 3:
				System.out.println("Transaction History!!!");
				System.out.println("Account Created With balance of 10,000\\-");
				break;
			case 4:
				System.out.println("<---Password Sesction---->");
				System.out.println("Enter New Password : ");
				String psw=in.next();
				boolean pswCheck=vaildatePassword(psw);
				while(pswCheck==false) {
					
					System.out.println("Length : '8' Spcl Char : '!#%?><&*'");	
					System.out.println("Re-Enter Password : ");
					psw =in.next();
				}
				u.setPassword(psw);
				System.out.println("Password Updated Successfull");
				break;
			case 5:
				System.out.println("<------Deposit------->");
				System.out.println("Enter Money to Deposit : ");
				int money=in.nextInt();
				u.setRealCurrency(u.getRealCurrency() + money);
				System.out.println("AMount Deposited SUccessfully!!!");
				break;
			case 6:
				System.out.println("Your Balance : " + u.getRealCurrency());
				System.out.println("<-------WithDraw------->");
				System.out.println("Enter Money to WithDraw : ");
				 money=in.nextInt();
				if(u.getRealCurrency() > money-1000) {
					u.setRealCurrency(u.getRealCurrency()-money);
					System.out.println("Money Withdraw Successfull!!!");
				}
				break;
			case 7:
				System.out.println("Your Balance : " + u.getRealCurrency());
				System.out.println("<------Rupees To Coin-------> ");
				System.out.println("Enter Rupees to Buy Z-Coin : ");
				
				int amount=in.nextInt();
				if(u.getRealCurrency() > amount-1000) {
					System.out.println("Rs ----> To -----> Z-Coin Converted Successfull!!!");
					u.setRealCurrency(u.getRealCurrency()-amount);
					u.setzCoin(u.getzCoin() + (amount/2));
					
				}else {
					System.out.println("Minmum balance Affected!!!");
				}
				
				break;
			case 8:
				break;
			case 9:
				System.out.println("Thank You!!!");
				return;
			}
		}
		
	}

	private static void adminLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("Email Id : ");
		String email, password;
		email = in.next();
		System.out.println("Password : ");
		password = in.next();

//		while(vaildatePassword(password)==false) {
//			System.out.println("Re-enter Password");
//			password=in.next();
//		}

		boolean check = ZCoinExchange.authenticateAdmin(email, password);
		if (check == true) {
			System.out.println("Login SUccessfull!!!");
			adminPage();
		} else {
			System.out.println("Invaild Id and Pasword!!!");
		}
	}

	private static boolean vaildatePassword(String password) {
		char A[]=password.toCharArray();
		int n=A.length;
		if(password.length() <7) {
			System.out.println("Lingth missing");
			return false;
		}
		System.out.println("checking");
		int flag=0;
		for(int i=0;i<n;i++) {
			if(A[i]=='!' || A[i]=='#' || A[i]=='%' || A[i]=='?' || A[i]=='>' || A[i]=='<' || A[i]=='&' || A[i]=='*') {
				flag++;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("symobl missing");
			return false;
		}
		
		return true;

	}

	private static void adminPage() { 

		boolean check = true;
		while (check) {
			System.out.println("1. View Users\n2. Request Session\n3. View OverallTransactions\n4. Logout");
			System.out.println("Enter Your Choice : ");
			int choice = in.nextInt();

			switch (choice) {
			case 1:
				System.out.println("View Users : ");
				zcoinExchange.display1();				
				break;
			case 2:
				System.out.println("<------Requst Session------->");
				zcoinExchange.requestSession();
				
				break;
			case 3:
				System.out.println("Overall Transaction!!!");
				break;
			case 4:
				System.out.println("Logout Successfull");
				check=false;
				return;
				
			default:
				System.out.println("Wrong option!!!");
			}
		}

	}

}
