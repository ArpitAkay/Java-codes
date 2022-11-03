package assignment2;

public class Employee extends Person {
	private BankAccount bankaccount;

	// constructor for Employee class
	public Employee(String name, long mobilenumber, int age, Address address, BankAccount bankaccount) {
		super(name, mobilenumber, age, address);
		this.bankaccount = bankaccount;
	}

	// getters and setters for bankaccount
	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	@Override
	public String toString() {
		return "Employee [bankaccount=" + bankaccount + "]";
	}
}
