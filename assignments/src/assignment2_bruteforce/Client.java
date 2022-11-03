package assignment2_bruteforce;

import java.util.Scanner;

public class Client extends Person {
	Company setCompany(String name, String address) {
		Company com = new Company();
		com.setCompanyValue(name, address);
		return com;
	}

	class Company {
		String companyname;
		String companyaddress;

		void setCompanyValue(String name, String address) {
			this.companyname = name;
			this.companyaddress = address;
		}

		void showCompanyValue() {
			System.out.println("Company Name : " + this.companyname);
			System.out.println("Company Address : " + this.companyaddress);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of client whom details to filled : ");
		int clientnum = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < clientnum; i++) {
			Client c1 = new Client();
			System.out.print("Enter your name : ");
			String name = sc.nextLine();
			System.out.print("Enter your phone number : ");
			long mobilenumber = sc.nextLong();
			System.out.print("Enter your age : ");
			int age = sc.nextInt();
			c1.setPersonValue(name, mobilenumber, age);

			System.out.println("Enter your address : ");
			System.out.print("Enter your plot number : ");
			int plotno = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter your city : ");
			String city = sc.nextLine();
			System.out.print("Enter your state : ");
			String state = sc.nextLine();
			System.out.print("Enter your pincode : ");
			int pincode = sc.nextInt();
			sc.nextLine();

			Address a1 = c1.setPersonAddress(plotno, city, state, pincode);

			System.out.print("Enter company name : ");
			String companyname = sc.nextLine();
			System.out.print("Enter company address : ");
			String companyaddress = sc.nextLine();

			Company com = c1.setCompany(companyname, companyaddress);

			System.out.print("Enter 1 to view details : ");
			while (true) {
				int view = sc.nextInt();
				if (view == 1) {
					c1.showPersonValue();
					c1.showPersonAddress(a1);
					com.showCompanyValue();
					break;
				} else if (view == 2) {
					break;
				} else {
					System.out.print("Enter 1 view to details or enter 2 to stop : ");
				}
			}
			sc.nextLine();
			System.out.println();
		}
		sc.close();

	}
}