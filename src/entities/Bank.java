package entities;

public class Bank {

//attribute
	private int accountNumber;
	private String accountHolder;
	private double balance;
//constructor
	public Bank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	public Bank(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
//get/set
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
//methods
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		balance -= withdraw;
		balance = balance -  5.00;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+", Holder: "
				+ accountHolder
				+ ", Balance : $ "
				+ String.format("%.2f", balance);
	}
	
	
	
	
	
}
