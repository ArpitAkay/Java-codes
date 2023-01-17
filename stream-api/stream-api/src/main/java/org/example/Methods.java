package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {

        //filter(predicate)
            //predicate is a boolean value function(true/false)

        //map(Function)
            //helps to perform operation on every element

        List<String> names = List.of("Arpit", "Ayush", "Yashraj", "Krishna", "Atul");
        Stream<String> stream = names.stream();
        List<String> newNames = stream.filter((e) -> {
            if(e.startsWith("A")){
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.println(newNames);


        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 6);
        Stream<Integer> stream1 = numbers.stream();
        List<Integer> newNumbers = stream1.map((i) -> {
            return i*i;
        }).collect(Collectors.toList());

        System.out.println(newNumbers);

        Stream<Integer> stream2 = numbers.stream();
        stream2.forEach((i) ->{
            System.out.println(i);
        });

        Stream<Integer> stream3 = numbers.stream();
        stream3.forEach(System.out::println);

        Stream<Integer> stream4 = numbers.stream();
        stream4.sorted().forEach(System.out::println);

        Stream<Integer> stream5 = numbers.stream();
        Integer num1 = stream5.min((x,y) -> x.compareTo(y)).get();
        System.out.println(num1);

        Stream<Integer> stream6 = numbers.stream();
        Integer num2 = stream6.max((x,y) -> x.compareTo(y)).get();
        System.out.println(num2);

        Stream<Integer> stream7 = numbers.stream();
        long c =  stream7.count();
        System.out.println(c);
    }
}
