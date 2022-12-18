package bankP;

public abstract class BankAbstract {
	abstract void deposite(String id, int amount);
	abstract void withdraw(String id, int amount);
	abstract void transfer(String id, int accountNumber, int amount);
}
