package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaTechieStreamApi {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Arpit");
        list.add("Ayush");
        list.add("Atul");
        list.add("Krishna");
        list.add("Yashraj");

        for(String s : list){
            System.out.println(s);
        }


        list.stream().forEach((e) -> {
            System.out.print(e + " ");
        });

        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        map.entrySet().stream().forEach((e) -> {
            System.out.println(e );
        });


        list.stream().filter((e) -> {
            return e.startsWith("A");
        }).forEach((e) ->{
            System.out.println(e);
        });

        map.entrySet().stream().filter((e) -> {
            return e.getKey()%2 == 0;
        }).forEach((e) ->{
            System.out.println(e);
        });

    }
}
