package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CreateOptional {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(101, null, "arpitkumar4000@gmail.com", Arrays.asList("6397473077", "6789900987"));


        //There are three ways to create empty method
        //empty - static method
        //of
        //ofNullable

        Optional<Object> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        Optional<String> emailOptional1 = Optional.of(customer.getEmail());
        System.out.println(emailOptional1);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional2);

        //get()
        Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
        if(emailOptional3.isPresent()){
            System.out.println(emailOptional3.get());
        }

        Optional<String> nameOptional4 = Optional.ofNullable(customer.getName());
        System.out.println(nameOptional4.orElse("ayush"));

//        Optional<String> nameOptional5 = Optional.ofNullable(customer.getName());
//        System.out.println(nameOptional5.orElseThrow(() -> new IllegalArgumentException("No name present")));

        String email = emailOptional3.map((e) -> {
            return e.toUpperCase();
        }).orElseGet(() -> {
            return "ayushagrawal4000@gmail.com";
        });
        System.out.println(email);

        Customer customer1 = getCustomerByEmailId("pqr");
    }

    public static Customer getCustomerByEmailId(String email) throws Exception {
        List<Customer> customers = EkartDatabase.getAll();
        Customer customer = customers.stream().filter((e) -> {
            return e.getEmail().equals(email);
        }).findAny().orElseThrow(() -> {
            return new Exception("No customer present with this " + email + " id");
        });

        return customer;
    }
}
