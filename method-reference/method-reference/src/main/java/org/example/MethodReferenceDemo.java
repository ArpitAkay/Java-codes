package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void print(Employee employee){
        System.out.println(employee);
    }

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

//        Anonymous Implementation
        employeeService.loadEmpolyeeFromDB().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });


        //Lambda Implementation
        employeeService.loadEmpolyeeFromDB().forEach((employee) -> {
            System.out.println(employee);
        });

        //Method Reference with custom type
        employeeService.loadEmpolyeeFromDB().forEach(MethodReferenceDemo::print);

        //Method Reference with predefined class
        employeeService.loadEmpolyeeFromDB().forEach(System.out::println);

        List<EmployeeDto> employeeDtos = employeeService.loadEmpolyeeFromDB().stream().map(new Function<Employee, EmployeeDto>() {

            @Override
            public EmployeeDto apply(Employee employee) {
                EmployeeDto employeeDto = new EmployeeDto();
                employeeDto.setId(employee.getId());
                employeeDto.setName(employee.getName());
                employeeDto.setSalary(employee.getSalary());

                return employeeDto;
            }
        }).collect(Collectors.toList());

        System.out.println(employeeDtos);

        List<EmployeeDto> employeeDtos1 = employeeService.loadEmpolyeeFromDB().stream().map((employee) -> {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setName(employee.getName());
            employeeDto.setSalary(employee.getSalary());

            return employeeDto;
        }).collect(Collectors.toList());

        System.out.println(employeeDtos1);

        List<EmployeeDto> employeeDtos2 = employeeService.loadEmpolyeeFromDB().stream().map(
            EmployeeMapper::convertEmployeeToEmployeeDto)
                .collect(Collectors.toList());

        System.out.println(employeeDtos2);


        EmployeeMapper employeeMapper = new EmployeeMapper();
        List<EmployeeDto> employeeDtos3 = employeeService.loadEmpolyeeFromDB().stream().map(
                        employeeMapper::convertEmployeeToEmployeeDtoNonStatic)
                .collect(Collectors.toList());

        System.out.println(employeeDtos3);

        List<String> employeeNames = employeeService.loadEmpolyeeFromDB().stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(employeeNames);

        //reference : constructor -> new
//        EmployeeDto::new;

        EmployeeManager employeeManager = () -> new Employee();
        employeeManager.getEmployee().getEmployeeInfo();

        EmployeeManager employeeManager1 = Employee::new;
        employeeManager1.getEmployee().getEmployeeInfo();

        employeeService.loadEmpolyeeFromDB().stream().map(Employee::getId).map(ArrayList::new).forEach(System.out::println);
    }
}
