package assignment2;

public class Person {
	private String name;
	private long mobilenumber;
	private int age;
	private Address address;

	// constructor for Person class
	public Person(String name, long mobilenumber, int age, Address address) {
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.address = address;
	}

	// getters and setters for name, mobilenumber, age and address
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mobilenumber=" + mobilenumber + ", age=" + age + ", address=" + address
				+ "]";
	}
}
