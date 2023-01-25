package org.example.sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortObjectList {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Arpit Kumar", "IT", 550000));
        employees.add(new Employee(102, "Ayush Agrawal", "Civil", 560000));
        employees.add(new Employee(103, "Krishna Vishwakarma", "CS", 450000));
        employees.add(new Employee(104, "Yashraj Anand", "", 350000));

        System.out.println(employees);

        Collections.sort(employees, new MyComparator());

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        Collections.sort(employees, (Employee o1, Employee o2) -> {
            return (int) (o1.getSalary() - o2.getSalary());
        });

        System.out.println(employees);

        employees.stream().sorted((Employee o1, Employee o2) -> {
            return (int) (o1.getSalary() - o2.getSalary());
        }).forEach((e) -> {
            System.out.println(e);
        });

        employees.stream().sorted(Comparator.comparing((employee) -> employee.getSalary())).forEach((e) -> {
            System.out.println(e);
        });

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }
}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());     //Ascending
    }
}
