package assignment2;

public class Address {
	private int plotno;
	private String city;
	private String state;
	private int pincode;

	// constructor for Address class
	public Address(int plotno, String city, String state, int pincode) {
		this.plotno = plotno;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	// getters and setters for plotno, city, state and pincode
	public int getPlotno() {
		return plotno;
	}

	public void setPlotno(int plotno) {
		this.plotno = plotno;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [plotno=" + plotno + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
}
