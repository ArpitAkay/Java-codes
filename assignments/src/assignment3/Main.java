package assignment3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private void logicmethod() {
		Scanner sc = new Scanner(System.in);
		List<Person> user = new ArrayList<Person>();
		while (true) {
			System.out.println("To create a user press 0");
			System.out.println("To update the data press 1");
			System.out.println("To delete the data press 2");
			System.out.println("To retrieve a user using id and email and press 3");
			System.out.println("To list all users press 4");
			System.out.println("To exit press 5");
			System.out.print("Enter your input here : ");
			try {
				int type = sc.nextInt();

				if (type == 0) {
					int count;
					System.out.print("How many user you want to enter : ");
					count = sc.nextInt();
					sc.nextLine();

					int size = user.size();
					for (int i = size; i < (count + size); i++) {
						System.out.println("Enter information for " + (i + 1) + "'s user");

						System.out.print("Enter name of the " + (i + 1) + "'s user : ");
						String name = sc.nextLine();
						name = name.trim();

						String email;
						while (true) {
							System.out.print("Enter email of the " + (i + 1) + "'s user : ");
							email = sc.nextLine();
							email = email.trim();
							String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
									+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

							Pattern pat = Pattern.compile(emailRegex);
							if (pat.matcher(email).matches() && email != null) {
								break;
							} else {
								System.out.println("Warning please enter valid email");
							}
						}

						System.out.println("Enter address for " + (i + 1) + "'s user");
						System.out.print("Enter plot number : ");
						int plotNo = sc.nextInt();
						sc.nextLine();

						System.out.print("Enter street Name : ");
						String street = sc.nextLine();
						street = street.trim();

						System.out.print("Enter city : ");
						String city = sc.nextLine();
						city = city.trim();

						System.out.print("Enter state : ");
						String state = sc.nextLine();
						state = state.trim();

						long mobileNumber;
						while (true) {
							System.out.print("Enter mobile number : ");
							mobileNumber = sc.nextLong();
							sc.nextLine();
							Pattern p = Pattern.compile("^\\d{10}$");
							Matcher m = p.matcher(String.valueOf(mobileNumber));
							if (m.matches()) {
								break;
							} else {
								System.out.println("Warning! Please enter valid mobile number");
							}
						}

						user.add(new Person((i + 1), name, email, new Address(plotNo, street, city, state),
								mobileNumber));
					}
				} else if (type == 1) {
					Boolean flag = false;
					Boolean temp = true;
					while (true) {
						if(user.size() == 0) {
							System.out.println("Please create a user first");
							break;
						}
						temp = true;
						System.out.print("Enter the id of the user whose data you want to update : ");
						int id = sc.nextInt();
						sc.nextLine();
						for (int i = 0; i < user.size(); i++) {
							if (user.get(i).getId() == id) {
								System.out.print(
										"Enter the item you want to update -> Name, Email, Address, Mobile Number : ");
								String thing = sc.nextLine();
								thing = thing.trim();
								if (thing.equalsIgnoreCase("name")) {
									System.out.print("Enter name : ");
									String name = sc.nextLine();
									name = name.trim();
									user.set(i, new Person((i + 1), name, user.get(i).getEmail(), new Address(
											user.get(i).getAddress().getPlotNo(), user.get(i).getAddress().getStreet(),
											user.get(i).getAddress().getCity(), user.get(i).getAddress().getState()),
											user.get(i).getMobileNumber()));
									flag = true;
									break;
								} else if (thing.equalsIgnoreCase("Email")) {
									String email;
									while (true) {
										System.out.print("Enter email : ");
										email = sc.nextLine();
										email = email.trim();
										String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
												+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

										Pattern pat = Pattern.compile(emailRegex);
										if (pat.matcher(email).matches() && email != null) {
											break;
										} else {
											System.out.println("Warning please enter valid email");
										}
									}
									user.set(i, new Person((i + 1), user.get(i).getName(), email, new Address(
											user.get(i).getAddress().getPlotNo(), user.get(i).getAddress().getStreet(),
											user.get(i).getAddress().getCity(), user.get(i).getAddress().getState()),
											user.get(i).getMobileNumber()));
									flag = true;
									break;
								} else if (thing.equalsIgnoreCase("Address")) {
									System.out.println("Enter address ->");
									System.out.print("Enter plot number : ");
									int plotNo = sc.nextInt();
									sc.nextLine();

									System.out.print("Enter street : ");
									String street = sc.nextLine();
									street = street.trim();

									System.out.print("Enter city : ");
									String city = sc.nextLine();
									city = city.trim();

									System.out.print("Enter state : ");
									String state = sc.nextLine();
									state = state.trim();
									user.set(i, new Person((i + 1), user.get(i).getName(), user.get(i).getEmail(),
											new Address(plotNo, street, city, state), user.get(i).getMobileNumber()));
									flag = true;
									break;
								} else if (thing.equalsIgnoreCase("mobile number")) {
									long mobileNumber;

									while (true) {
										System.out.print("Enter mobile number : ");
										mobileNumber = sc.nextLong();
										sc.nextLine();
										Pattern p = Pattern.compile("^\\d{10}$");
										Matcher m = p.matcher(String.valueOf(mobileNumber));
										if (m.matches()) {
											break;
										} else {
											System.out.println("Warning! Please enter valid mobile number");
										}
									}

									user.set(i,
											new Person((i + 1), user.get(i).getName(), user.get(i).getEmail(),
													new Address(user.get(i).getAddress().getPlotNo(),
															user.get(i).getAddress().getStreet(),
															user.get(i).getAddress().getCity(),
															user.get(i).getAddress().getState()),
													mobileNumber));
									flag = true;
									break;
								} else {
									System.out.println("Please enter a valid input : ");
									temp = false;
								}
							}
						}
						if(flag) {
							System.out.println("Success! Your details has been updated");
							break;
						}
						if(temp && !flag){
							System.out.println("Fail! The id you entered does not matches with any user");
						}

					}
				} else if (type == 2) {
					Boolean flag = false;
					while (true) {
						if(user.size() == 0) {
							System.out.println("Please create a user first");
							break;
						}
						System.out.print("Enter the id of the user whose data you want to delete : ");
						int id = sc.nextInt();
						for (int i = 0; i < user.size(); i++) {
							if (user.get(i).getId() == id) {
								user.remove(i);
								flag = true;
								break;
							}
						}
						if (flag) {
							System.out.println("Success! Your details has been delete");
							break;
						} else {
							System.out.println("Fail! The id you entered does not matches with any user");
						}
					}
				} else if (type == 3) {
					while (true) {
						if(user.size() == 0) {
							System.out.println("Please create a user first");
							break;
						}
						System.out.println("Enter id and email of the user to retrieve the data");
						System.out.print("ID : ");
						int id = sc.nextInt();
						sc.nextLine();
						
						String email;
						while (true) {
							System.out.print("Email : ");
							email = sc.nextLine();
							email = email.trim();
							String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
									+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

							Pattern pat = Pattern.compile(emailRegex);
							if (pat.matcher(email).matches() && email != null) {
								break;
							} else {
								System.out.println("Warning please enter valid email");
							}
						}
						Boolean flag = false;
						for (int i = 0; i < user.size(); i++) {
							if (user.get(i).getId() == id && user.get(i).getEmail().equalsIgnoreCase(email)) {
								System.out.println(user.get(i));
								flag = true;
								break;
							}
						}
						if (flag) {
							break;
						} else {
							System.out.println("Fail! Your id and email does not match with any user");
						}
					}

				} else if (type == 4) {
					if(user.size() == 0) {
						System.out.println("Please create a user first");
					}
					else {
						for (int i = 0; i < user.size(); i++) {
							System.out.println(user.get(i));
						}						
					}
				} else if (type == 5) {
					System.out.println("You have exited the code");
					break;
				} else {
					System.out.println("Warning! Please enter a valid number");
				}
			}  
			catch (Exception e) {
				e.printStackTrace();
				System.out.println();
				logicmethod();
			}
			System.out.println();
		}
		sc.close();

	}

	public static void main(String args[]) {
		Main main = new Main();
		main.logicmethod();
	}
}
