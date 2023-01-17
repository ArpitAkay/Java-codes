package org.example;

import org.example.database.EmployeeDatabase;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SupplyAsyncDemo {

    public List<Employee> getEmployees(){
        CompletableFuture<List<Employee>> employees = CompletableFuture.supplyAsync(() -> {
          return EmployeeDatabase::fetchEmployees;
        });
    }

    public static void main(String[] args) {

    }
}
