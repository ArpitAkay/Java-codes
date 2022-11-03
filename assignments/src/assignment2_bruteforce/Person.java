package assignment2_bruteforce;

import java.util.Scanner;

public class Person {
	String name;
	long mobilenumber;
	int age;

	void setPersonValue(String name, long mobilenumber, int age) {
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.age = age;
	}

	void showPersonValue() {
		System.out.println();
		System.out.println("Name     : " + this.name);
		System.out.println("Age      : " + this.age);
		System.out.println("Mobile Number : " + this.mobilenumber);
	}

	class Address {
		int plotno;
		String city;
		String state;
		int pincode;

		void setAddress(int plotno, String city, String state, int pincode) {
			this.plotno = plotno;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}

		void showAddress() {
			System.out.println(this.plotno + ", " + this.city + " " + this.state + ", " + this.pincode);
		}
	}

	Address setPersonAddress(int plotno, String city, String state, int pincode) {
		Address a1 = new Address();
		a1.setAddress(plotno, city, state, pincode);
		return a1;
	}

	void showPersonAddress(Address a1) {
		a1.showAddress();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person();
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Enter your phone number : ");
		long mobilenumber = sc.nextLong();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		p1.setPersonValue(name, mobilenumber, age);
		p1.showPersonValue();
		sc.close();
	}
}