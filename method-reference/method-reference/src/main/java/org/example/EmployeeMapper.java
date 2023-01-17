package org.example;

public class EmployeeMapper {

    public static EmployeeDto convertEmployeeToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSalary(employee.getSalary());

        return employeeDto;
    }

    public EmployeeDto convertEmployeeToEmployeeDtoNonStatic(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSalary(employee.getSalary());

        return employeeDto;
    }
}
