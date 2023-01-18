package org.example;

import org.example.database.EmployeeDatabase;
import org.example.dto.Employee;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    public List<Employee> getEmployees() throws ExecutionException, InterruptedException {
        CompletableFuture<List<Employee>> employees = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Thread -> " + Thread.currentThread().getName());
                return EmployeeDatabase.fetchEmployees();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        return employees.get();
    }

    public List<Employee> getEmployeesWithCustomExecutor() throws ExecutionException, InterruptedException {
        Executor executor = Executors.newCachedThreadPool();
        CompletableFuture<List<Employee>> employees = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Thread -> " + Thread.currentThread().getName());
                return EmployeeDatabase.fetchEmployees();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }, executor);

        return employees.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();

        List<Employee> employees = supplyAsyncDemo.getEmployees();
        System.out.println(employees.size());
        List<Employee> employees2 = supplyAsyncDemo.getEmployeesWithCustomExecutor();
        System.out.println(employees2.size());

    }
}
