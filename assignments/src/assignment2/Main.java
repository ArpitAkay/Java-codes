package assignment2;

import java.util.*;
import java.io.*;

public class Main {
	private void setvalues(String type, int count) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			System.out.println("Please fill information of " + type);

			System.out.print("Enter your name : ");
			String name = sc.nextLine();

			System.out.print("Enter your phone number : ");
			long mobilenumber = sc.nextLong();

			System.out.print("Enter your age : ");
			int age = sc.nextInt();

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

			if (type.equalsIgnoreCase("Person")) {
				Person person = new Person(name, mobilenumber, age, new Address(plotno, city, state, pincode));
				System.out.println(person);

				try {
					BufferedWriter bw = new BufferedWriter(
							new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/person.txt"));
					bw.write("name : " + name + "\n");
					bw.write("mobile : " + mobilenumber + "\n");
					bw.write("age : " + age + "\n");
					bw.write("address.plotno : " + plotno + "\n");
					bw.write("address.city : " + city + "\n");
					bw.write("address.state : " + state + "\n");
					bw.write("address.pincode : " + pincode + "\n");
					bw.close();
				} catch (Exception ex) {
//					return;
				}

			} else if (type.equalsIgnoreCase("Employee")) {
				System.out.println("Enter your bank details : ");
				System.out.print("Enter your account number : ");
				long accountno = sc.nextLong();
				sc.nextLine();

				System.out.print("Enter your ifsc code : ");
				String ifsc = sc.nextLine();

				System.out.print("Enter your bank name : ");
				String bankname = sc.nextLine();

				Person person = new Person(name, mobilenumber, age, new Address(plotno, city, state, pincode));
				System.out.println(person);

				Employee employee = new Employee(name, mobilenumber, age, new Address(plotno, city, state, pincode),
						new BankAccount(accountno, ifsc, bankname));
				System.out.println(employee);

				try {
					BufferedWriter bw = new BufferedWriter(
							new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/employee.txt"));
					bw.write("name : " + name + "\n");
					bw.write("mobile : " + mobilenumber + "\n");
					bw.write("age : " + age + "\n");
					bw.write("address.plotno : " + plotno + "\n");
					bw.write("address.city : " + city + "\n");
					bw.write("address.state : " + state + "\n");
					bw.write("address.pincode : " + pincode + "\n");
					bw.write("bankaccount.accountno : " + accountno + "\n");
					bw.write("bankaccount.ifsc : " + ifsc + "\n");
					bw.write("bankaccount.bankname : " + bankname + "\n");

					bw.close();
				} catch (Exception ex) {
//					return;
				}

			} else if (type.equalsIgnoreCase("Client")) {
				System.out.print("Enter company name : ");
				String companyname = sc.nextLine();
				System.out.print("Enter company address : ");
				String companyaddress = sc.nextLine();

				Person person = new Person(name, mobilenumber, age, new Address(plotno, city, state, pincode));
				System.out.println(person);

				Client client = new Client(name, mobilenumber, age, new Address(plotno, city, state, pincode),
						new Company(companyname, companyaddress));
				System.out.println(client);

				try {
					BufferedWriter bw = new BufferedWriter(
							new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/client.txt"));
					bw.write("name : " + name + "\n");
					bw.write("mobile : " + mobilenumber + "\n");
					bw.write("age : " + age + "\n");
					bw.write("address.plotno : " + plotno + "\n");
					bw.write("address.city : " + city + "\n");
					bw.write("address.state : " + state + "\n");
					bw.write("address.pincode : " + pincode + "\n");
					bw.write("company.name : " + companyname + "\n");
					bw.write("company.address : " + companyaddress + "\n");
					bw.close();
				} catch (Exception ex) {
//					return;
				}

			} else {
				System.out.println("Invalid Input");
			}
		}
		sc.close();
	}

	private void setOutput(String type1) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("/Users/arpitkumar/Desktop/JavaFiles/output-PEC.txt"));
			BufferedReader br_person = new BufferedReader(
					new FileReader("/Users/arpitkumar/Desktop/JavaFiles/person.txt"));
			BufferedReader br_employee = new BufferedReader(
					new FileReader("/Users/arpitkumar/Desktop/JavaFiles/employee.txt"));
			BufferedReader br_client = new BufferedReader(
					new FileReader("/Users/arpitkumar/Desktop/JavaFiles/client.txt"));

			if (type1.equalsIgnoreCase("Person")) {
				String str;
				while ((str = br_person.readLine()) != null) {
					String s;
					s = str.substring(str.indexOf(":") + 2, str.length());
					bw.write(s + "\n");
				}
			} else if (type1.equalsIgnoreCase("Employee")) {
				String str;
				while ((str = br_employee.readLine()) != null) {
					String s;
					s = str.substring(str.indexOf(":") + 2, str.length());
					bw.write(s + "\n");
				}
			} else {
				String str;
				while ((str = br_client.readLine()) != null) {
					String s;
					s = str.substring(str.indexOf(":") + 2, str.length());
					bw.write(s + "\n");
				}
			}

			br_person.close();
			br_employee.close();
			br_client.close();
			bw.close();

		} catch (Exception ex) {
//			return
		}
	}
	
//	private Object getPerson() {
//		return new Person("Arpit", 1234567890, 22, null);
//	}
	
//	private Object getPerson() {
//		return new BankAccount(0, null, null);
//	}
	

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Main main = new Main();
//		Object o = main.getPerson();
//		if(o instanceof Person) {
//			Person p = (Person)o;
//			System.out.println(p);
//		}
		
		
		
		String type1;
		while (true) {
			System.out.print("Choose Person, Employee or Client for whom you want to fill information : ");
			String type = sc.nextLine();
			int count;
			if (type.equalsIgnoreCase("person") || type.equalsIgnoreCase("employee")
					|| type.equalsIgnoreCase("client")) {
				type1 = type;

				System.out.print("Press 1 for writing new information and 0 to use previous information : ");
				int num = sc.nextInt();

				if (num == 1) {
					System.out.print("Choose how many " + type + "'s information you want to fill : ");
					count = sc.nextInt();
					main.setvalues(type, count);
					sc.nextLine();
					System.out.println("Success! Your data has been written into output file");
				} else {
					System.out.println("Success! Your data has been written into output file");
				}
				break;
			} else {
				System.out.println("Warning! Please choose between Person, Employee or Client");
			}
		}

		main.setOutput(type1);
		sc.close();
	}
}
