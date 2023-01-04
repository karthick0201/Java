package bank.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import bank.transaction.Transaction;
import bank.transaction.TransactionHandler;
import bankP.ZohoBank;

public class Customer  {

	private String cusId;
	private String accountNumber;
	private String name;
	private int balance;
	private String password;
	// private List<?> passwords;
	private List<Transaction> transactions;

	// DEFAULT CONSTRUCTOR
	public Customer() {
		transactions = new ArrayList<Transaction>();
	}

	// P CONSTRUCTOR
	public Customer(String cusId, String acNo, String name, int balance, String password, ArrayList<Transaction> al) {
		this.cusId = cusId;
		this.accountNumber = acNo;
		this.name = name;
		this.balance = balance;
		this.password = password;
		transactions = al;
	}

	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
		this.balance = ZohoBank.minimumBalance;
		// set acno, id
		frontDetails();

		transactions = new ArrayList<Transaction>();
		/* OPENING TRANSACTION */
		Transaction t = new Transaction(1, "Opening", 10000, 10000, 0);
		transactions.add(t);
		// Transaction add and create new file
		TransactionHandler th = new TransactionHandler();

		th.transctionFileAdd(t, cusId);
	}

	private void frontDetails() {
		this.accountNumber = String.valueOf(++ZohoBank.accountNumber);
		this.cusId = String.valueOf(++ZohoBank.customerId);
		System.out.println("Your Account Created!!!");
		display();

	}

	public void display() {
		
		
		//System.out.println("CUSTOMER_ID   ACCOUNT_NO   NAME      BALANCE     PASSWORD");
		
		System.out.println(cusId + "      " + accountNumber + "          " + name + "      " + balance + "       " + password);
	}

	@Override
	public String toString() {
		return "" + cusId + " : " + accountNumber + " : " + name + " : " + balance + " : " + password;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void transactionHistory() {

		Iterator<Transaction> i= transactions.iterator();
		while(i.hasNext()) {
			i.next().display();
		}
		
		//System.out.println(transactions);
	}

	

}
