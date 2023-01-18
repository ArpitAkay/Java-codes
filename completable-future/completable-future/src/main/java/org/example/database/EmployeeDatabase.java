package org.example.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> fetchEmployees() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper
                .readValue(new File("employees.json"), new TypeReference<List<Employee>>() {});
    }
}
