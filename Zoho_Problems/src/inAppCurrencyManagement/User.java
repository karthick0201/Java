package inAppCurrencyManagement;

import java.util.List;

public class User {
	private String name;
	private String email;
	private String mobile;
//Unique Id:
	private String humanId;
	private String password;
	private int realCurrency;
// Unique Id:
	private String zId;
	private int zCoin;
//CONSTRUCTOR:
	public User(String name, String email, String mobile, String humanId, String password) {
	super();
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.humanId = humanId;
	this.password = password;
	realCurrency = 10000;
	this.zCoin = 10; //FOR Register BONOUS
	
	
}
	//user defined:
	
	public User(String name, String email, String mobile, String humanId, String password,int zId) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.humanId = humanId;
		this.password = password;
		this.realCurrency = 15000;
		this.zCoin = 32; //FOR Register BONOUS
		this.zId=String.valueOf(zId);
		
	}
	
	
	
	//METHODS
	public String getName() {
		return name;
	}


	public void display() {
		/****************************/
		System.out.println("-------------------------");
		System.out.println("Name    : " + name);
		System.out.println("Email   : " + email);
		System.out.println("Mobile  : " + mobile);
		System.out.println("H_id    : " + humanId);
		System.out.println("Psw     : " + password);
		System.out.println("RS      : " + realCurrency);
		System.out.println("ZCoin   : " + zCoin);
		System.out.println("Z-ID    : " + zId);
		System.out.println("-----------------------------");
		/****************************/
		//System.out.println(name + " : " + email + " : " + mobile + " : " + humanId + " : " + password + " : " + realCurrency + " : " + zCoin + " : " + zId);
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHumanId() {
		return humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRealCurrency() { 
		return realCurrency;
	}

	public void setRealCurrency(int realCurrency) { 
		realCurrency = realCurrency;
	}

	public String getzId() {
		return zId;
	}

	public void setzId(String zId) {
		this.zId = zId;
	}

	public int getzCoin() {
		return zCoin;
	}

	public void setzCoin(int zCoin) {
		this.zCoin = zCoin;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	List<Transaction> transactions; // access via zId
}
