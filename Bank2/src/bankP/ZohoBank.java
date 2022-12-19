package bankP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

import bank.customer.Customer;
import bank.transaction.Transaction;
import bank.transaction.TransactionHandler;

public class ZohoBank extends BankAbstract {

	public static int customerId;
	public static int accountNumber;
	public final static int minimumBalance = 10000;

	Customer cus;

	// MAP OF CUSTOMERS
	public static Map<String, Customer> customers = new HashMap<String, Customer>();

	// ADMIN AUTHENTICATION
	public boolean authenticateAdmin(String id, String psw) {
		if (id.equals("admin") && psw.equals("admin")) {
			return true;
		} else {
			System.out.println("Invaild - Retry!!!");
			return false;
		}

	}

	@Override
	void deposite(String id, int amount) {
		cus = ZohoBank.customers.get(id);
		cus.setBalance(cus.getBalance() + amount);
		System.out.println("Amount Added Successfull!!!");
		cus.display();
		// TRANSACTION ADD

		TransactionHandler th = new TransactionHandler();
		int tid = th.getTransactionId(cus.getTransactions()); // get id

		Transaction t = new Transaction(tid, "Deposit", amount, cus.getBalance(), 0);
		// add to arraylist
		cus.getTransactions().add(t);
		// add to file
		th.transctionFileAdd(t, cus.getCusId());

	}

	@Override
	void withdraw(String id, int amount) {
		cus = ZohoBank.customers.get(id);
		cus.setBalance(cus.getBalance() - amount);
		System.out.println("Amount Withdraw Successfull!!!");
		cus.display();
		// TRANSACTION ADD

		TransactionHandler th = new TransactionHandler();
		int tid = th.getTransactionId(cus.getTransactions()); // get id

		Transaction t = new Transaction(tid, "withdraw", amount, cus.getBalance(), 0);
		// add to arraylist
		cus.getTransactions().add(t);
		// add to file
		th.transctionFileAdd(t, cus.getCusId());
	}

	@Override
	void transfer(String id, int accountNumber, int amount) {
		// find ID:

		String transferId = getIdfromAcNo(accountNumber);
		if (transferId == null) {
			System.out.println("Invaild Account Number!!!");
			return;
		}
		// Transfer Money:
		Customer c1 = customers.get(id);
		Customer c2 = customers.get(transferId);
		// REMOVE FROM C1 ACCOUNT - MONEY
		c1.setBalance(c1.getBalance() - amount);
//				System.out.println(c2);
//				System.out.println(c2.getBalance() +"  :  " + amount);

		/******* HISTORY ADD TO CUS1 ******/
		// TRANSACTION ADD --> C1

		TransactionHandler th = new TransactionHandler();
		int tid = th.getTransactionId(c1.getTransactions()); // get id

		Transaction t = new Transaction(tid, "Debited", amount, c1.getBalance(), 0);
		// add to arraylist
		c1.getTransactions().add(t);
		// add to file
		th.transctionFileAdd(t, c1.getCusId());

//TRANSACTION ADD --> C2

		// TransactionHandler th=new TransactionHandler();
		tid = th.getTransactionId(c2.getTransactions()); // get id

		t = new Transaction(tid, "Credited", amount, c2.getBalance(), 0);
		// add to arraylist
		c2.getTransactions().add(t);
		// add to file
		th.transctionFileAdd(t, c2.getCusId());

		/***********************************************/

		System.out.println("Amount minised successfull!!! from c1");
		// checking:

		c2.setBalance(c2.getBalance() + amount);
		System.out.println("C2 successfull!!!");
		System.out.println("transaction successfull");
		cus.display();
	}

	private String getIdfromAcNo(int accountNumber) {
		/*************** GET ID FROM ACCOUNT NUMBER ******************/
		String tsId;
		Set<Entry<String, Customer>> s = customers.entrySet();
		Iterator<Entry<String, Customer>> i = s.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Customer> me = (Map.Entry<String, Customer>) i.next();
			cus = me.getValue();
			if (cus.getAccountNumber().equals(String.valueOf(accountNumber))) {
//				tsId=cus.getCus_id();
				return cus.getCusId();
			}
		}
		return null;
	}

	public boolean authenticateCustomer(String id, String psw) {

		Customer cObj = customers.get(id);
		String n = cObj.getCusId();
		String p = cObj.getPassword();
		if (n.equals(id) && p.equals(psw)) {
			cObj.display();
			return true;
		} else {
			return false;

		}

	}

	public void topNCustomers() {

		Set<Map.Entry<String, Customer>> s = ZohoBank.customers.entrySet();
		List<Map.Entry<String, Customer>> list = new ArrayList<>(s);
		
		//WAY -1: --> FUNCTIONAL INTERFACE
		// ComparatorDemo cd=new ComparatorDemo();
		/*Collections.sort(list, new Comparator<Entry<String, Customer>>() {

			@Override
			public int compare(Map.Entry<String, Customer> o1, Map.Entry<String, Customer> o2) {

				if (o1.getValue().getBalance() > o2.getValue().getBalance())
					return -1;
				else if (o1.getValue().getBalance() < o2.getValue().getBalance())
					return +1;
				else
					return 0;
			}
		});*/
		//WAY -2 IMPLEMNT COMPARATOR IN custom CLASS 
		ComparatorDemo cd=new ComparatorDemo();
		Collections.sort(list,cd);
		//ITERATION PROCESS
		Iterator<Map.Entry<String, Customer>> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().getValue());
		}
		
		

	}

}
