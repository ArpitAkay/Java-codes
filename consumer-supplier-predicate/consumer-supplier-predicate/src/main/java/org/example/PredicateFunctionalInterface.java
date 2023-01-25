package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {

    public static void main(String[] args){
        PredicateDemo predicateDemo = new PredicateDemo();
        System.out.println(predicateDemo.test(2));

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == 2;
            }
        };
        System.out.println(predicate1.test(24 ));

        Predicate<Integer> predicate2 = (integer) -> {
            return integer == 2;
        };
        System.out.println(predicate2.test(24));

        //filter method always accepts predicate functional interface
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter((e) -> {
            return e%2 == 0;
        }).forEach((e) -> {
            System.out.println(e);
        });
    }

}
