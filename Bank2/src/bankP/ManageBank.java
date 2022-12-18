package bankP;

import java.util.Collection;    
import java.util.Scanner;

import bank.Handler.BankHandler;
import bank.customer.Customer;


public class ManageBank {
	
	// GLOBAL VARIABLES
	Scanner in = new Scanner(System.in);
	ZohoBank bank = new ZohoBank();
	int choice;
	
	
	
	public static void main(String[] args) {
		
		/*Initialize date into a Map*/
		BankHandler bh=new BankHandler();
		bh.initializeData();
		
		
		
		/*
		 * Error occurred during initialization of VM Could not reserve enough space for
		 * object heap
		 */
		
		Scanner in = new Scanner(System.in);
		ManageBank mb = new ManageBank();
		boolean check = true;
		while (check) {
			System.out.println("----------------------");
			System.out.println("\tZOHO BANK\t");
			System.out.println("1. Admin\n2. Customer\n3. Exit");
			System.out.println("----------------------");
			System.out.print("Enter Your Choice : ");
			int choice = in.nextInt();
			switch (choice) {
			case 1: // ADMIN PAGE
				mb.bankReception();
				break;
			case 2://CUSTOMER PAGE
				mb.customerReception();
				break;
			case 3:
				System.out.println("\tThank You!!!!");
				/*MAP TO FILE QUERY UPDATE QUERY*/
				check = false;
				break;
			case 4://ADMIN VIEW ONLY FOR ERROR CHECKING
				
				System.out.println("-----------Hello Admin!!!--------");
				ZohoBank zb=new ZohoBank();
				Collection<Customer> c=ZohoBank.customers.values();
				System.out.println(c);
				System.out.println("Size : " + ZohoBank.customers.size());
				break;
			default:
				System.out.println("Worng Option!!!");
				break;
			}

		}

	}

	private void customerReception() {
		boolean check=true;
		
		while(check) {
			
			System.out.println("\n\tCUSTOMER PORTAL\n");
			System.out.println("1. Login\n2. NeW CustomeR\n3. Exit");
			
			choice=in.nextInt();
			switch(choice) {
			case 1://Login Page
				// AUTHENTICATION:
				System.out.println("Enter your Id : ");
				String id = in.next();
				System.out.println("Enter Your password : ");
				String psw = in.next();
				if (!bank.authenticateCustomer(id, psw)) {
					System.out.println("Invaild!!!");
					return;
				} else {
					// IF Vaild Redirect to cutomerPortal with id
					customerPortal(id);
				}
				break;
			case 2: //NEW CUSTOMER CREATION
				newCustomer();
		
				break;
			case 3://EXIT
				System.out.println("Back To Home!!!");
				return;
			default:
					System.out.println("Hey WronG OptioN!!!");
					break;
			}
		}
		
		
		
		
	}

	private void newCustomer() { 
		Scanner in=new Scanner(System.in);
		String name,psw1,psw2;
		System.out.println("Enter Name : ");
		name=in.next();
		System.out.println("Enter password : ");
		psw1=in.next();
		System.out.println("Re-Enter Password : ");
		psw2=in.next();
		
		while(!(psw1.equals(psw2))) {
			System.out.println("MisMatch Password!!!\n\t Re-Enter Password!!!");
			psw2=in.next();
		}
		//psw1=psw1;
		Customer c=new Customer(name,psw1);
		//Add to Map int,CUstomer
		ZohoBank.customers.put(c.getCusId(),c);
		//System.out.println("Customer Added Successfull!");
		//System.out.println(c);
		
	}

	private void customerPortal(String id) {
		
		boolean check=true;
		while(check) {
			System.out.println("-------------------------");
			System.out.println("\tCusTomeR PagE PorTaL!");
			System.out.println("-------------------------");
			System.out.println("1. Deposit\n2. Withdraw\n3. Transfer\n4. Transaction History\n5. Logout");
			System.out.print("Enter Your Choice : ");
			choice=in.nextInt();
			switch(choice) {
			case 1: //deposit
				deposit(id);
				break;
			case 2://withdraw
				boolean wcheck = withdraw(id);
			break;
			case 3://accont transfer
				accountTransfer(id);
				break;
			case 5://logout
				System.out.println("Logout Successfull!!!");
				return;
			case 4: //transcation history
				System.out.println("Transaction Histry!!!");
				transactionHistory(id);
				break;
				default:
					System.out.println("Invaild Option!!!");
			}
			 
		 }		
	}
	
	private void transactionHistory(String id) {
		Customer hm=ZohoBank.customers.get(id);
		hm.transactionHistory();
	}

	private void accountTransfer(String id) {
		int amount;
		int accountNumber;
		Customer hm=ZohoBank.customers.get(id); //get customer check
		
		System.out.println("Enter Amount to Transfer : ");
		amount=in.nextInt();
		int ch2=hm.getBalance()-amount;
		if(ch2>1000) {
			System.out.println("ENter Account Number to Transfer : ");
			accountNumber=in.nextInt();
			
			bank.transfer(id,accountNumber,amount);
		}else {
			System.out.println("atleast Rs. 1000 Minimum Balance!!!");
		}
		
	}
	private void deposit(String id) {
		System.out.println("Enter amount to Deposit : ");
		int amount=in.nextInt();
		bank.deposite(id,amount);
	}
	private boolean withdraw(String id) {
		int amount;
		Customer hm=ZohoBank.customers.get(id); //get customer check
		
		System.out.println("Enter Amount to Withdraw : ");
		amount=in.nextInt();
		int ch2=hm.getBalance()-amount;
		if(ch2>1000) {
			bank.withdraw(id,amount);
		}else {
			System.out.println("atleast Rs. 1000 Minimum Balance!!!");
		}
		return false;
	}
	private void bankReception() {  

		System.out.println("----------------------");
		System.out.println("\tADMN-LOGIN PAGE");
		System.out.println("----------------------");
		// AUTHENTICATION:
		System.out.println("Enter your Id : ");
		String id = in.next();
		System.out.println("Enter Your password : ");
		String psw = in.next();
		if (!bank.authenticateAdmin(id, psw)) {
			return;
		} else {
//			System.out.println("-------------------------");
//			System.out.println("\tHello Peter(ADMIN)!!!");
//			System.out.println("-------------------------");
			boolean check = true;
			while (check) {
				System.out.println("----------------------");
				System.out.println("\tWelcome Peter(ADMIN)!!!\t");
				System.out.println("1. Add\n2. Remove\n3. ToP-N Customers \n4.Logout");
				System.out.println("----------------------");
				System.out.print("Enter Your Choice : ");
				int choice = in.nextInt();
				switch (choice) {
				case 1: // ADD CUSTOMER
					System.out.println("Adding Customer!!!");
					break;
				case 2:
					System.out.println("Remove Customer!!!");
					break;
				case 3:
					System.out.println("Top-N Customers!!!");
					break;
				case 4:
					System.out.println("Logout Successfull!!!");
					//bankReception();
					return;
					//break;
				default:
					System.out.println("Wrong Option!!!\n\t Re-try!!!");
					break;
				}
			}

		}
	}
}
