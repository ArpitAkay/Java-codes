package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args){
        List<Customer> customers = EkartDatabase.getAll();
        List<String> emails = customers.stream().map((e) -> {
            return e.getEmail();
        }).collect(Collectors.toList());
        System.out.println(emails);

        //  one to one mapping
        List<List<String>> phoneNumbers1 = customers.stream().map((e) -> {
            return e.getPhoneNumbers();
        }).collect(Collectors.toList());

        System.out.println(phoneNumbers1);

        // one to many mapping
        List<String> phoneNumbers2 = customers.stream().flatMap((e) -> {
            return e.getPhoneNumbers().stream();
        }).collect(Collectors.toList());

        System.out.println(phoneNumbers2);


    }
}
