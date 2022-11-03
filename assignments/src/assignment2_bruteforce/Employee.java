package assignment2_bruteforce;

import java.util.Scanner;

public class Employee extends Person {
	Bankaccount setBankAccount(long accountno, String ifsc, String bankname) {
		Bankaccount b1 = new Bankaccount();
		b1.setBankDetails(accountno, ifsc, bankname);
		return b1;
	}

	class Bankaccount {
		long accountno;
		String ifsc;
		String bankname;

		void setBankDetails(long accountno, String ifsc, String bankname) {
			this.accountno = accountno;
			this.ifsc = ifsc;
			this.bankname = bankname;
		}

		void showBankDetails() {
			System.out.println("Account Number : " + this.accountno);
			System.out.println("IFSC      : " + this.ifsc);
			System.out.println("Bank Name   : " + this.bankname);
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();

		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Enter your phone number : ");
		long mobilenumber = sc.nextLong();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		e1.setPersonValue(name, mobilenumber, age);

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

		Address a1 = e1.setPersonAddress(plotno, city, state, pincode);

		System.out.println("Enter your bank details : ");
		System.out.print("Enter your account number : ");
		long accountno = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter your ifsc code : ");
		String ifsc = sc.nextLine();
		System.out.print("Enter your bank name : ");
		String bankname = sc.nextLine();
		Bankaccount b1 = e1.setBankAccount(accountno, ifsc, bankname);

		System.out.print("Enter 1 to view details : ");
		while (true) {
			int view = sc.nextInt();
			if (view == 1) {
				e1.showPersonValue();
				e1.showPersonAddress(a1);
				b1.showBankDetails();
				break;
			} else if (view == 2) {
				break;
			} else {
				System.out.print("Enter 1 view to details or enter 2 to stop : ");
			}
		}
		sc.nextLine();
		System.out.println();
		sc.close();
	}
}