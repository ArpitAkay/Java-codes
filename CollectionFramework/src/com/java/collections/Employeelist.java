package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employeelist {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Arpit Kumar", 22, 85000));
		employees.add(new Employee(2, "Ayush Agarwal", 23, 45000));
		employees.add(new Employee(3, "Aditya Kumar", 24, 55000));
		employees.add(new Employee(4, "Yashraj Anand", 25, 65000));
		
		System.out.println(employees);
		
		//Sort on the basis of salary
//		Collections.sort(employees, new Employeelistsort());
//		System.out.println(employees);
		
//		Comparator c = new Comparator<Employee>() {						//Inner class
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		};
//		
		Collections.sort(employees, new Comparator<Employee>() {		//Anonymous implementation of comparator interface
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println(employees);
		
	
		
		Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));		//Lambda expression
		System.out.println(employees);
		
		//Sort on the basis of name
		Collections.sort(employees, new Comparator<Employee>() {		//Anonymous implementation of comparator interface
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getName().compareTo(o2.getName()));
			}
		});
		System.out.println(employees);
		
	
		
		Collections.sort(employees, (o1, o2) -> (int) (o1.getName().compareTo(o2.getName())));		//Lambda expression
		System.out.println(employees);
		
	}
}

class Employeelistsort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary() - o2.getSalary());
	}
	
}
