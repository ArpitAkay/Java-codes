package org.example.sortlist;

public class Employee {
    private int id;
    private String name;
    private String Department;
    private long salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, long salary) {
        this.id = id;
        this.name = name;
        Department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
