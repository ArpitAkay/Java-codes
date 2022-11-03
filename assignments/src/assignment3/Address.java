package assignment3;

public class Address {
	int plotNo;
	String street;
	String city;
	String state;
	
	public Address(int plotNo, String street, String city, String state) {
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
}
