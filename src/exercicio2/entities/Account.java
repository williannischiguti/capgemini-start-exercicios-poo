package exercicio2.entities;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;

	public Account() {

	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			balance -= amount;
		}
	}
	
	public double showBalance() {
		return balance;
	}

	public void extract() {
		System.out.print(String.format("Account number %d%n" + 
										 "Name: %s%n" + 
										 "Balance: %.2f%n", accountNumber, name, balance));
	}

}
