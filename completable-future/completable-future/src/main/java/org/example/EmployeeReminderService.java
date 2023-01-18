package org.example;

import org.example.database.EmployeeDatabase;
import org.example.dto.Employee;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class EmployeeReminderService {

    public Void sendReminderToEmployee() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("fetchEmployees : " + Thread.currentThread().getName());
            try {
                return EmployeeDatabase.fetchEmployees();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).thenApply((employees) ->{
            System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().filter((employee) -> {
                return employee.getNewJoiner().equals("TRUE");
            }).collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("filter training not completed employee : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().filter((employee) -> {
                return employee.getLearningPending().equals("TRUE");
            }).collect(Collectors.toList());
        }).thenApply((employees) -> {
            System.out.println("get emails : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().map(Employee::getEmail).collect(Collectors.toList());
        }).thenAccept((emails) -> {
            System.out.println("send emails : " + Thread.currentThread().getName());
            System.out.println(emails.size());
            emails.forEach((email) -> {
                sendEmail(email);
            });
        });

        return voidCompletableFuture.get();
    }

    public static void sendEmail(String email){
        System.out.println("Sending training reminder email to : " + email);
    }

    public Void sendReminderToEmployeeAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("fetchEmployees : " + Thread.currentThread().getName());
            try {
                return EmployeeDatabase.fetchEmployees();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).thenApplyAsync((employees) ->{
            System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().filter((employee) -> {
                return employee.getNewJoiner().equals("TRUE");
            }).collect(Collectors.toList());
        }).thenApplyAsync((employees) -> {
            System.out.println("filter training not completed employee : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().filter((employee) -> {
                return employee.getLearningPending().equals("TRUE");
            }).collect(Collectors.toList());
        }).thenApplyAsync((employees) -> {
            System.out.println("get emails : " + Thread.currentThread().getName());
            System.out.println(employees.size());
            return employees.stream().map(Employee::getEmail).collect(Collectors.toList());
        }).thenAcceptAsync((emails) -> {
            System.out.println("send emails : " + Thread.currentThread().getName());
            System.out.println(emails.size());
            emails.forEach((email) -> {
                sendEmail(email);
            });
        });

        return voidCompletableFuture.get();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        EmployeeReminderService employeeReminderService = new EmployeeReminderService();
//        employeeReminderService.sendReminderToEmployee();
        employeeReminderService.sendReminderToEmployeeAsync();
    }
}
