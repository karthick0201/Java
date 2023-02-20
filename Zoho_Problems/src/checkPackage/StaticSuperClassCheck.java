package checkPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//kggggggggggggggg
public class StaticSuperClassCheck {
	public static void main(String[] args) {
		RentalAgency r1=new KatRentalAgency();
		RentalAgency r2=new TiaRentalAgency();
		
		System.out.println(r1.getBalance());
		Customer c1=new Customer("karthick","audi");
		Customer c2=new Customer("rafi","bmw");
		Customer c3=new Customer("kat","bmw");
		Customer c4=new Customer("harsha","rr");
		
		KatRentalAgency.customers.add(c1);
		KatRentalAgency.customers.add(c2);
		TiaRentalAgency.customers.add(c3);
		TiaRentalAgency.customers.add(c4);
		System.out.println(KatRentalAgency.customers);
		System.out.println(TiaRentalAgency.customers);
		
	}
}
abstract class RentalAgency{
	static int balance;
//	static List<Customer> customers=new ArrayList<Customer>(Arrays.asList(new Customer("sneha","rr"),new Customer("bharath","bmw")));
	static List<Customer> customers;
	public int getBalance() {
		return balance;
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
}
class KatRentalAgency extends RentalAgency{

	
	static {
		customers = new ArrayList<Customer>(Arrays.asList(new Customer("sneha","rr"),new Customer("bharath","bmw")));
		balance=190;
	}
	int amount=10;
	
	@Override
	public int getBalance() {
		
		return super.getBalance()+amount;
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return KatRentalAgency.super.getCustomers();
	}
}
class Customer{
	String name;
	String vehicle;
	public Customer(String n,String v) {
		this.name=n;
		this.vehicle=v;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+name + " : " + vehicle + "\n";
	}
}


class TiaRentalAgency extends RentalAgency{

	
	static {
		customers = new ArrayList<Customer>(Arrays.asList(new Customer("sofia","bmw"),new Customer("har","audi")));
		balance=190;
	}
	int amount=10;
	
	@Override
	public int getBalance() {
		
		return super.getBalance()+amount;
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return TiaRentalAgency.customers;
	}
}