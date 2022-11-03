package assignment3;

public class Person {
	int id;
	String name;
	String email;
	Address address;
	long mobileNumber;
	
	public Person(int id, String name, String email, Address address, long mobileNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobileNumber="
				+ mobileNumber + "] " ;
	}
}
