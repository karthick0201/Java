package bank.Handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bank.customer.Customer;
import bank.transaction.Transaction;
import bank.transaction.TransactionHandler;
import bankP.ZohoBank;

public class BankHandler {
	final static private int CUSID = 0;
	final static private int ACNO = 1;
	final static private int NAME = 2;
	final static private int BALANCE = 3;
	final static private int PASSWORD = 4;

	final static String  BANK_FILE_PATH= "C:\\Users\\Administrator\\git\\Java\\Bank2\\src\\DocFiles\\bank_db.txt";
	public void storeIntoFile() {
		try {
			FileWriter fw = new FileWriter(BANK_FILE_PATH);
			BufferedWriter bw = new BufferedWriter(fw);
			Set<Entry<String, Customer>> s = ZohoBank.customers.entrySet();
			Iterator<Entry<String, Customer>> i = s.iterator();
			while (i.hasNext()) {
				Map.Entry<String, Customer> me = (Map.Entry<String, Customer>) i.next();
				Customer c = me.getValue();
				bw.append(c.getCusId() + " ");
				bw.append(c.getAccountNumber() + " ");
				bw.append(c.getName() + " ");
				bw.append(String.valueOf(c.getBalance()) + " ");
				bw.append(c.getPassword() + " ");
				bw.newLine();

			}
			bw.flush();
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initializeData() {

		try {

			FileReader file = new FileReader(BANK_FILE_PATH);
			BufferedReader read = new BufferedReader(file);
			//System.out.println("hello");
			try {
				String lineDetail = read.readLine();
				while (lineDetail != null) {

					String[] line = lineDetail.split("[ ]");

					/*********************************************************/
								/*TRANSACTION HISTORY with the help of cid*/
					TransactionHandler tah=new TransactionHandler();
					//System.out.println(lineDetail);
				//	System.out.println("coming al before");
					ArrayList<Transaction> al=tah.initializeData(line[CUSID]);
					//System.out.println("coming al after");
					
					/*********************************************************/
					
					// INITIALIZE IN CUSTOMER CLASS
					Customer c = new Customer(line[CUSID], line[ACNO], line[NAME], Integer.parseInt(line[BALANCE]),
							line[PASSWORD],al);
					
					ZohoBank.customers.put(line[CUSID], c);
					lineDetail = read.readLine();

					// FOR STATIC ACNO AND ID NUMBER AUTO INCREMENT PROCESS DEFAULT
					ZohoBank.accountNumber = Integer.parseInt(line[ACNO]);
					ZohoBank.customerId = Integer.parseInt(line[CUSID]);
					
					

				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
