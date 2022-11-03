package assignment2;

public class Company {
	private String name;
	private String address;

	// constructor for Company class
	public Company(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// getters and setters for name and address
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + "]";
	}
}
