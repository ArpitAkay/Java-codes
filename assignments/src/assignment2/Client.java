package assignment2;

public class Client extends Person {
	Company company;

	// constructor for Client class
	public Client(String name, long mobilenumber, int age, Address address, Company company) {
		super(name, mobilenumber, age, address);
		this.company = company;
	}

	// getters and setters for company
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Client [company=" + company + "]";
	}
}
