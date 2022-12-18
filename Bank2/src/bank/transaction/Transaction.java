package bank.transaction;

public class Transaction {
	private int transactionId;
	private String transactionType;
	private int amount;
	private int balance;
	private int maintanceFee;
	public Transaction(int transactionId, String transactionType, int amount, int balance,int mf) {
		
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance = balance;
		maintanceFee=mf;
	}

	
	
	
	public Transaction() {
	}




	public int getTransactionId() {
		return transactionId;
	}




	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}




	public String toString() {
		return ""+transactionId+" "+transactionType +" " + amount +" "+ balance + " " + maintanceFee; 
	}
	
	
	
	
}
