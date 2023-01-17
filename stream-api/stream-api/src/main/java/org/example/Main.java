package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Create a list and filter all even numbers from list
        List<Integer> numbers1 = List.of(2, 4, 50, 21, 22, 67);
//        numbers1.add(45);        //gives error

        System.out.println(numbers1);

        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(2);
        numbers2.add(4);
        numbers2.add(50);
        numbers2.add(21);
        numbers2.add(22);
        numbers2.add(67);

        List<Integer> numbers3 = Arrays.asList(23, 567, 12, 677, 24);
        System.out.println(numbers3);

        //without stream
        List<Integer> listEven = new ArrayList<Integer>();

        for(Integer i : numbers1){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //with stream
        Stream<Integer> stream = numbers1.stream();
        listEven = stream.filter((i) -> i%2 == 0).collect(Collectors.toList());
        System.out.println(listEven);

        listEven = numbers1.stream().filter((i) -> i>10).collect(Collectors.toList());
        System.out.println(listEven);

    }
}